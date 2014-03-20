<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>施工端数据展示</title>
	<link href="../bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet">
	<link href="../bootstrap-3.0.0/css/bootstrap-datetimepicker.css" rel="stylesheet">
	<link href="../bootstrap-3.0.0/css/sticky-footer-navbar.css" rel="stylesheet">
	<script src="../bootstrap-3.0.0/js/jquery-1.9.1.js"></script>
	<script src="../bootstrap-3.0.0/js/jquery.validate.js"></script>
	<script src="../bootstrap-3.0.0/js/bootstrap.js"></script>
	<script src="../bootstrap-3.0.0/js/moment.min.js"></script>
	<script src="../bootstrap-3.0.0/js/bootstrap-datetimepicker.js"></script>
	<script src="./construct-data-mud.js"></script>
</head>
<body>
	<div>
		<iframe src="./../menu.jsp" class="col-md-12" height="200" frameborder="0" scrolling="no" width="100%"
						marginheight="0" marginwidth="0"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info" style="height:150px;">
					<div class="panel-heading">查询事项</div>
					<div class="panel-body">
						<div class="well">
							<a id="a-mud" href="soil.action" class="btn btn-danger">剖面位置/土质图</a>
							<a id="a-facility" href="./construct-manage/construct-data-facility.jsp" target="_parent" class="btn btn-primary">沿线重要设施</a>
							<a id="a-measure" href="./construct-manage/construct-data-measure.jsp" target="_parent" class="btn btn-success">测点布置情况</a>
							<a id="a-advance" href="./construct-manage/construct-data-advance.jsp" target="_parent" class="btn btn-warning">盾构推进数据</a>
							<a id="a-pose" href="./construct-manage/construct-data-pose.jsp" target="_parent" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="./construct-manage/construct-data-syn.jsp" target="_parent" class="btn btn-primary">同步注浆数据</a>
							<a id="a-thing" href="./construct-manage/construct-data-thing.jsp" target="_parent" class="btn btn-danger">施工大事记录</a>
						</div>
					</div>
				</div>
			</div>
			<div id="div-mud" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">剖面位置/土质图</h3>
					</div>
					<div class="panel-body">
						<form name="fm"   action="param.action"  method="post">
							<input type="text" name="username" value="erin">
							<input type="text" name="password" value="123">
							<input type="submit" value="提交"></form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<iframe src="../footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60"
						marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>