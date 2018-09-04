<#include "header.ftl"/>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header"></h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
    <div class="row">
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-bar-chart-o fa-5x"></i>
                            </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">${count}</div>
                            <div>Java Articles</div>
                            </div>
                        </div>
                    </div>
                <a href="#">
                    <div class="panel-footer">
                        <span class="pull-left">View Details</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            </div>
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-green">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                            </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">${views}</div>
                            <div>Total Views</div>
                            </div>
                        </div>
                    </div>
                <a href="#">
                    <div class="panel-footer">
                        <span class="pull-left">View Details</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            </div>
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-yellow">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-shopping-cart fa-5x"></i>
                            </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">124</div>
                            <div>New Orders!</div>
                            </div>
                        </div>
                    </div>
                <a href="#">
                    <div class="panel-footer">
                        <span class="pull-left">View Details</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            </div>
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-red">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-support fa-5x"></i>
                            </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">13</div>
                            <div>Support Tickets!</div>
                            </div>
                        </div>
                    </div>
                <a href="#">
                    <div class="panel-footer">
                        <span class="pull-left">View Details</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
        <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Manage Posts    <a class="btn btn-primary" href="${springMacroRequestContext.contextPath}/dashboard/new-post">   New Post</a> 
                    </div>
                    <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Title</th>
                                    <th>Category</th>
                                    <th>URL</th>
                                    <th>Tags</th>
                                    <th>Views</th>
                                    <th></th>
                                    </tr>
                                </thead>
                            <tbody>

<#list posts as posts>

                                    <tr>
                                    <td>${posts.post_id}</td>
                                    <td>${posts.post_title}</td>
                                    <td>${posts.post_category?replace("-"," ")?capitalize}</td>
                                    <td>${posts.post_uri}</td>
                                    <td>${posts.post_tags}</td>
                                    <td>${posts.post_views}</td>
                                    <td><a href="${springMacroRequestContext.contextPath}/dashboard/edit-post/${posts.post_id}">Edit</a></td>
                                    </tr>
</#list>
                                </tbody>
                            </table>
                        </div>                        </div>
                            <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
          
        </div>
        <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

            <!-- Example DataTables Card-->

</div>
<!-- /.container-fluid-->
<!-- /.content-wrapper-->

 <#include "footer.ftl"/>
