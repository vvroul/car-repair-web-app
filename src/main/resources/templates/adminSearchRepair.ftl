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
    <form class="form-horizontal" action="/admin/repairsSearch" method="POST">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Search Repairs</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">AFM:</label>
            <div class="col-sm-4">
                <input type="text" name="aFM" class="form-control" id="email" placeholder="AFM">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle Plate:</label>
            <div class="col-sm-4">
                <input type="text" name="vPlate" class="form-control" id="email" placeholder="Vehicle Plate">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Date:</label>
            <div class="col-sm-4">
                <input type="date" name="dateTime" class="form-control" id="email" placeholder="Date">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <button type="submit" class="btn btn-default">Search</button>
            </div>
        </div>
    </form>
</div>

<div class="container-fluid">
    <div class="page-header">
        <h1>All repairs :</h1>
    </div>
    <div class="row">
        <div class="col-md-6">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <#--<th>#</th>-->
                    <th>Date</th>
                    <th>State</th>
                    <th>Type</th>
                    <th>Cost</th>
                    <th>Description</th>
                </tr>
                </thead>
                <#list theRepairs as r>
                    <tbody>
                    <tr>
                <#--<td>1</td>-->
                    <td>${r.dateTime!""}</td>
                    <td>${r.rState!""}</td>
                    <td>${r.rType!""}</td>
                    <td>${r.rCost!""}</td>
                    <td>${r.description!""}</td>
                    <th class="col-sm-1">
                <a class="btn btn-primary btn-block" href="/admin/repairs/${r.r_id}">Edit</a>
                    </th>
                    <th class="col-sm-1">
                <a class="btn btn-danger btn-block" href="/admin/repairs/${r.r_id}/delete" >Delete</a>
                    </th>
                    </tr>
                    </tbody>
                </#list>
            </table>
        </div>
    </div>
</div>
<#include "/partials/scripts.ftl">
</body>
</html>