<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>
<body>

<#include "/partials/navbarAdmin.ftl">

<div class="container-fluid">
    <div class="page-header">
        <h1>Ten latest repairs:</h1>
    </div>
    <div class="row">
        <div class="col-md-6">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Date</th>
                    <th>State</th>
                    <th>Type</th>
                    <th>Cost</th>
                    <th>Description</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <td>dummy date</td>
                    <td>dummy state</td>
                    <td>dummy type</td>
                    <td>1</td>
                    <td>dummy description</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

</div>
<#include "/partials/scripts.ftl">
</body>
</html>