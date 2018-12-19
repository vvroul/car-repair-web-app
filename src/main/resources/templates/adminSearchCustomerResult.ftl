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
        <h1>Customer search results:</h1>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>#</th>
                    <th>AFM</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Adress</th>
                    <th>Vehicle Type</th>
                    <th>Vehicle Plate</th>
                    <th>Type</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <th>12345689</th>
                    <th>John</th>
                    <th>Smith</th>
                    <th>johnsmith@mail.com</th>
                    <th>98654321</th>
                    <th>pera street 15</th>
                    <th>Honda</th>
                    <th>ABC-1234</th>
                    <th>USER</th>
                    <th class="col-sm-1">
                        <button type="button" class="btn btn-primary btn-block">Edit</button>
                    </th>
                    <th class="col-sm-1">
                        <button type="button" class="btn btn-danger btn-block">Delete</button>
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