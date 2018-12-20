<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <#import "/spring.ftl" as spring />
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>
<body>
<div class="container-fluid">
    <form class="form-horizontal" action="/admin/{r_id}" name="repairsEditForm" method="POST">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Edit repair </h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="dateTime">Date:</label>
            <div class="col-sm-4">
                <@spring.bind "repairsEditForm.dateTime"/>
                <input value="${repairsEditForm.dateTime}" type="date" class="form-control" id="dateTime" name="dateTime">
                <#list spring.status.errorMessages as error>
                    <span>${error}</span>
                </#list>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">State:</label>
            <div class="col-sm-4">
                <@spring.bind "repairsEditForm.rState"/>
                <input value="${repairsEditForm.rState}" type="text" class="form-control" id="rState" name="rState">
                <#list spring.status.errorMessages as error>
                    <span>${error}</span>
                </#list>
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio" checked>WAITING</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">ONGOING</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">COMPLETED</label>-->
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Type:</label>
            <div class="col-sm-4">
                <@spring.bind "repairsEditForm.rType"/>
                <input value="${repairsEditForm.rType}" type="text" class="form-control" id="rType" name="rType">
                <#list spring.status.errorMessages as error>
                    <span>${error}</span>
                </#list>
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio" checked>BIG</label>-->
                <#--<label class="radio-inline">-->
                    <#--<input type="radio" name="optradio">LITTLE</label>-->
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Cost:</label>
            <div class="col-sm-4">
                <@spring.bind "repairsEditForm.rCost"/>
                <input value="${repairsEditForm.rCost}" type="number" class="form-control" id="rCost" name="rCost">
                <#list spring.status.errorMessages as error>
                    <span>${error}</span>
                </#list>
            </div>
        </div>
        <#--<div class="form-group">-->
            <#--<label class="control-label col-sm-2" for="email">Customer ID:</label>-->
            <#--<div class="col-sm-4">-->
                <#--<input value="${repairsEditForm.owner}" type="text" class="form-control" id="rCost">-->
            <#--</div>-->
        <#--</div>-->
        <div class="form-group">
            <label class="control-label col-sm-2" for="comment">Description:</label>
            <div class="col-sm-4">
                <@spring.bind "repairsEditForm.description"/>
                <textarea class="form-control" rows="5" id="description" name="description">
                    ${repairsEditForm.description}
                </textarea>
                <#list spring.status.errorMessages as error>
                    <span>${error}</span>
                </#list>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <input type="submit" class="btn btn-default">Update</input>
                <input type="hidden" class="form-control" name="r_id" id="id" value="${repairsEditForm.r_id}">
            </div>
        </div>
    </form>
</div>
<#include "/partials/scripts.ftl">
</form>
</body>
</html>