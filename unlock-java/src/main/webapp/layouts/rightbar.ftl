<div class="sidebar">
                


<div class="card my-3 card-inverse card-success">
        <h4 class="card-header">Popular Posts</h4>
        <ul  class="list-group">
                <#list popular as pop>
            <li  class="list-group-item">
                <a href="${springMacroRequestContext.contextPath}/${pop.post_cat_uri}/${pop.post_uri}">${pop.post_title}</a>
                </li>
                </#list>
            </ul>
        </div>


<div class="card my-3 card-inverse card-success">
        <h4 class="card-header">Categories</h4>
        <ul  class="list-group">
        <#list categories as cat>
            <li  class="list-group-item">
                <a href="${springMacroRequestContext.contextPath}/category/${cat.catUrl}">${cat.catName}</a>
                </li>
            </#list>
            </ul>
        </div>

<div class="card my-3 card-inverse card-success">
        <h4 class="card-title">Card title</h4>
        <div class="panel-body">
            <ul class="list-inline">
                <li><a href="#">Aries</a></li>
                <li><a href="#">Fire</a></li>
                <li><a href="#">Mars</a></li>
                <li><a href="#">Taurus</a></li>
                <li><a href="#">Earth</a></li>
                <li><a href="#">Moon</a></li>
                <li><a href="#">Gemini</a></li>
                <li><a href="#">Air</a></li>
                <li><a href="#">Mercury</a></li>
                <li><a href="#">Cancer</a></li>
                </ul>
            </div>
        </div>
            <!-- Other widgets -->
    </div>