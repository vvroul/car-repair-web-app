<#import "/spring.ftl" as spring />

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/dashboard.css" rel="stylesheet">

<body>
<h2>We found you these results : </h2>
<table>
    <h2> User with : </h2>
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