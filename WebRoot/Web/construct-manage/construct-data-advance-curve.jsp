<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
	<title>施工端数据展示</title>
	<link href="/GPSG/Web/bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet">
	<link href="/GPSG/Web/bootstrap-3.0.0/css/bootstrap-datetimepicker.css" rel="stylesheet">
	<link href="/GPSG/Web/bootstrap-3.0.0/css/sticky-footer-navbar.css" rel="stylesheet">
	<script src="/GPSG/Web/bootstrap-3.0.0/js/jquery-1.9.1.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/jquery.validate.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/bootbox.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/moment.min.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap-datetimepicker.js"></script>
	<script src="/GPSG/Web/construct-manage/construct-data-advance.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%" height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info" style="height:150px;">
					<div class="panel-heading">查询事项</div>
					<div class="panel-body">
						<div class="well">
							<a id="a-mud" href="/GPSG/construct-web/soil.action" class="btn btn-danger">剖面位置/土质图</a>
							<a id="a-facility" href="/GPSG/construct-web/facility.action" class="btn btn-primary">沿线重要设施</a>
							<a id="a-measure" href="/GPSG/construct-web/measure.action" class="btn btn-success">测点布置情况</a>
							<a id="a-advance" href="/GPSG/construct-web/advance_getAllRecord.action" class="btn btn-warning btn-lg">盾构推进数据</a>
							<a id="a-pose" href="/GPSG/construct-web/pose.action" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action" class="btn btn-primary">同步注浆数据</a>
							<a id="a-thing" href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
						</div>
					</div>
				</div>
			</div>
		<div id="div-advance" class="row">
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title">盾构推进信息</h3>
				</div>
				<div class="panel-body">
					<div class="btn-group">
						<button type="button" class="btn btn-primary">查询</button>
						<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
							<span class="caret"></span>
							<span class="sr-only">Toggle Dropdown</span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li>
								<a href="#" data-toggle="modal" data-target="#modal-by-date">按时间查询</a>
							</li>
							<li>
								<a href="#" data-toggle="modal" data-target="#modal-advance-loop">按环号查询</a>
							</li>
						</ul>
					</div>
					<div class="btn-group">
						<button type="button" class="btn btn-primary">绘制曲线</button>
						<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
							<span class="caret"></span>
							<span class="sr-only">Toggle Dropdown</span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li>
								<a href="/GPSG/construct-web/chartAdvance.action">按时间</a>
							</li>
						</ul>
					</div>
					<div class="btn-group">
						<button type="button" class="btn btn-primary">EXCEL导出</button>
						<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
							<span class="caret"></span>
							<span class="sr-only">Toggle Dropdown</span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li>
								<a href="#" data-toggle="modal" data-target="#modal-total">导出全部记录</a>
							</li>
							<li>
								<a href="#" data-toggle="modal" data-target="#modal-excel">按环号区间导出</a>
							</li>
						</ul>
					</div>
					<div class="modal fade" id="modal-excel">
						<div class="modal-dialog">
							<div class="modal-content">
										<form id="form-loop-query" method="post" action="/GPSG/construct-web/advance_excelBetween.action" class="form-horizontal" role="form">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">按需导出</h4>
								</div>
								<div class="modal-body">
									<div class="row">
											<div class="form-group">
												<label class="col-sm-6 control-label" for="excelPath">请输入环号：</label>
												<div class="col-sm-6">
													<input id="excelPath" name="loop1" value="1" type="text" class="form-control"></div>
											</div>
											<div class="form-group">
												<label class="col-sm-6 control-label" for="excelPath">请输入环号：</label>
												<div class="col-sm-6">
													<input id="excelPath" name="loop2" value="1" type="text" class="form-control"></div>
											</div>
											<div class="form-group">
												<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
												<div class="col-sm-6">
													<input id="excelPath" name="excelPath" value="d:/土质表.xls" type="text" class="form-control"></div>
											</div>
									</div>
								</div>
								<div class="modal-footer">
									<button type="submit" class="btn btn-success">导出</button>
									<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								</div>
										</form>
							</div>
						</div>
					</div>
					<div class="modal fade" id="modal-total">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">导出所有记录</h4>
								</div>
								<div class="modal-body">
									<div class="row">
										<form id="form-total" method="post" action="/GPSG/construct-web/excelAdvance.action" class="form-inline" role="form">
											<div class="form-group col-sm-9">
												<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
												<div class="col-sm-6">
													<input id="excelPath" name="excelPath" value="d:/盾构推进.xls" type="text" class="form-control"></div>
											</div>
											<div class="col-sm-3">
												<button type="submit" class="btn btn-success">导出</button>
											</div>
										</form>
									</div>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="modal-by-date">
						<div class="modal-dialog">
							<div class="modal-content">
								<form class="form-inline" role="form" method="post" action="/GPSG/construct-web/advance_getByDate.action">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">盾构推进参数曲线</h4>
									</div>
									<div class="modal-body">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-start-date">推进日期：</label>
												<div class="col-sm-7 input-group start-date">
													<input name="date" type="text" class="form-control">
													<span class="input-group-addon glyphicon glyphicon-calendar"></span>
												</div>
											</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-success">查询</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="modal fade" id="modal-shield-advance-loop">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">盾构推进参数曲线</h4>
								</div>
								<div class="modal-body">
									<form class="form-horizontal" role="form">
										<div class="form-group">
											<label class="col-sm-4 control-label" for="input-shield-horizontal-start-loop">请输入环号：</label>
											<div class="col-sm-5 input-group">
												<input id="input-shield-horizontal-start-loop" type="text" class="form-control"></div>
										</div>
									</form>
								</div>
								<div class="modal-footer">
									<button type="submit" class="btn btn-success">绘制曲线</button>
									<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					
					<div class="modal fade" id="modal-by-date1">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">盾构推进信息查询</h4>
								</div>
								<div class="modal-body">
									<form class="form-inline" role="form">
										<div class="form-group col-sm-8">
											<label class="col-sm-5 control-label" for="input-start-date">推进日期：</label>
											<div class="col-sm-7 input-group start-date">
												<input id="input-start-date" type="text" class="form-control">
												<span class="input-group-addon glyphicon glyphicon-calendar"></span>
											</div>
										</div>
										<div class="col-sm-4">
											<button type="submit" class="btn btn-success">查询</button>
										</div>
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="modal-advance-loop">
						<div class="modal-dialog">
							<div class="modal-content">
								<form class="form-inline" role="form" method="post" action="/GPSG/construct-web/advance_getByLoop.action">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">盾构推进信息查询</h4>
									</div>
									<div class="modal-body">
										<div class="form-group col-sm-8">
											<label class="col-sm-5 control-label" for="input-loop">环号：</label>
											<div class="col-sm-7 input-group">
												<input id="input-loop" name="loop" type="text" class="form-control"></div>
										</div>												
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-success">查询</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									</div>
								</form>
							</div>
						</div>
					</div>
					
				</div>
			</div>
			<iframe src="/GPSG/advance.jpg" scroll="true" class="col-sm-12" height="600px">
						</iframe>
		</div>
	</div>
</div>
<div id="footer">
<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60px"
						marginheight="0" marginwidth="0"></iframe>
</div>
</body>
</html>