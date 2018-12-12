<#import "/spring.ftl" as spring />
<h2 class="hello-title">Search</h2>

<!-- Bootstrap core CSS -->
<link href="../static/bootstrap.min.css" rel="stylesheet">
<link href="../static/dashboard.css" rel="stylesheet">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12 main">
            <h1 class="page-header">Search</h1>
            <form action="/search" class="form-horizontal" id="register">
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="email">Email</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="email" name="email" placeholder="Email" type="email">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="username">AFM</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="aFM" name="aFM" placeholder="aFM" type="text">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-1 col-sm-11">
                        <button class="btn btn-default" type="reset">Reset</button>
                        <button class="btn btn-primary" type="submit">Sign in</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>