<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Reviews</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<pre>

</pre>
<!--Show Reviews-->
		<div class="container">
			<section>
				<div class="page-header" id="news">
                    <a href="reviews" class="text-danger"><h2>User Reviews<small class="text-primary"> &nbsp check out the most popular reviews</small></h2></a>
				</div>
				<!--row-->
				<c:forEach var="j" items="${reviews}">
				<div class="row">
					<div class="col-md-6">
                        <a href="${pageContext.request.contextPath}/"><h3 class="text-success">${j.title} </h3></a>
							<h4 class="text-primary">${j.review}</h4>
							<h4 class="text-primary">${j.rating}</h4>
					</div>
					<div class="col-md-6">
						<img src="resources/img/n3.jpg" class="img-responsive" alt="car">
					</div>
				</div>
				</c:forEach>
			</section>
		</div><!--End of container  --><!--end of Reviews-->
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>