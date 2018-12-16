<#import "/spring.ftl" as spring />
<h2 class="hello-title">Repairs </h2>

<link rel="stylesheet" type="text/css" href="../css/dashboard.css">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">

<body>


<#--/////////  Search form-->
    <h2>Search for a repair : </h2>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12 main">
                <form method="post" action="/admin/repairsSearch" class="form-horizontal" id="repairsSearch">
                    <div class="form-group">
                        <label class="col-sm-1 control-label" for="vPlate">Plate </label>
                        <div class="col-sm-11">
                            <input class="form-control" id="vPlate" name="vPlate" placeholder="vPlate" type="vPlate">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-1 control-label" for="aFM">AFM</label>
                        <div class="col-sm-11">
                            <input class="form-control" id="aFM" name="aFM" placeholder="aFM" type="text">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-1 control-label" for="dateTime">Datetime</label>
                        <div class="col-sm-11">
                            <input class="form-control" id="dateTime" name="dateTime" placeholder="dateTime" type="date">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-1 col-sm-11">
                            <button class="btn btn-primary" type="submit">Search repair</button>
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
        <form method="get" action="/admin/create_repairs">
            <input type="submit" value="Create" />
        </form>
    </div>
    </p>

<#--END OF Crate button-->
<p>
    <ul>
        <#list theRepairs as r>
        <li>
    <p> ${r.dateTime!""}</p>
    <p> ${r.rState!""}</p>
    <p> ${r.rType!""}</p>
    <p> ${r.rCost!""}</p>
    <p> ${r.description!""}</p>
        <div>
        <td>
        <a class="btn" href="/admin/repairs/${r.r_id}">Update</a>
        </td>
        </div>
    <div>
          <a class="btn" href="/admin/repairs/${r.r_id}/delete" >Delete</a>
    </div>
    </li>
</#list>

</ul>

</p>
</body>