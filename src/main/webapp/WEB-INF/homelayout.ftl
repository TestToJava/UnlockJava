<#import "/spring.ftl" as spring />
<#macro homeLayout>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="${desc}">
    <meta name="author" content="${auther}">
        <title>${title}</title>
            <#include "layouts/header.ftl"/>
    <div id="body" class="container">
        <div class="inner-content">
                    <#include "layouts/latestpost.ftl"/>
               <!-- <#include "layouts/leftbar.ftl"/> -->
           <#include "layouts/rightbar.ftl"/>
        </div>

        </div>
           <!-- <#include "layouts/footer.ftl"/> -->
</#macro>