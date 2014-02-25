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
	<script src="/GPSG/Web/construct-manage/construct-data-mud.js"></script>
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
							<a id="a-mud" href="/GPSG/construct-web/soil.action" class="btn btn-danger btn-lg">剖面位置/土质图</a>
							<a id="a-facility" href="/GPSG/construct-web/facility.action" class="btn btn-primary">沿线重要设施</a>
							<a id="a-measure" href="/GPSG/construct-web/measure.action" class="btn btn-success">测点布置情况</a>
							<a id="a-advance" href="/GPSG/construct-web/advance.action" class="btn btn-warning">盾构推进数据</a>
							<a id="a-pose" href="/GPSG/construct-web/pose.action" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action" class="btn btn-primary">同步注浆数据</a>
							<a id="a-thing" href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
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
						<div class="well">
							<div class="btn-group">
								<button type="button" class="btn btn-primary">查询</button>
								<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
									<span class="caret"></span>
									<span class="sr-only">Toggle Dropdown</span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li>
										<a id="by-date" href="#" data-toggle="modal" data-target="#modal-mud-date">按时间查询</a>
									</li>
									<li>
										<a id="by-loop" href="#" data-toggle="modal" data-target="#modal-mud-loop">按环号查询</a>
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
										<a id="excel-all" href="#" data-toggle="modal" data-target="#modal-total">导出全部记录</a>
									</li>
									<li>
										<a id="excel-part" href="#" data-toggle="modal" data-target="#modal-by-condition">按查询条件导出</a>
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
										<a id="by-date" href="#">绘制时间-比重</a>
									</li>
								</ul>
							</div>
						</div>
						<div class="modal fade" id="modal-by-condition">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">按需导出</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<form id="form-loop-query" method="post" action="/GPSG/construct-web/excelPartLoop.action" class="form-horizontal" role="form">
												<div class="form-group">
													<label class="col-sm-6 control-label" for="excelPath">请输入环号：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="id" value="1" type="text" class="form-control"></div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath" value="d:/土质表.xls" type="text" class="form-control"></div>
												</div>
											</form>
										</div>
									</div>
									<div class="modal-footer">
										<button id="btn-by-condition" type="button" class="btn btn-success">导出</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
									</div>
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
											<form id="form-total" method="post" action="/GPSG/construct-web/excelAll.action" class="form-inline" role="form">
												<div class="form-group col-sm-9">
													<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath" value="d:/土质表.xls" type="text" class="form-control"></div>
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
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">按时间</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<form id="form-loop-query1" class="form-inline" role="form">
												<div class="form-group col-sm-9">
													<label class="col-sm-6 control-label" for="input-excel-path">请输入EXCEL导出路径：</label>
													<div class="col-sm-6">
														<input id="input-excel-path" name="excelPath" value="d:/土质表.xls" type="text" class="form-control"></div>
												</div>
												<div class="col-sm-3">
													<button id="excel-export-btn" type="submit" class="btn btn-success">导出</button>
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
						<div class="modal fade" id="modal-mud-date">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">剖面位置/土质图</h4>
									</div>
									<div class="modal-body">
										<form id="form-date-query" method="post" action="/GPSG/construct-web/queryDate.action" class="form-inline" role="form">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-date">测点：</label>
												<div class="col-sm-7">
													<input id="input-date" name="tcCno" type="text" class="form-control"></div>
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" id="query-date-btn" class="btn btn-success">查询</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-mud-loop">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">剖面位置/土质图</h4>
									</div>
									<div class="modal-body">
										<form id="form-query-by-loop" method="post" action="/GPSG/construct-web/queryLoop.action" class="form-inline" role="form">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-loop">索引号：</label>
												<div class="col-sm-7">
													<input id="input-loop" name="id" type="text" class="form-control"></div>
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" id="query-loop-btn" class="btn btn-success">查询</button>
										<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
						<iframe src="/GPSG/md.jpg" scroll="true" class="col-sm-12" height="600px">
						</iframe>
					</div>

				</div>
			</div>
		</div>
	</div>
<div id="footer" class="footer">
	<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60"
						marginheight="0" marginwidth="0"></iframe>
</div>
</body>
</html>