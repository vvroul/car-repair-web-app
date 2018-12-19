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
        <h1>Repair search results:</h1>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Date</th>
                    <th>State</th>
                    <th>Type</th>
                    <th class="col-sm-1">Cost</th>
                    <th class="col-sm-3">Description</th>
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