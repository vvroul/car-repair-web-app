<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/partials/head.ftl">
    <title>MASTER</title>
</head>
<body>
<div class="container-fluid">
    <form class="form-horizontal" action="#">
        <div class="form-group">
            <h2 class="col-sm-offset-2 col-sm-4">Edit customer "..u_id.."</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">AFM:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">First Name:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Last Name:</label>
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
            <label class="control-label col-sm-2" for="email">Password:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Adress:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle type:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Vehicle plate:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Type:</label>
            <div class="col-sm-4">
                <label class="radio-inline">
                    <input type="radio" name="optradio" checked>ADMIN</label>
                <label class="radio-inline">
                    <input type="radio" name="optradio">USER</label>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>


</div>
<#include "/partials/scripts.ftl">
</body>
</html>