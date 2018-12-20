<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <#import "/spring.ftl" as spring />
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>
<body>

<#include "/partials/navbarAdmin.ftl">

<div class="container-fluid">
    <form action="/admin/register" name="registerForm" method="POST" class="form-horizontal">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Create new customer</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">AFM:</label>
            <@spring.bind "registerForm.afm"/>
            <div class="col-sm-4">
                <input type="number" name="afm" class="form-control" id="afm" placeholder="afm">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">First Name:</label>
            <@spring.bind "registerForm.firstName"/>
            <div class="col-sm-4">
                <input type="text" name="firstName" class="form-control" id="firstName" placeholder="firstName">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Last Name:</label>
            <@spring.bind "registerForm.lastName"/>
            <div class="col-sm-4">
                <input type="text" name="lastName" class="form-control" id="lastName" placeholder="lastName">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <@spring.bind "registerForm.email"/>
            <div class="col-sm-4">
                <input type="email" name="email" class="form-control" id="email" placeholder="email">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Password:</label>
            <@spring.bind "registerForm.password"/>
            <div class="col-sm-4">
                <input type="password" name="password" class="form-control" id="password" placeholder="password">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Address:</label>
            <@spring.bind "registerForm.address"/>
            <div class="col-sm-4">
                <input type="text" name="address" class="form-control" id="address" placeholder="address">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle type:</label>
            <@spring.bind "registerForm.vType"/>
            <div class="col-sm-4">
                <input type="text" name="vType" class="form-control" id="vType" placeholder="vType">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle plate:</label>
            <@spring.bind "registerForm.VPlate"/>
            <div class="col-sm-4">
                <input type="text" name="VPlate" class="form-control" id="VPlate" placeholder="VPlate">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Type:</label>
            <@spring.bind "registerForm.uType"/>
            <div class="col-sm-4">
                <input type="text" name="uType" class="form-control" id="uType" placeholder="uType">
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio" checked>ADMIN</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">USER</label>-->
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>
<#include "/partials/scripts.ftl">
</body>
</html>