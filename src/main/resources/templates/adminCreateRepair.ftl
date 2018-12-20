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
    <form class="form-horizontal" name="creationForm" action="/admin/create_repairs" method="post">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Create new repair</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Date:</label>
            <@spring.bind "creationForm.dateTime"/>
            <div class="col-sm-4">
                <input type="date" name="dateTime" class="form-control" id="dateTime" placeholder="dateTime">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">State:</label>
            <@spring.bind "creationForm.rState"/>
            <div class="col-sm-4">
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio" checked>WAITING</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">ONGOING</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">COMPLETED</label>-->
                <input type="text" name="rState" class="form-control" id="rState" placeholder="rState">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Type:</label>
            <@spring.bind "creationForm.rType"/>
            <div class="col-sm-4">
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio" checked>BIG</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">LITTLE</label>-->
                <input type="text" name="rType" class="form-control" id="rType" placeholder="rType">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Cost:</label>
            <@spring.bind "creationForm.rCost"/>
            <div class="col-sm-4">
                <input type="number" name="rCost" class="form-control" id="rCost" placeholder="rCost">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Customer ID:</label>
            <@spring.bind "creationForm.owner"/>
            <div class="col-sm-4">
                <input type="number" name="owner" class="form-control" id="owner" placeholder="owner">
            </div>
            <#list spring.status.errorMessages as error>
                <span>${error}</span>
            </#list>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="comment">Description:</label>
            <@spring.bind "creationForm.description"/>
            <div class="col-sm-4">
                <textarea name="description" class="form-control" rows="5" id="description"></textarea>
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