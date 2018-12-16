<#import "/spring.ftl" as spring />
<h2 class="hello-title">Edit
</h2>

<form action="/admin/repairs/{r_id}" name="repairsEditForm" method="POST">
    <#--<div>-->
    <#--<label for="afm">AFM</label>-->
    <#--<@spring.bind "usersEditForm.afm"/>-->
    <#--<input type="afm" name="afm" id="afm" placeholder="afm">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <div>
        <label for="dateTime">Date time : </label>
        <@spring.bind "repairsEditForm.dateTime"/>
        <input type="date" name="dateTime" id="dateTime" placeholder="dateTime" value="${repairsEditForm.dateTime}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rType">Repair Type : </label>
        <@spring.bind "repairsEditForm.rType"/>
        <input type="text" name="rType" id="rType" placeholder="rType" value="${repairsEditForm.rType}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <#--<div>-->
    <#--<label for="email">Email : </label>-->
    <#--<@spring.bind "registerForm.email"/>-->
    <#--<input type="email" name="email" id="email" placeholder="email">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <#--<div>-->
    <#--<label for="address">Address : </label>-->
    <#--<@spring.bind "registerForm.address"/>-->
    <#--<input type="address" name="address" id="address" placeholder="address">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <#--<div>-->
    <#--<label for="password">Password : </label>-->
    <#--<@spring.bind "registerForm.password"/>-->
    <#--<input type="password" name="password" id="password" placeholder="password">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <#--<div>-->
    <#--<label for="uType">User Type : </label>-->
    <#--<@spring.bind "registerForm.uType"/>-->
    <#--<input type="uType" name="uType" id="uType" placeholder="uType">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <#--<div>-->
    <#--<label for="vType">Vehicle Type : </label>-->
    <#--<@spring.bind "registerForm.vType"/>-->
    <#--<input type="vType" name="vType" id="vType" placeholder="vType">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <#--<div>-->
    <#--<label for="vPlate">Vehicle Plate : </label>-->
    <#--<@spring.bind "registerForm.VPlate"/>-->
    <#--<input type="vPlate" name="vPlate" id="vPlate" placeholder="vPlate">-->
    <#--<#list spring.status.errorMessages as error>-->
    <#--<span>${error}</span>-->
    <#--</#list>-->
    <#--</div>-->

    <input type="submit"  value="Update"/>
    <input type="hidden" class="form-control" name="r_id" id="id" value="${repairsEditForm.r_id}">

</form>
