<div class="col-sm-2 pull-sm-7">
    
<div class="card my-2 card-inverse card-success">
    <div class="card-header">
            <h4>Tutorials</h4>
            </div>
        <ul  class="list-group">
        <#list categories as cat>
            <li  class="list-group-item">
                <a href="${springMacroRequestContext.contextPath}/category/${cat.catUrl}">${cat.catName}</a>
                </li>
            </#list>
            </ul>
        </div>


<div class="card my-2 card-inverse card-success">
    <div class="card-header">
            <h4>Recent Comments</h4>
            </div>
        <ul class="list-group">
            <li class="list-group-item"><a href="#">I don't believe in astrology but still your writing style is really great! - <em>john</em></a></li>
            <li class="list-group-item"><a href="#">Wow.. what you said is really true! I'm an aries though - <em>Anto</em></a></li>
            <li class="list-group-item"><a href="#">Does capricorn and aries is compatibile? - <em>Sarah</em></a></li>
            <li class="list-group-item"><a href="#">I'm a cancer woman been in love with Leo. Will this work? - <em>Mary</em></a></li>
            </ul>
        </div>
<div class="card my-2 card-inverse card-success">
    <div class="card-header">
            <h4>Tags</h4>
            </div>
        <div class="card-body">
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
