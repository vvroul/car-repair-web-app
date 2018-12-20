<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>

<#include "/partials/navbarAdmin.ftl">

<body>
<div class="container-fluid">
    <div class="page-header">
        <h1>Results : </h1>
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
                <#list adminRepairs as r>
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