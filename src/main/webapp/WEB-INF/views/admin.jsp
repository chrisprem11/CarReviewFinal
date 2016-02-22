<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Car Reviews :Admin Section</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
</head>
<body>
<% if (session.getAttribute("role") == "admin") { %>
<jsp:include page="head.jsp"></jsp:include>
<pre>


</pre>
<h2><a href="addcar"> Add Cars</a></h2>

<!-- <h2><a href="admin/gallery"> Update Gallery</a></h2> -->
<!-- <h2><a href="admin/manageusers">Manage Users</a></h2> -->
<% } %>

<h3> This is a restricted page.</h3>

</body>
</html>