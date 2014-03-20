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
			<!-- <div class="row">
				<div class="col-sm-12">
				<div class="panel panel-info" style="height:150px;">
					<div class="panel-heading">查询事项</div>
					<div class="panel-body"> -->
						<div class="well">
							<a id="a-mud" href="/GPSG/construct-web/soil.action" class="btn btn-danger btn-lg">剖面位置/土质图</a>
							<a id="a-facility" href="/GPSG/construct-web/facility.action" class="btn btn-primary">沿线重要设施</a>
							<a id="a-measure" href="/GPSG/construct-web/measure.action" class="btn btn-success">测点布置情况</a>
							<a id="a-advance" href="/GPSG/construct-web/advance_getAllRecord.action" class="btn btn-warning">盾构推进数据</a>
							<a id="a-pose" href="/GPSG/construct-web/pose.action" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action" class="btn btn-primary">同步注浆数据</a>
							<a id="a-thing" href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
						</div>
				<!-- </div>
				</div>
				</div>
			</div> -->
			<div id="div-mud" class="row">
			<div class="col-sm-12">
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
								<!-- 	<li>
										<a id="by-date" href="#" data-toggle="modal" data-target="#modal-mud-date">按时间查询</a>
									</li> -->
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
								<!-- 	<li>
										<a id="excel-part" href="#" data-toggle="modal" data-target="#modal-by-condition">按查询条件导出</a>
									</li> -->
								</ul>
							</div><!-- 
							<div class="btn-group">
								<button type="button" class="btn btn-primary">绘制曲线</button>
								<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
									<span class="caret"></span>
									<span class="sr-only">Toggle Dropdown</span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li>
										<a id="date-md" href="/GPSG/construct-web/draw.action">绘制时间-比重</a>
									</li>
								</ul>
							</div> -->
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
														<button id="export-all-btn" type="button" class="btn btn-success">导出</button>
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
											<h4 class="modal-title" id="myModalLabel">按环号查询</h4>
										</div>
										<div class="modal-body">
											<form id="form-query-by-loop" method="post" action="/GPSG/construct-web/queryLoop.action" class="form-inline" role="form">
												<div class="form-group col-sm-8">
													<label class="col-sm-5 control-label" for="input-loop">环号：</label>
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
							<div class="modal fade" id="modal-detail">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">土质信息</h4>
										</div>
										<div class="modal-body">
											<table class="table">
												<tbody>
													<tr>
														<td>索引号</td>
														<td id="index1"></td>
													</tr>
													<tr>
														<td>层号</td>
														<td id="a"></td>
													</tr>
													<tr>
														<td>土层名称</td>
														<td id="b"></td>
													</tr>
													<tr>
														<td>环号</td>
														<td id="loop1"></td>
													</tr>
													<tr>
														<td>含水量</td>
														<td id="c"></td>
													</tr>
													<tr>
														<td>比重</td>
														<td id="d"></td>
													</tr>
													<tr>
														<td>空隙比</td>
														<td id="e"></td>
													</tr>
													<tr>
														<td>内摩擦角</td>
														<td id="f"></td>
													</tr>
													<tr>
														<td>水平渗透系数</td>
														<td id="g"></td>
													</tr>
													<tr>
														<td>垂直渗透系数</td>
														<td id="h"></td>
													</tr>
													<tr>
														<td>粘聚力</td>
														<td id="i"></td>
													</tr>
													<tr>
														<td>压缩模量</td>
														<td id="j"></td>
													</tr>
													<tr>
														<td>标准贯入</td>
														<td id="l"></td>
													</tr>
													<tr>
														<td>压缩系数</td>
														<td id="m"></td>
													</tr>
													<tr>
														<td>静止侧压系数</td>
														<td id="n"></td>
													</tr>
													<tr>
														<td>塑限</td>
														<td id="o"></td>
													</tr>
													<tr>
														<td>液限</td>
														<td id="p"></td>
													</tr>
													<tr>
														<td>液性指标</td>
														<td id="q"></td>
													</tr>
													<tr>
														<td>塑性指标</td>
														<td id="r"></td>
													</tr>
													<tr>
														<td>单轴抗压</td>
														<td id="s"></td>
													</tr>
													<tr>
														<td>石英含量</td>
														<td id="t"></td>
													</tr>
													<tr>
														<td>isEast</td>
														<td id="u"></td>
													</tr>
												</tbody>
											</table>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
										</div>
									</div>
								</div>
							</div>
						<table class="table">
							<tbody>
								<tr>
									<td>索引号</td>
									<td>层号</td>
									<td>土层名称</td>
									<td>环号</td>
									<td>含水量</td>
									<td>比重</td>
									<td>空隙比</td>
									<td>内摩擦角</td>
									<td>水平渗透系数</td>
									<td>垂直渗透系数</td>
									<td>粘聚力</td>
									<td>压缩模量</td>
									<td>操作</td>
									<!-- 
									<td>标准贯入</td>
								<td>压缩系数</td>
								<td>静止侧压系数</td>
								<td>塑限</td>
								<td>液限</td>
								<td>液性指标</td>
								<td>塑性指标</td>
								<td>单轴抗压</td>
								<td>石英含量</td>
								-->
							</tr>
							<s:iterator value="#request.soilList" id="soil">
								<tr>
									<td id="index">
										<s:property value="#soil.tcIndx"/>
									</td>
									<td id="aa">
										<s:property value="#soil.tcCno"/>
									</td>
									<td id="bb">
										<s:property value="#soil.tcTcmc"/>
									</td>
									<td id="loop">
										<s:property value="#soil.tcLoop"/>
									</td>
									<td id="cc">
										<s:property value="#soil.tcHsl"/>
									</td>
									<td id="dd">
										<s:property value="#soil.tcMd"/>
									</td>
									<td id="ee">
										<s:property value="#soil.tcKxb"/>
									</td>
									<td id="ff">
										<s:property value="#soil.tcNr"/>
									</td>
									<td id="gg">
										<s:property value="#soil.tcKh"/>
									</td>
									<td id="hh">
										<s:property value="#soil.tcKv"/>
									</td>
									<td id="ii">
										<s:property value="#soil.tcCu"/>
									</td>
									<td id="jj">
										<s:property value="#soil.tcYsml"/>
									</td>
									<td>
										<a id="detail" class="btn-detail" href="#">详细</a>
									</td>
									<td id="ll" class="hide">
										<s:property value="#soil.tcN"/>
									</td>
									<td id="mm" class="hide">
										<s:property value="#soil.tcYs"/>
									</td>
									<td id="nn" class="hide">
										<s:property value="#soil.tcCy"/>
									</td>
									<td id="oo" class="hide">
										<s:property value="#soil.tcWp"/>
									</td>
									<td id="pp" class="hide">
										<s:property value="#soil.tcWl"/>
									</td>
									<td id="qq" class="hide">
										<s:property value="#soil.tcIl"/>
									</td>
									<td id="rr" class="hide">
										<s:property value="#soil.tcIp"/>
									</td>
									<td id="ss" class="hide">
										<s:property value="#soil.tcDzky"/>
									</td>
									<td id="tt" class="hide">
										<s:property value="#soil.tcSyhl"/>
									</td>
									<td id="uu" class="hide">
										<s:property value="#soil.isEast"/>
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
					<div class="well">
						<div class="col-sm-offset-4">
							<s:set name="page" value="#request.pager"></s:set>
							<form id="form-page" method="get" action="/GPSG/construct-web/soil.action">
			<input id="input-page" name="pageNow" style="width:30px;" value="<s:property value="#page.pageNow"/>">
			/<s:property value="#page.totalPage"/>
								<s:if test="#page.hasFirst">
									<s:a target="_parent" href="soil.action?pageNow=1">首页</s:a>
								</s:if>
								<s:if test="#page.hasPre">
									<a target="_parent" href="soil.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
								</a>
							</s:if>
							<s:if test="#page.hasNext">
								<a target="_parent" href="soil.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
							</a>
						</s:if>
						<s:if test="#page.hasLast">
							<a target="_parent" href="soil.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
						</a>
					</s:if></form>
			</div>
		</div>

	</div>
</div>
</div>
</div>
</div>
</div>
<div id="footer">
<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60"
						marginheight="0" marginwidth="0"></iframe>
</div>
</body>
</html>