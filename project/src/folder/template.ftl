<users>

    <#list sedat  as user>
    <user>
        <username>${user.userName}</username>
        <firstname>${user.firstName}</firstname>
        <lastname>${user.lastName}</lastname>
        <email>>${user.email}</email>
        <roles>
            <#list user.role  as s>
            <role>${s}</role>
            </#list>

        </roles>
    </user>

    </#list>
</users>




