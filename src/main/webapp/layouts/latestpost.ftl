<div class="mainbar">
	<div class="subheader">
		<h1 id="h-top-questions">Top Questions</h1>

		<div id="tabs">
			<a href="?tab=interesting" data-nav-xhref=""
				title="Questions that may be of interest to you based on your history and tag preference"
				data-value="interesting" data-shortcut=""> interesting</a> <a
				class="youarehere " href="?tab=featured" data-nav-xhref=""
				title="Questions with an active bounty" data-value="featured"
				data-shortcut="B"> <span class="bounty-indicator-tab">345</span>
				featured
			</a> <a href="?tab=hot" data-nav-xhref=""
				title="Questions with the most views, answers, and votes over the last few days"
				data-value="hot" data-shortcut="H"> hot</a> <a href="?tab=week"
				data-nav-xhref=""
				title="Questions with the most views, answers, and votes this week"
				data-value="week" data-shortcut="W"> week</a> <a href="?tab=month"
				data-nav-xhref=""
				title="Questions with the most views, answers, and votes this month"
				data-value="month" data-shortcut="M"> month</a>
		</div>
	</div>

	<div id="qlist-wrapper">
		<div id="question-mini-list">
			<div>
				<#list latest as latest>
				<div class="question-summary narrow">
					<div class="cp">
						<div class="votes">
							<div class="mini-counts">
								<span title="4 votes">4</span>
							</div>
							<div>votes</div>
						</div>
						<div class="status answered">
							<div class="mini-counts">
								<span title="1 answer">1</span>
							</div>
							<div>answer</div>
						</div>
						<div class="views">
							<div class="mini-counts">
								<span title="${latest.post_views} views">${latest.post_views}</span>
							</div>
							<div>views</div>
						</div>
					</div>
					<div class="summary">

						<div class="bounty-indicator"
							title="this question has an open bounty worth 50 reputation">+50</div>
						<h3>
							<a class="question-hyperlink"
								href="${latest.post_cat_uri}/${latest.post_uri}">${latest.post_title}</a>
						</h3>
						<div class="tags">
							<#list latest.post_tags?split(",") as x> <a
								class="post-tag" href="#">${x}</a> </#list>
						</div>
						<div class="started">
							<a
								href="/questions/49933987/aws-sns-subscription-keeps-deleting-the-subscription-itself/?lastactivity"
								class="started-link">answered <span
								title="2018-04-29 16:55:58Z" class="relativetime">3 hours
									ago</span></a> <a href="/users/1054268/thomasvdberge">ThomasVdBerge</a> <span
								class="reputation-score" title="reputation score " dir="ltr">1,454</span>
						</div>
					</div>
				</div>
				</#list>

			</div>
		</div>
	</div>
</div>

<!-- 		<nav aria-label="Page navigation example"> -->
<!-- 			<ul class="pagination justify-content-center"> -->
<!-- 				<li class="page-item disabled"><a class="page-link" href="#" -->
<!-- 					tabindex="-1">Previous</a></li> -->
<!-- 				<li class="page-item"><a class="page-link" href="#">1</a></li> -->
<!-- 				<li class="page-item"><a class="page-link" href="#">2</a></li> -->
<!-- 				<li class="page-item"><a class="page-link" href="#">3</a></li> -->
<!-- 				<li class="page-item"><a class="page-link" href="#">Next</a></li> -->
<!-- 			</ul> -->
<!-- 		</nav> -->
