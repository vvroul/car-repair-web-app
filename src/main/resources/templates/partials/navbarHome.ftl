<#import "/spring.ftl" as spring />
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">TEAM 8 - CarFixALot</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form action="/" name="loginForm" method="POST" class="navbar-form navbar-right">
                <div class="form-group">
                    <@spring.bind "loginForm.email"/>
                    <input type="text" placeholder="email" class="form-control" name="email">
                    <#list spring.status.errorMessages as error>
                        <span>${error}</span>
                    </#list>
                </div>
                <div class="form-group">
                    <@spring.bind "loginForm.password"/>
                    <input type="password" placeholder="password" class="form-control" name="password">
                    <#list spring.status.errorMessages as error>
                        <span>${error}</span>
                    </#list>
                </div>
                <button type="submit" class="btn btn-primary">Sign in</button>
            </form>
        </div><!--/.navbar-collapse -->
    </div>
</nav>