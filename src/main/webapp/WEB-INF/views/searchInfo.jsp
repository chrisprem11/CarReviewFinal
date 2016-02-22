<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search details</title>
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
</head>
<body>
<%@include file="/WEB-INF/views/head.jsp" %>
<pre>

</pre>
<div class="container">
				<div class="row">
					<div class="col-md-6">
					<c:forEach var="j" items="${cars }">
					
					 <a href="/<c:out value="${j.carId }"/>"><h2 class="text-success"> <c:out value="${j.brand }"/> </h2></a>
						<p>
							Model-<c:out value="${j.model }"/><br>
							Information- <c:out value="${j.description }"/><br>
							Price -<c:out value="${j.price }"></c:out>
						</p>
					</c:forEach>
					</div>
					<div class="col-md-6">
						<img src="resources/img/i20.jpg" class="img-responsive" alt="car">
					</div>
					
				</div><!--end of row-->
				
				<c:forEach var ="i" items="${modelname }">
				<c:out value="${i.brand }"></c:out>
				<c:out value="${i.model }"></c:out>
				<c:out value="${i.price}"></c:out>
				
				</c:forEach>
				<hr>
				<c:forEach var ="k" items="${users}"> 
				<pre>
				<c:out value="${k.user_id }"></c:out>
				<c:out value="${k.firstname }"></c:out>
				<c:out value="${k.username }"></c:out>
				
				</pre>
				</c:forEach>
		
		</div><!--End of container--><!--end of cars-->
</body>
</html>