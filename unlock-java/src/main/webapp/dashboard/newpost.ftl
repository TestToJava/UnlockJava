<#import "/spring.ftl" as spring/>
<!DOCTYPE HTML>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="${springMacroRequestContext.contextPath}/js/jquery-2.0.3.min.js"></script>
        <script src="${springMacroRequestContext.contextPath}/js/bootstrap.min.js"></script>
        <script src="${springMacroRequestContext.contextPath}/js/editor.js"></script>
        <script>
           $(document).ready(function() {
                   $("#txtEditor").Editor();
           });
            </script>
        <script>
           $(document).ready(function(){
              $("button").click(function(){
                
                  $('#submitText').val(
                                   $("#txtEditor").Editor("getText")
                           );
           //           alert($("#txtEditor").Editor("getText"));
              });
           });
            </script>
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/bootstrap.min.css">
        <link rel="stylesheet" href="${springMacroRequestContext.contextPath}/css/font-awesome.min.css">
        <link href="${springMacroRequestContext.contextPath}/css/editor.css" type="text/css" rel="stylesheet"/>
        <title>Add New Post</title>
        </head>
    <body>
        <div class="col-md-10 col-md-offset-2">
            <form class="form-horizontal" action="add-post" method="post" name="post">
                <fieldset>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="post_title"></label>  
                        <div class="col-sm-10">
                            <input id="post_title" name="post_title" placeholder="Article Title" class="form-control input-md" required="" type="text">
                            </div>
                        </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="post_title"></label>  
                        <div class="col-sm-10">
                            <textarea id="txtEditor"></textarea> 
                            </div>
                        </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="post_category"></label>
                        <div class="col-sm-10">
                            <select id="post_category" name="post_category" class="form-control">
                                <option value="java-tutorial">Java Tutorial</option>
                                <option value="spring-tutorial">Spring Tutorial</option>
                                <option value="spring-tutorial">Spring Boot Tutorial</option>
                                <option value="hibernate-tutorial">Hibernate Tutorial</option>
                                <option value="restful-tutorial">RestFul Tutorial</option>
                                <option value="soap-tutorial">Soap Tutorial</option>
                                <option value="jsp-tutorial">Jsp Tutorial</option>
                                <option value="servlet-tutorial">Servlet Tutorial</option>
                                </select>
                            </div>
                        </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="post_tags"></label>  
                        <div class="col-sm-10">
                            <input id="post_tags" name="post_tags" placeholder="Tags" class="form-control input-md" type="text">
                            </div>
                        </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for=""></label>
                        <div class="col-sm-10">
                            <textarea name="post_content" id="submitText" style="display:none;"></textarea>
                            <button>Submit</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </body>
    </html>

