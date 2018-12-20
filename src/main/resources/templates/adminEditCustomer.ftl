<!DOCTYPE html>
<html lang="en">
<head>
    <#import "/spring.ftl" as spring />
    <#include "/partials/head.ftl">
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>
<body>
<div class="container-fluid">
    <form class="form-horizontal"  action="/admin/customers/{u_id}" name="usersEditForm" method="POST">
        <#--<div class="form-group">-->
            <#--<h2 class="col-sm-offset-2 col-sm-4">Edit customer ${usersEditForm.u_id}</h2>-->
        <#--</div>-->
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">AFM:</label>
            <@spring.bind "usersEditForm.afm"/>
            <div class="col-sm-4">
                <input type="number" name="afm" class="form-control" id="afm" placeholder="afm" value="${usersEditForm.afm}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">First Name:</label>
            <@spring.bind "usersEditForm.firstName"/>
            <div class="col-sm-4">
                <input type="text" name="firstName" class="form-control" id="firstName" placeholder="firstName" value="${usersEditForm.firstName}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Last Name:</label>
            <@spring.bind "usersEditForm.lastName"/>
            <div class="col-sm-4">
                <input type="text" name="lastName" class="form-control" id="lastName" placeholder="lastName" value="${usersEditForm.lastName}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <@spring.bind "usersEditForm.email"/>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="email" value="${usersEditForm.email}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Password:</label>
            <@spring.bind "usersEditForm.password"/>
            <div class="col-sm-4">
                <input type="password" name="password" class="form-control" id="password" placeholder="password" value="${usersEditForm.password}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Adress:</label>
            <@spring.bind "usersEditForm.address"/>
            <div class="col-sm-4">
                <input type="text" name="address" class="form-control" id="address" placeholder="address" value="${usersEditForm.address}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle type:</label>
            <@spring.bind "usersEditForm.vType"/>
            <div class="col-sm-4">
                <input type="text" name="vType" class="form-control" id="vType" placeholder="vType" value="${usersEditForm.vType}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle plate:</label>
            <@spring.bind "usersEditForm.VPlate"/>
            <div class="col-sm-4">
                <input type="text" name="VPlate" class="form-control" id="VPlate" placeholder="VPlate" value="${usersEditForm.VPlate}">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Type:</label>
            <@spring.bind "usersEditForm.uType"/>
            <div class="col-sm-4">
                <input type="text" name="uType" class="form-control" id="uType" placeholder="uType" value="${usersEditForm.uType}">
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
                <input type="hidden" class="form-control" name="u_id" id="id" value="${usersEditForm.u_id}">
            </div>
        </div>


</div>
<#include "/partials/scripts.ftl">
</body>
</html>