<#macro categoriesLayout>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A Bootstrap Blog Template">
        <title>${title?capitalize}</title>
            <#include "layouts/header.ftl"/>
    <div id="body" class="container-fluid">
        <div class="row">

                    <#include "layouts/postbycategories.ftl"/>
                <#include "layouts/leftbar.ftl"/>
            <#nested/>

            <#include "layouts/rightbar.ftl"/>
            </div>
        </div>
            <#include "layouts/footer.ftl"/>
</#macro>