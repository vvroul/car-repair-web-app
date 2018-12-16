<#import "/spring.ftl" as spring />
<h2 class="hello-title">Edit
</h2>

<form action="/admin/customers/{u_id}" name="usersEditForm" method="POST">
    <#--<div>-->
        <#--<label for="afm">AFM</label>-->
        <#--<@spring.bind "usersEditForm.afm"/>-->
            <#--<input type="afm" name="afm" id="afm" placeholder="afm" value="${usersEditForm.afm}">-->
        <#--<#list spring.status.errorMessages as error>-->
            <#--<span>${error}</span>-->
        <#--</#list>-->
    <#--</div>-->

    <div>
        <label for="firstName">First name : </label>
        <@spring.bind "usersEditForm.firstName"/>
            <input type="firstname" name="firstName" id="firstName" placeholder="firstName" value="${usersEditForm.firstName}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="lastName">Last name : </label>
        <@spring.bind "usersEditForm.lastName"/>
            <input type="lastname" name="lastName" id="lastName" placeholder="lastName" value="${usersEditForm.lastName}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="email">Email : </label>
        <@spring.bind "usersEditForm.email"/>
            <input type="email" name="email" id="email" placeholder="email" value="${usersEditForm.email}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="address">Address : </label>
        <@spring.bind "usersEditForm.address"/>
            <input type="address" name="address" id="address" placeholder="address" value="${usersEditForm.address}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="password">Password : </label>
        <@spring.bind "usersEditForm.password"/>
            <input type="password" name="password" id="password" placeholder="password" value="${usersEditForm.password}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="uType">User Type : </label>
        <@spring.bind "usersEditForm.uType"/>
            <input type="uType" name="uType" id="uType" placeholder="uType" value="${usersEditForm.uType}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="vType">Vehicle Type : </label>
        <@spring.bind "usersEditForm.vType"/>
            <input type="vType" name="vType" id="vType" placeholder="vType" value="${usersEditForm.vType}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <#--<div>-->
        <#--<label for="vPlate">Vehicle Plate : </label>-->
        <#--<@spring.bind "usersEditForm.VPlate"/>-->
            <#--<input type="vPlate" name="vPlate" id="vPlate" placeholder="vPlate" value="${usersEditForm.VPlate}">-->
        <#--<#list spring.status.errorMessages as error>-->
            <#--<span>${error}</span>-->
        <#--</#list>-->
    <#--</div>-->

        <input type="submit"  value="Update"/>
        <input type="hidden" class="form-control" name="u_id" id="id" value="${usersEditForm.u_id}">

</form>
