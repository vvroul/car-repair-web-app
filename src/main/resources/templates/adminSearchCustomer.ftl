<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>
<body>

<#include "/partials/navbarAdmin.ftl">

<div class="container-fluid">
    <form class="form-horizontal" action="/admin/searchCustomer" method="POST">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Search Customers</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">AFM:</label>
            <div class="col-sm-4">
                <input type="number" name="aFM" class="form-control" id="AFM" placeholder="AFM">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-4">
                <input type="email" name="email" class="form-control" id="email" placeholder=Email">
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
        <h1>All users :</h1>
    </div>
    <div class="row">
        <div class="col-md-6">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <#--<th>#</th>-->
                    <th>First name</th>
                    <th>Last name</th>
                </tr>
                </thead>
                <#list users as u>
                    <tbody>
                    <tr>
                <#--<td>1</td>-->
                    <td>${u.firstName!""}</td>
                    <td>${u.lastName!""}</td>
                    <th class="col-sm-1">
                <a class="btn btn-primary btn-block" href="/admin/customers/${u.u_id}">Edit</a>
                    </th>
                    <th class="col-sm-1">
                <a class="btn btn-danger btn-block" href="/admin/customers/${u.u_id}/delete" >Delete</a>
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