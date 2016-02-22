<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Top Brands</title>
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<pre>



</pre>
<div class="container">
			<section>
				<div class="page-header" id="brands">
                    <h2 class="text-danger">Cars<small class="text-primary"> check details.</small></h2>
                   </div>
						<div class="row">
							<div class="col-md-4">
								<div class="panel panel-default">
									<div class="panel-body">
										<c:forEach var="i" items="${honda}">
											<a href="write/${i.carId}"><h3><c:out value="${i.brand } ${i.model }"></c:out></h3></a>
												<p>Info- <c:out value="${i.description }"/><br>
												<p>Price -<c:out value="${i.price }"/></p><br>
													<img src="resources/img/amaze.jpg" alt="image" width="100%">
										</c:forEach>
										
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="panel panel-default">
									<div class="panel-body">
										<c:forEach var="j" items="${hyundai}">
											<a href="write/${j.carId}"><h3><c:out value="${j.brand} ${j.model}"></c:out></h3></a>
											<p>Info- <c:out value="${j.description }"/><br>
											<p>Price -<c:out value="${j.price }"/></p><br>
											<img src="resources/img/i20.jpg" alt="image" width="100%">
										</c:forEach>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="panel panel-default">
									<div class="panel-body">
										<c:forEach var="k" items="${renault }">
											<a href="write/${k.carId}"><h3><c:out value="${k.brand} ${k.model}"></c:out></h3></a>
											<p>Info-<c:out value="${k.description }"/><br>
											<p>Price -<c:out value="${k.price }"/></p><br>
										</c:forEach>
										<img src="resources/img/duster.jpg" alt="image" width="100%">
									</div>
								</div>
							</div>
						</div><!--end of row-->
				</div><!--end page header-->
			</section>
		
		</div><!--end container-->
				
			</section>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>