<#import "/spring.ftl" as spring />
<h2 class="hello-title">Register</h2>

<form action="/register" name="registerForm" method="POST">
    <div>
        <label for="afm">AFM</label>
        <@spring.bind "registerForm.afm"/>
            <input type="afm" name="afm" id="afm" placeholder="afm">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="firstName">First name : </label>
        <@spring.bind "registerForm.firstName"/>
            <input type="firstname" name="firstName" id="firstName" placeholder="firstName">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="lastName">Last name : </label>
        <@spring.bind "registerForm.lastName"/>
            <input type="lastname" name="lastName" id="lastName" placeholder="lastName">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="email">Email : </label>
        <@spring.bind "registerForm.email"/>
            <input type="email" name="email" id="email" placeholder="email">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="address">Address : </label>
        <@spring.bind "registerForm.address"/>
            <input type="address" name="address" id="address" placeholder="address">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="password">Password : </label>
        <@spring.bind "registerForm.password"/>
            <input type="password" name="password" id="password" placeholder="password">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="uType">User Type : </label>
        <@spring.bind "registerForm.uType"/>
            <input type="uType" name="uType" id="uType" placeholder="uType">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="vType">Vehicle Type : </label>
        <@spring.bind "registerForm.vType"/>
            <input type="vType" name="vType" id="vType" placeholder="vType">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="vPlate">Vehicle Plate : </label>
        <@spring.bind "registerForm.VPlate"/>
            <input type="vPlate" name="vPlate" id="vPlate" placeholder="vPlate">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>


    <button type="submit">Register</button>
</form>
