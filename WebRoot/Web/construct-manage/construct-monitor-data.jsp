<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>施工端数据展示</title>
<link href="/GPSG/Web/bootstrap-3.0.0/css/bootstrap.css"
	rel="stylesheet">
<link href="/GPSG/Web/bootstrap-3.0.0/css/bootstrap-datetimepicker.css"
	rel="stylesheet">
<link href="/GPSG/Web/bootstrap-3.0.0/css/sticky-footer-navbar.css"
	rel="stylesheet">
<script src="/GPSG/Web/bootstrap-3.0.0/js/jquery-1.9.1.js"></script>
<script src="/GPSG/Web/bootstrap-3.0.0/js/jquery.validate.js"></script>
<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap.js"></script>
<script src="/GPSG/Web/bootstrap-3.0.0/js/bootbox.js"></script>
<script src="/GPSG/Web/bootstrap-3.0.0/js/moment.min.js"></script>
<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap-datetimepicker.js"></script>
<script src="/GPSG/Web/construct-manage/construct-monitor-data.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div id="div-advance">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">地面沉降信息</h3>
					</div>
					<div class="panel-body">
						<div class="well">
							<div class="btn-group">
								<button type="button" class="btn btn-primary">查询测点信息</button>
								<button type="button" class="btn btn-primary dropdown-toggle"
									data-toggle="dropdown">
									<span class="caret"></span> <span class="sr-only">Toggle
										Dropdown</span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#" data-toggle="modal"
										data-target="#modal-measure-number">按测点号查询</a></li>
								</ul>
							</div>
							<div class="modal fade" id="modal-measure-number">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">地面沉降信息</h4>
										</div>
										<div class="modal-body">
											<form id="form-aaa" method="post"
												action="/GPSG/construct-web/monitor_getByNumber.action"
												class="form-horizontal" role="form">										
												<div id="alert1" class="alert alert-danger text-center hide"></div>
												<div class="form-group">
													<label class="col-sm-4 control-label"
														for="input-measure-loop">请输入测点号：</label>
													<div class="col-sm-5 input-group">
														<input id="input-measure-number" name="number" type="text"
															class="form-control">
													</div>
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button id="aaa" type="button" class="btn btn-success">查询</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">关闭</button>
										</div>
									</div>
								</div>
							</div>
							<div class="modal fade" id="modal-measure-during">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">地面沉降信息</h4>
										</div>
										<div class="modal-body">
											<form method="post"
												action="/GPSG/construct-web/curveMonitor.action"
												id="form-curve" class="form-horizontal" role="form">
												<div class="form-group">
													<label class="col-sm-4 control-label"
														for="input-measure-point">请输入测点：</label>
													<div class="col-sm-5 input-group">
														<input id="input-measure-point" name="number" type="text"
															class="form-control">
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-4 control-label"
														for="input-start-date">时间区间开始：</label>
													<div class="col-sm-5 input-group div-start">
														<input id="input-start-date" name="date1" type="text"
															class="form-control"> <span
															class="input-group-addon glyphicon glyphicon-calendar"></span>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-4 control-label" for="input-end-date">时间区间结束：</label>
													<div class="col-sm-5 input-group div-end">
														<input id="input-end-date" name="date2" type="text"
															class="form-control"> <span
															class="input-group-addon glyphicon glyphicon-calendar"></span>
													</div>
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button id="curve-btn" type="button" class="btn btn-success">绘制沉降曲线</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</div>
								</div>
							</div>
							<div class="modal fade" id="modal-measure-loop">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">盾构推进信息查询</h4>
										</div>
										<div class="modal-body">
											<form class="form-horizontal" role="form">
												<div class="form-group">
													<label class="col-sm-4 control-label"
														for="input-start-loop">环号区间开始：</label>
													<div class="col-sm-5 input-group">
														<input id="input-start-loop" type="text"
															class="form-control">
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-4 control-label" for="input-end-date">环号区间结束：</label>
													<div class="col-sm-5 input-group">
														<input id="input-end-date" type="text"
															class="form-control">
													</div>
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-success">绘制纵横沉降曲线</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</div>
								</div>
							</div>
						</div>
						<table class="table">
							<tbody>
								<tr>
									<td>索引号</td>
									<td>测点号</td>
									<td>测量时间</td>
									<td>测量值</td>
									<td>次变</td>
									<td>累计</td>
									<td>坐标X</td>
									<td>坐标Y</td>
									<td>建筑物最大隆起</td>
									<td>建筑物最大沉降</td>
									<td>管线最大隆起</td>
									<td>管线最大沉降</td>
									<td>东西线(0-东 1-西)</td>
								</tr>
								<s:iterator value="#request.list" id="monitor">
									<tr>
										<td id="aa"><s:property value="#monitor.dcIndx" /></td>
										<td id="bb"><s:property value="#monitor.dcCdno" /></td>
										<td id="cc"><s:property value="#monitor.dcTime" /></td>
										<td id="dd"><s:property value="#monitor.dcValue" /></td>
										<td id="ee"><s:property value="#monitor.dcVary" /></td>
										<td id="ff"><s:property value="#soil.dcTotl" /></td>
										<td id="gg"><s:property value="#monitor.dcX" /></td>
										<td id="hh"><s:property value="#monitor.dcY" /></td>
										<td id="ii"><s:property value="#monitor.dcJzwmaxlq" /></td>
										<td id="jj"><s:property value="#monitor.dcJzwmaxcj" /></td>
										<td id="kk"><s:property value="#monitor.dcGxmaxlq" /></td>
										<td id="ll"><s:property value="#monitor.dcGxmaxcj" /></td>
										<td id="mm"><s:property value="#monitor.isEast" /></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="post"
									action="/GPSG/construct-web/monitor_getAllRecord.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent"
											href="/GPSG/construct-web/monitor_getAllRecord.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="/GPSG/construct-web/monitor_getAllRecord.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="/GPSG/construct-web/monitor_getAllRecord.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="/GPSG/construct-web/monitor_getAllRecord.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
										</a>
									</s:if>

								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>