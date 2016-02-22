<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Member Login</title>
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
    </head>
  <body style="background=#aabbcc;">
    <div class="container">
        <section>
            <div class="page-header">
                <h1 class="text-info">Car Reviews</h1>
            </div>
        <div class="row">
			  <div class="col-md-8">
                    
                    <img src="resources/img/n4.jpg" alt="Image" width=100%>   
            </div>
			  <div class="col-md-4" >
				<div class="panel panel-default">
					<div class="panel-body">
								<div class="page-header">
                                    <h2 class="text-primary"><strong>Login here</strong></h2><span class="glyphicon glyphicon-user"></span>
								</div>
								<h4>${status}</h4>
								<h4>${message}</h4>
								<form:form class="well" action="login" modelAttribute="login" method="POST" onsubmit="return validate();">
                                        <div class="form-group">
											<label for="email" class="text-warning">Username</label>
											<form:input path="username" cssClass="form-control" placeholder="Enter your username."/>
										  </div>
                                        <div class="form-group">
                                            <label for="password" class="text-warning">Password</label>
											<form:password path="password" cssClass="form-control" placeholder="Enter password"/>
										  </div>
						  <a href="/carreview/" class="btn btn-success"><span class="glyphicon glyphicon-home"></span>Home </a>
                        <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-upload"></span>Login</button>
						</form:form>
					</div>
				</div>
			  </div>
		  </div>
        </section>
	</div>

   <script src="resources/js/jquery-2.2.0.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script> 
	<script src="resources/js/star-rating.js"></script>
  </body>
</html>