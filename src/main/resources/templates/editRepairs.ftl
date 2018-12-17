<#import "/spring.ftl" as spring />
<h2 class="hello-title">Edit
</h2>

<form action="/admin/repairs/{r_id}" name="repairsEditForm" method="POST">

    <div>
        <label for="dateTime">Date time : </label>
        <@spring.bind "repairsEditForm.dateTime"/>
        <input type="date" name="dateTime" id="dateTime" placeholder="dateTime" value="${repairsEditForm.dateTime}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rState">Repair State : </label>
        <@spring.bind "repairsEditForm.rState"/>
        <input type="text" name="rState" id="rState" placeholder="rState" value="${repairsEditForm.rState}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rType">Repair Type : </label>
        <@spring.bind "repairsEditForm.rType"/>
        <input type="text" name="rType" id="rType" placeholder="rType" value="${repairsEditForm.rType}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rCost">Repair Cost : </label>
        <@spring.bind "repairsEditForm.rCost"/>
        <input type="text" name="rCost" id="rCost" placeholder="rCost" value="${repairsEditForm.rCost}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="description">Description : </label>
        <@spring.bind "repairsEditForm.description"/>
        <input type="text" name="description" id="description" placeholder="description" value="${repairsEditForm.description}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>


    <input type="submit"  value="Update"/>
    <input type="hidden" class="form-control" name="r_id" id="id" value="${repairsEditForm.r_id}">

</form>
