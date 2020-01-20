import java.io.*;
import java.util.*;

import com.opencsv.CSVReader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Project {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        try {

            Template template = cfg.getTemplate("src/folder/template.ftl");
            Map<String, Object> user = new HashMap<String, Object>();
            Map<String, User> userMap =  new HashMap<String, User>();

            String csvFile = "C:\\Users\\vestr\\Desktop\\project\\src\\folder\\input.csv";//csv oper

            CSVReader reader = null;
            try {
                reader = new CSVReader(new FileReader(csvFile));
                String[] line;


                while ((line = reader.readNext()) != null) {

                    final String userName = line[0];
                    final String firstName = line[1];
                    final String lastName = line[2];
                    final String email = line[3];
                    final String roleCode = line[4];

                    if(userMap.get(userName) != null) {
                        userMap.get(userName).getRole().add(roleCode);
                    } else {
                        User u = new User();
                        u.setUserName(userName);
                        u.setFirstName(firstName);
                        u.setLastName(lastName);
                        u.setEmail(email);
                        List<String> roleList = new ArrayList<String>();
                        roleList.add(roleCode);
                        u.setRole(roleList);
                        userMap.put(userName,u);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }//csv close

            user.put("sedat", new ArrayList<User>(userMap.values()));
            Writer out = new OutputStreamWriter(System.out);
            template.process(user, out);
            out.flush();


            Writer file = new FileWriter(new File("C:\\Users\\vestr\\Desktop\\project\\src\\folder\\output.xml"));
            template.process(user, file);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }


    }
}
