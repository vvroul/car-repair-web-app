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
            <h2 class="col-sm-offset-2 col-sm-4">Create new repair</h2>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Date:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">State:</label>
            <div class="col-sm-4">
                <label class="radio-inline">
                    <input type="radio" name="optradio" checked>WAITING</label>
                <label class="radio-inline">
                    <input type="radio" name="optradio">ONGOING</label>
                <label class="radio-inline">
                    <input type="radio" name="optradio">COMPLETED</label>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Type:</label>
            <div class="col-sm-4">
                <label class="radio-inline">
                    <input type="radio" name="optradio" checked>BIG</label>
                <label class="radio-inline">
                    <input type="radio" name="optradio">LITTLE</label>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Cost:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Customer ID:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="email" placeholder="Enter email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="comment">Description:</label>
            <div class="col-sm-4">
                <textarea class="form-control" rows="5" id="comment"></textarea>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-4">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>
<#include "/partials/scripts.ftl">
</body>
</html>