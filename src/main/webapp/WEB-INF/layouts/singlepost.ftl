<div class="col-sm-7 push-sm-2">
    <article>
                <div class="card mb-7">
            <h2  class="card-header">${post.post_title}</h2>
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
            <p class="card-text">${post.post_content}</p>
            </div>
        <div class="card-footer text-muted">
                    Tags: 
                    <#list post.post_tags?split(",") as x>
                <span class="badge badge-pill badge-default">${x}</span>
                    </#list>
                    </div>
        </article>
    </div>