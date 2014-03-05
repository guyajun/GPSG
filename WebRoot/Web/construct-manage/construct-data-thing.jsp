<%@ page language="java" pageEncoding="UTF-8"%>
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
<link href="/GPSG/Web/bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet">
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
<script src="/GPSG/Web/construct-manage/construct-data-thing.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info" style="height:150px;">
					<div class="panel-heading">查询事项</div>
					<div class="panel-body">
						<div class="well">
							<a id="a-mud" href="/GPSG/construct-web/soil.action"
								class="btn btn-danger">剖面位置/土质图</a> <a id="a-facility"
								href="/GPSG/construct-web/facility.action" class="btn btn-primary">沿线重要设施</a>
							<a id="a-measure" href="/GPSG/construct-web/measure.action"
								class="btn btn-success">测点布置情况</a> <a id="a-advance"
								href="/GPSG/construct-web/advance_getAllRecord.action"
								class="btn btn-warning">盾构推进数据</a> <a id="a-pose"
								href="/GPSG/construct-web/pose.action" class="btn btn-success ">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action"
								class="btn btn-primary">同步注浆数据</a> <a id="a-thing"
								href="/GPSG/construct-web/thing.action"
								class="btn btn-danger btn-lg">施工大事记录</a>
						</div>
					</div>
				</div>
			</div>
			<div id="div-thing" class="row   ">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">施工大事信息</h3>
					</div>
					<div class="panel-body">
					<div class="well">
						<div class="btn-group">
							<button type="button" class="btn btn-primary">查询</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#" data-toggle="modal"
									data-target="#modal-thing-date">按时间查询</a>
								</li>
								<!-- <li><a href="#" data-toggle="modal"
									data-target="#modal-thing-number">按项目编号查询</a>
								</li> -->
							</ul>
						</div>
							

						<div class="btn-group">
							<button type="button" class="btn btn-primary">EXCEL导出</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a id="excel-all" href="#" data-toggle="modal"
									data-target="#modal-total">导出全部记录</a></li>
							</ul>
						</div>
						</div>
						<div class="modal fade" id="modal-total">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">导出所有记录</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<form id="form-total" method="post"
												action="/GPSG/construct-web/excelAll7.action"
												class="form-inline" role="form">
												<div class="form-group col-sm-9">
													<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath"
															value="d:/施工大事信息.xls" type="text" class="form-control">
													</div>
												</div>
												<div class="col-sm-3">
													<button id="export-all-btn" type="button" class="btn btn-success">导出</button>
												</div>
											</form>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
									</div>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-thing-date">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">施工大事信息</h4>
									</div>
									<div class="modal-body">
										<form class="form-query-by-loop" role="form" method="post"
											action="/GPSG/construct-web/thingDate.action">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-start-date">推进日期：</label>
												<div class="col-sm-7 input-group start-date">
													<input id="input-start-date" type="text" name="date"
														class="form-control"> <span
														class="input-group-addon glyphicon glyphicon-calendar"></span>
												</div>
											</div>
											<div class="col-sm-4">
												<button id="query-loop-btn" type="submit" class="btn btn-success">查询</button>
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-thing-number">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">施工大事信息</h4>
									</div>
									<div class="modal-body">
										<form class="form-inline" role="form" method="post"
											action="/GPSG/construct-web/sgdsnumber.action">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-start-date">项目编号：</label>
												<div class="col-sm-7 input-group">
													<input id="input-start-date" type="text" name="proId"
														class="form-control">
												</div>
											</div>
											<div class="col-sm-4">
												<button type="submit" class="btn btn-success">查询</button>
											</div>
										</form>
									</div>


									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-detail">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">施工大事信息</h4>
									</div>


									<div class="modal-body">
										<table class="table">
											<tbody>
												<tr>
													<td>索引</td>
													<td id="index1"></td>
												</tr>

												<tr>
													<td>日期</td>
													<td id="a"></td>
												</tr>
												<tr>
													<td>主题</td>
													<td id="b"></td>
												</tr>
												<tr>
													<td>详细描述</td>
													<td id="c"></td>
												</tr>
												<tr>
													<td>负责人</td>
													<td id="d"></td>
												</tr>
												<tr>
													<td>项目编号</td>
													<td id="e"></td>
												</tr>
												<tr>
													<td>东西线</td>
													<td id="u"></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						<table class="table table-condensed table-hover table-responsive">
							<tbody>
								<tr>
									<td>索引</td>
									<td>日期</td>
									<td>主题</td>
									<td>详细描述</td>
									<td>负责人</td>
									<td>东西线</td>
									<td>项目编号</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.sgdsList" id="sgds">
									<tr>
										<td id="index"><s:property value="#sgds.dsIndx" />
										</td>
										<td id="aa"><s:property value="#sgds.dsDate" />
										</td>
										<td id="bb"><s:property value="#sgds.dsTitl" />
										</td>
										<td id="cc"><s:property value="#sgds.dsDspt" />
										</td>
										<td id="dd"><s:property value="#sgds.dsPzr" />
										</td>
										<td id="uu"><s:property value="#sgds.isEast" />
										</td>
										<td id="ee"><s:property value="#sgds.proId" />
										</td>

										<td><a id="detail" class="btn-detail" href="#">详细</a>
										</td>

									</tr>
								</s:iterator>
							</tbody>
						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="get"
									action="/GPSG/construct-web/thing.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent" href="thing.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="thing.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="thing.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="thing.action?pageNow=<s:property value="#page.totalPage"/>
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