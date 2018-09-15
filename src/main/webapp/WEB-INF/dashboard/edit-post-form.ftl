<#include "header.ftl"/>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Edit: ${post.post_title}</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>

    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Manage Posts
                    </div>
                    <!-- /.panel-heading -->
                <div class="panel-body">

                    <form class="form-horizontal" action="${springMacroRequestContext.contextPath}/dashboard/update-post" method="post" name="post">
                        <fieldset>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="post_title"></label>  
                                <div class="col-sm-12">
                                    <input id="post_title" name="post_title" value="${post.post_title}" class="form-control input-md" required="" type="text">
                                    </div>
                                </div>
                            <input id="post_id" name="post_id" value="${post.post_id}" type="hidden">
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="post_title"></label>  
                                <div class="col-sm-12">
                                    <textarea name="post_content" id="txtEditor">${post.post_content}</textarea> 
                                    <script type="text/javascript">
                                CKEDITOR.replace( 'txtEditor' );
                                        </script>
                                    </div>
                                </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="post_category"></label>
                                <div class="col-sm-12">
                                    <select id="post_category" name="post_category" class="form-control">
                                        <#list categories as cat>
                                        <option value="${cat.catUrl}">${cat.catName}</option>
                                        </#list>
                                        </select>
                                    </div>
                                </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for="post_tags"></label>  
                                <div class="col-sm-12">
                                    <input id="post_tags" name="post_tags" value="${post.post_tags}" class="form-control input-md" type="text">
                                    </div>
                                </div>
                            <div class="form-group">
                                <label class="col-md-4 control-label" for=""></label>
                                <div class="col-sm-10">
                                    <textarea name="post_content" id="submitText" style="display:none;"></textarea>
                                    <button>Update</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>

                 <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->

                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->
        </div>
            <#include "footer.ftl"/>
