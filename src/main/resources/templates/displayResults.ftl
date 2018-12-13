<#import "/spring.ftl" as spring />

<!-- Bootstrap core CSS -->
<link href="../static/css/bootstrap.min.css" rel="stylesheet">
<link href="../static/css/dashboard.css" rel="stylesheet">

<body>
<h2>We found you these results : </h2>
<table>
    <tr>
        <td>AFM :</td>
        <td>${aFM!""}</td>
    </tr>
    <tr>
        <td>EMAIL :</td>
        <td>${email!""}</td>
    </tr>
</table>
</body>