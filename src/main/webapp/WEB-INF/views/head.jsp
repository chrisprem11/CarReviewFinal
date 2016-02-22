<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">" 
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a href="/carreview/" class="navbar-brand"><span class="glyphicon glyphicon-home"></span> Car Reviews</a>
					<% if (session.getAttribute("role") == null || session.getAttribute("role").equals("")) { %>
						<a href="/carreview/login" class="btn btn-warning navbar-btn navbar-right" id="login"><span class="glyphicon glyphicon-user"></span> Login </a> 
					<% } else { %>
					<a href="/carreview/logout" class="btn btn-warning navbar-btn navbar-right" id="logout"><span class="glyphicon glyphicon-user"></span> Logout </a> 
					<% } %>
					<!-- new search button -->
						<form:form cssClass="navbar-form navbar-right"  modelAttribute="search" action="search" method="POST">
 								 <div class="form-group">
    								<form:input path ="name" cssClass="form-control" placeholder="search here..." required="required"/>
  								</div>
  							<button type="submit" class="btn btn-default">Search</button>
						</form:form>
						<!--  new search ends_-->
					<ul class="nav navbar-nav">
<!-- 						<li><a href="gallery"> Gallery</a> -->
						<li><a href="${pageContext.request.contextPath}/topbrands">Top Brands</a>
						<li><a href="${pageContext.request.contextPath}/reviews"> Reviews</a>
						 <% if (session.getAttribute("role") == "user") { %>
<!-- 						<li><a href="write"> Write a Review</a> -->
						<%} %>
						
					</ul>
				</div>
			</div>
			
		</nav>