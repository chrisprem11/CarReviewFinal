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
                <h1 class="text-info">Join Us ! <small class="text-success">Stay updated.</small></h1>
            </div>
        <div class="row">
			  <div class="col-md-8">
                    
                    <img src="resources/img/car2.jpg" alt="Image" width=100%>   
            </div>
			  <div class="col-md-4" >
				<div class="panel panel-default">
					<div class="panel-body">
								<div class="page-header">
                                    <h2 class="text-primary"><strong>Become a member</strong></h2><span class="glyphicon glyphicon-user"></span>
								</div>
								<form:form class="well" action="signup" modelAttribute="user" method="POST" onsubmit="return validate();">
										  <div> <h3>${message}</h3></div>
										  <div class="form-group">
											<label for="fname" class="text-warning">First Name</label>
											<form:input path="firstname" cssClass="form-control" placeholder="first name" pattern=".{4,10}" required="required" />
											<form:errors path="firstname" cssclass="error"></form:errors>
										  </div>
										  <div class="form-group">
											<label for="lname" class="text-warning">Last Name</label>
											<form:input path="lastname" cssClass="form-control" placeholder="last name" pattern=".{10,16}"required="required"/>
											<form:errors path="lastname" cssclass="error"></form:errors>
										  </div>
										  
                                        <div class="form-group">
											<label for="email" class="text-warning">Email Address</label>
											<form:input path="email" cssClass="form-control" placeholder="email" type="email" required="required" />
											<form:errors path="email" cssclass="error"></form:errors>
										  </div>
										   <div class="form-group">
											<label for="username" class="text-warning">Username</label>
											<form:input path="username" cssClass="form-control" placeholder="username" pattern=".{4,8}" required="required" />
											<form:errors path="username" cssclass="error"></form:errors>
										  </div>
                                        <div class="form-group">
                                            <label for="password" class="text-warning">Password</label>
											<form:password path="password" cssClass="form-control" placeholder="password" pattern=".{4,10}"required="required"/>
											<form:errors path="password" cssclass="error"></form:errors>
										  </div>
<!--                                             <div class="form-group"> -->
<!--                                             <label for="confirmpassword" class="text-warning">Confirm-Password</label> -->
<%-- 											<form:password path="confirmpassword" cssClass="form-control" placeholder="Confirm password"/> --%>
<!-- 										  </div> -->
										
						  <a href="/carreview/" class="btn btn-success"><span class="glyphicon glyphicon-arrow-left"></span>Back </a>
                        <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-upload"></span>Submit</button>
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