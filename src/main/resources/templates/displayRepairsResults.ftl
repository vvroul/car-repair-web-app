<#import "/spring.ftl" as spring />
<h2 class="hello-title">Repair results </h2>
<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/dashboard.css" rel="stylesheet">

<body>
<h2>We found you these repair results : </h2>
    <p><ul>
            <#list adminRepairs as r>
            <li>
    <p> ${r.dateTime!""}</p>
    <p> ${r.rState!""}</p>
    <p> ${r.rType!""}</p>
    <p> ${r.rCost!""}</p>
    <p> ${r.description!""}</p>
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