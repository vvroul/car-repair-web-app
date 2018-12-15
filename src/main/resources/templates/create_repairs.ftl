<#import "/spring.ftl" as spring />
<h2 class="hello-title">Create New Repair</h2>

<form action="/admin/create_repairs" name="creationForm" method="POST">
    <div>
        <label for="dateTime">DateTime</label>
        <@spring.bind "creationForm.dateTime"/>
            <input type=date name="dateTime" id="dateTime" placeholder="dateTime">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rState">RepairState</label>
        <@spring.bind "creationForm.rState"/>
            <input type="rState" name="rState" id="rState" placeholder="rState">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rType">RepairType</label>
        <@spring.bind "creationForm.rType"/>
            <input type="rType" name="rType" id="rType" placeholder="rType">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="rCost">RepairCost</label>
        <@spring.bind "creationForm.rCost"/>
            <input type="rCost" name="rCost" id="rCost" placeholder="rCost">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="owner">Owner</label>
        <@spring.bind "creationForm.owner"/>
            <input type="owner" name="owner" id="owner" placeholder="owner">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div>
        <label for="description">Description</label>
        <@spring.bind "creationForm.description"/>
            <input type="description" name="description" id="description" placeholder="description">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>




    <button type="submit">Create New Repair</button>
</form>
