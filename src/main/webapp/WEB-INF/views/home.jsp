
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Car Reviews</title>
	<meta name="description" content="car reviews">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
</head>
<body data-spy="scroll" data-target="#my-navbar">

<jsp:include page="head.jsp"></jsp:include>
		
		<!-- jumbotron -->
		<div class="jumbotron">
			<div class="container text-left">
				<h1 class="text-danger"> Car Reviews </h1>
				<p class="text-primary">Choose the best. </p>
			</div><!-- end of container-->
		</div><!-- End of jumbotron-->
	<!--gallery-->
	<div class="container">
		<section>
			<div class="page-header" id="gallery">
					 <h2 class="text-danger" >Gallery<small class="text-primary"> &nbsp have a closer look.</small></h2>
				</div>
				
				<div class="carousel slide" id="screenshot-carousel" data-ride="carousel">
					<ol class="carousel-indicators">
						<li data-target="#screenshot-carousel" data-slide-to="0" class="active"></li>
						<li data-target="#screenshot-carousel" data-slide-to="1"></li>
						<li data-target="#screenshot-carousel" data-slide-to="2"></li>
						<li data-target="#screenshot-carousel" data-slide-to="3"></li>
					</ol>
					<div class="carousel-inner" role="listbox"><!--add img class responsive-->
						<div class="item active">
							<img src="resources/img/a.jpg" class="img-rounded"  alt="car" > 
						</div>
						<div class="item">
							<img src="resources/img/b.jpg" alt="car" > 
						</div>
						<div class="item">
							<img src="resources/img/c.jpg" alt="car" > 
						</div>
						<div class="item">
							<img src="resources/img/d.jpg" alt="car" > 
						</div>
					</div><!--end carousel inner-->
					<a href="#screenshot-carousel" class="left carousel-control" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left"></span>
					</a>
					<a href="#screenshot-carousel" class="right carousel-control" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right"></span>
					</a>
				</div><!--end carousel-->
		</section>
	</div><!--end container--><!--end gallery-->
	
	
		<div class="container">
			<section>
				<div class="page-header" id="brands">
                    <a href="topbrands" class="text-danger"><h2>Top Brands<small class="text-primary">&nbsp check out the most popular brands</small>                         </h2></a>
						<div class="row">
							<div class="col-md-4">
								<div class="panel panel-default">
									<div class="panel-body">
										<a href=""><h4>Audi</h4></a>
										<p>jdjfjdbfjbdfj</p>
										<img src="resources/img/audi.jpg" alt="image" width="100%">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="panel panel-default">
									<div class="panel-body">
										<a href=""><h4>BMW</h4></a>
										<p>jdjfjdbfjbdfj</p>
										<img src="resources/img/bmwc.jpg" alt="image" width="100%">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="panel panel-default">
									<div class="panel-body">
										<a href=""><h4>Honda</h4></a>
										<p>jdjfjdbfjbdfj</p>
										<img src="resources/img/h.jpg" alt="image" width="100%">
									</div>
								</div>
							</div>
						</div><!--end of row-->
				</div><!--end page header-->
			</section>
		
		</div><!--end container-->
		
	<!--reviews-->
		  <div class="container">
			<section>
				<div class="page-header" id="reviews">
                    <a href="reviews" class="text-danger"><h2>Reviews<small class="text-primary">&nbsp most popular user reviews</small></h2></a>
				</div><!--end page header-->
            </section>
			</div>	
                <div class="container"><!--PANEL GROUP NEEDS TO BE EDITED--><!--START-->
                    <div class="panel-group" id="accordion">
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                <h5 class="panel-title">
                                    <a href="#collapse-1" data-toggle="collapse" data-parent="#accordion">Review title 1</a>
                                </h5>
                            </div><!--end panel title-->
                                <div id="collapse-1" class="panel-collapse collapse in">
                                    <div class="panel-body">
                                        <blockquote>
                                            <p> Very Nice car...</p>
                                            <footer>Prem Christopher</footer>
                                        </blockquote>
                                    </div>
                                </div><!--end panel collapse-->
                        </div>
                    </div>
                </div>
                        <div class="container">
                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <div class="panel-title">
                                        <a href="#collapse-2" data-toggle="collapse" data-parent="#accordion">
                                            <h5 class="text-success">Wonderful Car</h5>
                                        </a>
                                    </div><!--end panel title-->
                                    <div id="collapse-2" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <blockquote>
                                                <p> Very Nice car. Smooth handling...</p>
                                                <footer>Prem Christopher</footer>
                                            </blockquote>
                                        </div>
                                    </div><!--end panel collapse-->
                                </div>
                            </div>

                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <div class="panel-title">
                                        <a href="#collapse-3" data-toggle="collapse" data-parent="#accordion">
                                            <h5 class="text-success">Awesome Car</h5>
                                        </a>
                                    </div><!--end panel title-->
                                    <div id="collapse-3" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <blockquote>
                                                <p> Very Nice car. Smooth handling.  Suitable for rough use...</p>
                                                <footer>Prem Christopher</footer>
                                            </blockquote>
                                        </div>
                                    </div><!--end panel collapse-->
                                </div>
                            </div>
                           
				             <div class="col-sm-10 col-sm-offset-2">
                                <a href="reviews.html" class="text-warning"><h5>See More....</h5></a>
				            </div>
							</div>
                        </div><!--end panel group-->
                    </section>
                </div><!--end container--><!--PANEL GROUP END-->
		
	
		
	<!--footer-->
    <div id="myfooter">
		<footer>
			<hr>
			<div class="well">
				<div class="container text-center">
				<h3> Visit us again !</h3>
				<p> contact us or send reviews</p>
				
				<p>&copy; Copyright @ Prem</p>
			
				</div><!--end container-->
			</div><!--end well-->
		</footer>
    </div>
	<script src="resources/js/jquery-2.2.0.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script> 
	<script src="resources/js/star-rating.js"></script>
</body>
</html>