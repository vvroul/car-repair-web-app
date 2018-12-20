<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <#import "/spring.ftl" as spring />
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>

<#include "/partials/navbarAdmin.ftl">

<body>
<div class="container-fluid">
    <div class="page-header">
        <h1>Customer search results:</h1>
    </div>
    <div class="row">
        <div class="col-md-4">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <#--<th>#</th>-->
                    <th>AFM</th>
                    <th>Email</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <#--<td>1</td>-->
                    <th>${aFM}</th>
                    <th>${email}</th>
                    <th class="col-sm-1">
                        <a class="btn btn-primary btn-block" href="/admin/customers/${u_id}">Edit</a>
                    </th>
                    <th class="col-sm-1">
                        <a class="btn btn-danger btn-block" href="/admin/customers/${u_id}/delete" >Delete</a>
                    </th>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<#include "/partials/scripts.ftl">
</body>
</html>