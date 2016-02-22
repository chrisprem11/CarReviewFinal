<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Send a Review</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/star-rating.css"/>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<pre>

</pre>
<c:out value="${cars.carId}"></c:out>
<%out.println(request.getSession().getAttribute("user_id" )); %>

<div class="container"> 
<div class="row">
				<div class="col-md-6">
					 <h2 class="text-success"> <c:out value="${cars.brand} ${cars.model }"/> </h2>
						<p>
							Information- <c:out value="${cars.description }"/>
							<br>
							Price -<c:out value="${cars.price }"></c:out>
						</p>
					</div>
					<div class="col-md-6">
						<img src="${pageContext.request.contextPath}/resources/img/i20.jpg" class="img-responsive" alt="car">
					</div>
					
				</div><!--end of row-->
			</div>
<hr>
<!--write review-->
 <% if (session.getAttribute("role") == "user") { %>
		<div class="container">
			<section>
				<div class="page-header" id="write">
					<h2 class="text-danger">Write a review<small class="text-primary">have something to say?</small></h2>
				</div><!--end page header-->
				
				<div class="row">
					<div class="col-sm-4">
						<p> <strong><i>Send us your reviews</i></strong></p>
						<img src="${pageContext.request.contextPath}/resources/img/qstn.jpg" alt="Think and write" width ="80%" height="60%">
						<!--add something later-->
					</div>
					
					<div class="col-sm-8">
						<form:form action="userreview" cssClass="form-horizontal" modelAttribute="reviews" method="POST" onsubmit="return validate();">
                            <fieldset>
                                <div class="form-group">
                                    <label for="carId" class="col-sm-2 control-label"></label> 
                                    <div class="col-sm-10">
                                        <form:hidden path="car_id" value ="${cars.carId}" cssClass="form-control" />
                                    </div>
                                </div><!--End form group-->
                                <div class="form-group">
                                    <label for="user-id" class="col-sm-2 control-label">User_id</label> 
                                    <div class="col-sm-10">
                                       <form:input path="user_id" cssClass="form-control" placeholder="matching user id"/>
                                    </div>
                                </div><!--End form group-->

                                <div class="form-group">
                                    <label for="title" class="col-sm-2 control-label">Title</label> 
                                    <div class="col-sm-10">
                                        <form:input path="title" cssClass="form-control" placeholder="Enter a title."/>
                                    </div>
                                </div><!--End form group-->

                                <div class="form-group">
                                    <label for="review" class="col-sm-2 control-label">Review</label> 
                                    <div class="col-sm-10">
                                    <form:textarea path="review" cssClass="form-control" placeholder="Write a review" cols="20" rows="10"/>
                                                                               
                                    </div>
                                </div><!--End form group-->


                                <div class="form-group">
                                    <label for="user-rating" class="col-sm-2 control-label">Rating</label> 
                                    <div class="col-sm-10">
                                        
                                        <form:input path="rating" cssClass="rating" type="number" min="1" max="5" step="1"/>
                                    </div>
                                </div><!--End form group-->


                                <div class="form-group"> 
                                    <div class="col-sm-10 col-sm-offset-2">
                                        <button type="submit" class="btn btn-success">Submit</button>
                                    </div>
                                </div>
                            </fieldset>
						</form:form>
					</div>
				</div><!--end row-->
			</section>
		</div>
	<%} %>	
	
<jsp:include page="footer.jsp"></jsp:include>
<script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script> 
	<script src="${pageContext.request.contextPath}/resources/js/star-rating.js"></script>
</body>
</html>