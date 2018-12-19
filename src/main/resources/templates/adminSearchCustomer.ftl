<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <title>AUTO REPAIRS "TEAM-8"</title>
</head>
<body>

<#include "/partials/navbarAdmin.ftl">

<div class="container-fluid">
    <form class="form-horizontal" action="#">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Search Customers</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">AFM:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <button type="submit" class="btn btn-default">Search</button>
            </div>
        </div>
    </form>
</div>
<#include "/partials/scripts.ftl">
</body>
</html>