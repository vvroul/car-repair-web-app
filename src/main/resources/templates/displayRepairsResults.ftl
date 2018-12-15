<#import "/spring.ftl" as spring />
<h2 class="hello-title">Repair results </h2>
<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/dashboard.css" rel="stylesheet">

<body>
<h2>We found you these repair results : </h2>
<table>
    <h2> Repair with : </h2>
    <tr>
        <td>Datetime :</td>
        <td>${dateTime!""}</td>
    </tr>
    <tr>
        <td>AFM :</td>
        <td>${aFM!""}</td>
    </tr>
    <tr>
        <td>Plate :</td>
        <td>${vPlate!""}</td>
    </tr>
</table>
</body>