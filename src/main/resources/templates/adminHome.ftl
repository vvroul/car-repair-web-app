<#import "/spring.ftl" as spring />
<h2 class="hello-title">Top 10 Repairs :  </h2>
<!-- Bootstrap core CSS -->

<body>
<h2> Top 10 : </h2>
<p><ul>
        <#list topRepairs as r>
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