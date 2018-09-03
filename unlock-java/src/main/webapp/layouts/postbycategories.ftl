<div class="col-sm-7 push-sm-2">
    <#list posts as post>
                    <div class="card mb-7">
        <a href="${springMacroRequestContext.contextPath}/${post.post_cat_uri}/${post.post_uri}">
            <h3  class="card-header">${post.post_title}</h3></a>
            <div class="card-block">
        <div class="row">
            <div class="group1 col-sm-6 col-md-6">
                <span class="glyphicon glyphicon-folder-open"></span>
                <a class="badge badge-pill badge-success" href="${springMacroRequestContext.contextPath}/category/${post.post_category}">${post.post_category?replace("-"," ")?capitalize}</a>
                </div>
            <div class="group2 col-sm-6 col-md-6">
                <i class="fa fa-eye"></i> ${post.post_views} Views
                <i class="fa fa-calendar"></i> ${post.post_created_date}
                </div>
            </div>  
                <hr>
        <p class="card-text">${post.post_expert?substring(0, 250)}...</p>
    </div>
        <p class="text-right">
            <a class="btn btn-info" href="${springMacroRequestContext.contextPath}/${post.post_cat_uri}/${post.post_uri}">
                Continue reading...
                </a>
            </p>
        </div>
    <hr>
    </#list>
    </div>