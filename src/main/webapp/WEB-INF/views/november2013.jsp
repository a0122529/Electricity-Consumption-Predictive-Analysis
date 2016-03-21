<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>November Prediction</title>

<!-- Bootstrap Core CSS -->
<link href="resources//mytheme/framework/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="resources//mytheme/css/framework/metisMenu.min.css"
	rel="stylesheet">

<!-- Timeline CSS -->
<link href="resources//mytheme/css/timeline.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources//mytheme/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="resources//mytheme/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="resources//mytheme/fonts/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">November Prediction </a>
			</div>
			<!-- /.navbar-header -->

			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="Search...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div> <!-- /input-group -->
						</li>

						<li><a href=""><i class="fa fa-bar-chart-o fa-fw"></i>
								Year 2012<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="november2012">November</a></li>
								<li><a href="december2012">December</a></li>
							</ul></li>

						<li><a href="predctn2013"><i class="fa fa-bar-chart-o fa-fw"></i>
								Year 2013<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="january">January</a></li>
								<li><a href="feburary">Feburary</a></li>
								<li><a href="march">March</a></li>
								<li><a href="april">April</a></li>
								<li><a href="may">May</a></li>
								<li><a href="june">June</a></li>
								<li><a href="july">July</a></li>
								<li><a href="august">August</a></li>
								<li><a href="september">September</a></li>
								<li><a href="october">October</a></li>
								<li><a href="november2013">November</a></li>
							</ul> <!-- /.nav-second-level --></li>
						<li><a href="nextDayConsumption"><i
								class="fa fa-bar-chart-o fa-fw"></i> Next Day Consumption<span
								class="fa arrow"></span></a></li>
						<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>
								Weekly Consumption<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="weekday">Weekday</a></li>
								<li><a href="weekend">Weekend</a></li>
							</ul></li>

						<li><a href="deviceUsagePattern"><i
								class="fa fa-bar-chart-o fa-fw"></i> Device Usage Pattern<span
								class="fa arrow"></span></a></li>
						<li><a href="revenueLoss"><i
								class="fa fa-bar-chart-o fa-fw"></i> Revenue Loss<span
								class="fa arrow"></span></a></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">November Prediction</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-3">
									<i class="fa fa-comments fa-5x"></i>
								</div>
								<div class="col-xs-9 text-right">
									<div class="huge"></div>
									<div>Data Source</div>
								</div>
							</div>
						</div>
						<a href="#">
							<div class="panel-footer">
								<span class="pull-left">View Details</span> <span
									class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
								<div class="clearfix"></div>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="panel panel-green">
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-3">
									<i class="fa fa-tasks fa-5x"></i>
								</div>
								<div class="col-xs-9 text-right">
									<div class="huge"></div>
									<div>Graphs</div>
								</div>
							</div>
						</div>
						<a href="#">
							<div class="panel-footer">
								<span class="pull-left">View Details</span> <span
									class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
								<div class="clearfix"></div>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="panel panel-yellow">
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-3">
									<i class="fa fa-shopping-cart fa-5x"></i>
								</div>
								<div class="col-xs-9 text-right">
									<div class="huge"></div>
									<div>Prediction</div>
								</div>
							</div>
						</div>
						<a href="#">
							<div class="panel-footer">
								<span class="pull-left">View Details</span> <span
									class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
								<div class="clearfix"></div>
							</div>
						</a>
					</div>
				</div>
				
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-8">
					<div class="panel panel-default">
						<div class="panel-heading">
							<i class="fa fa-bar-chart-o fa-fw"></i> November Consumption Plot
							<div class="pull-right">
								<div class="btn-group">
									<button type="button"
										class="btn btn-default btn-xs dropdown-toggle"
										data-toggle="dropdown">
										Actions <span class="caret"></span>
									</button>
									<ul class="dropdown-menu pull-right" role="menu">
										<li><a href="#">Action</a></li>
										
										<li class="divider"></li>
										<li><a href="#">Separated link</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div>
							<a href="https://plot.ly/~kshitijkaushik14/208/" target="_blank"
								title="power utilization for November 2013"
								style="display: block; text-align: center;"><img
								src="https://plot.ly/~kshitijkaushik14/208.png"
								alt="power utilization for November 2013"
								style="max-width: 100%; width: 792px;" width="792"
								onerror="this.onerror=null;this.src='https://plot.ly/404.png';" /></a>
							<script data-plotly="kshitijkaushik14:208"
								src="https://plot.ly/embed.js" async></script>
						</div>

						<!-- /.panel-heading -->
						<div class="panel-body"></div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
					<div class="panel panel-default">
						<div class="panel-heading">
							<i class="fa fa-bar-chart-o fa-fw"></i> Peak Time Load Value in
							November

							<div class="pull-right">
								<div class="btn-group">
									<button type="button"
										class="btn btn-default btn-xs dropdown-toggle"
										data-toggle="dropdown">
										Actions <span class="caret"></span>
									</button>
									<ul class="dropdown-menu pull-right" role="menu">
										<li><a href="#">Action</a></li>
										<li class="divider"></li>
										<li><a href="#">Separated link</a></li>
									</ul>
								</div>
							</div>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-10" style="padding-left: 100px">
									<div class="table-responsive">
										<table class="table table-bordered table-hover table-striped">
											<thead>
												<tr>
													<th>Date</th>
													<th>Day</th>

													<th>Current Year Prediction(kW)</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="val" items="${nov13}">
													<tr>
														<td><c:out value="${val.value.get(3)}" /></td>
														<td><c:out value="${val.value.get(1)}" /></td>

														<td><c:out value="${val.value.get(2)}" /></td>
														<%--  </c:forEach> --%>
													</tr>
												</c:forEach>

											</tbody>
										</table>
									</div>
									<!-- /.table-responsive -->
								</div>
								<!-- /.col-lg-4 (nested) -->

								<!-- /.col-lg-8 (nested) -->
							</div>
							<div class="col-lg-11">
								<div id="morris-bar-chart"></div>
							</div>
							<!-- /.row -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->

					<!-- /.panel -->
				</div>
				<!-- /.col-lg-8 -->
				<div class="col-lg-4"></div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
			<div class="panel panel-default">

				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->

			<!-- /.panel .chat-panel -->
		</div>
		<!-- /.col-lg-4 -->
	</div>
	<!-- /.row -->
	</div>
	<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="resources//mytheme/framework/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources//mytheme/framework/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="resources//mytheme/framework/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="resources//mytheme/framework/raphael-min.js"></script>
	<script src="resources//mytheme/framework/morris.min.js"></script>
	<script src="resources//mytheme/framework/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="resources//mytheme/framework/sb-admin-2.js"></script>

</body>

</html>
