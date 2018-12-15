<#import "/spring.ftl" as spring />
<h2 class="hello-title">Customers </h2>

<link rel="stylesheet" type="text/css" href="../css/customers.css">
<link rel="stylesheet" type="text/css" href="../css/dashboard.css">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">

<body>


<#--/////////  Search form-->
<h2>Search for a customer : </h2>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12 main">
            <form method="post" action="/search" class="form-horizontal" id="search">
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="email">Email</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="email" name="email" placeholder="email" type="email">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-1 control-label" for="aFM">AFM</label>
                    <div class="col-sm-11">
                        <input class="form-control" id="aFM" name="aFM" placeholder="aFM" type="text">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-1 col-sm-11">
                        <button class="btn btn-primary" type="submit">Search</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<#--END OF Search form-->

<#--/////////  Create button-->
<p>
    <div>
        <form method="get" action="/register">
            <input type="submit" value="Create" />
        </form>
    </div>
</p>

<#--END OF Crate button-->
<p>
    <ul>
        <#list users as u>
        <li>
        <p> ${u.firstName}</p>
        <p> ${u.lastName}</p>
        <p> ${u.aFM}</p>
        <div>
            <form method="" action="/">
                <input type="submit" value="Update" />
            </form>
        </div>
        <div>
        <form method="" action="/">
            <input type="submit" value="Delete" />
        </form>
        </div>
        </li>
        </#list>

    </ul>

</p>
</body>