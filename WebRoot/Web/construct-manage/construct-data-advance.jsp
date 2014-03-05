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
<script src="/GPSG/Web/construct-manage/construct-data-advance.js"></script>
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
								class="btn btn-warning btn-lg">盾构推进数据</a> <a id="a-pose"
								href="/GPSG/construct-web/pose.action" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action"
								class="btn btn-primary">同步注浆数据</a> <a id="a-thing"
								href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
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
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#" data-toggle="modal"
									data-target="#modal-by-date">按时间查询</a>
								</li>
								<li><a href="#" data-toggle="modal"
									data-target="#modal-advance-loop">按环号查询</a>
								</li>
							</ul>
						</div><!-- 
						<div class="btn-group">
							<button type="button" class="btn btn-primary">绘制曲线</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="/GPSG/construct-web/chartAdvance.action">按时间</a>
								</li>
								<!-- <li>
								<a href="#" data-toggle="modal" data-target="#modal-shield-advance-loop">按环号</a>
							</li> 
							</ul>
						</div> -->
						<div class="btn-group">
							<button type="button" class="btn btn-primary">EXCEL导出</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#" data-toggle="modal"
									data-target="#modal-total">导出全部记录</a>
								</li>
								<li><a href="#" data-toggle="modal"
									data-target="#modal-excel">按环号区间导出</a>
								</li>
							</ul>
						</div>
						<div class="modal fade" id="modal-excel">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form1" method="post"
										action="/GPSG/construct-web/advance_excelBetween.action"
										class="form-horizontal" role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">按需导出</h4>
										</div>
										<div class="modal-body">
									    	<div id="alert1" class="alert alert-danger text-center hide"></div>
											<div class="row">
												<div class="form-group">
													<label class="col-sm-6 control-label" for="gp-high-start-loop">起始环号：</label>
													<div class="col-sm-6">
														<input id="gp-high-start-loop" name="loop1" value="1" type="text"
															class="form-control">
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label" for="gp-high-end-loop">结束环号：</label>
													<div class="col-sm-6">
														<input id="gp-high-end-loop" name="loop2" value="1" type="text"
															class="form-control">
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label" for="excelPath">导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath" value="d:/盾构推进区间查询.xls"
															type="text" class="form-control">
													</div>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button id="button1" type="button" class="btn btn-success">EXCEL导出</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">关闭</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-total">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">EXCEL导出所有记录</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<form id="form-total1" method="post"
												action="/GPSG/construct-web/excelAdvance.action"
												class="form-inline" role="form">
												<div class="form-group col-sm-9">
													<label class="col-sm-6 control-label" for="excelPath">导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath" value="d:/盾构推进.xls"
															type="text" class="form-control">
													</div>
												</div>
												<div class="col-sm-3">
													<button id="export-all-btn1" type="submit" class="btn btn-success">EXCEL导出</button>
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
						<div class="modal fade" id="modal-by-date">
							<div class="modal-dialog">
								<div class="modal-content">
									<form class="form-inline" role="form" method="post"
										action="/GPSG/construct-web/advance_getByDate.action">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">盾构推进参数曲线</h4>
										</div>
										<div class="modal-body">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-start-date">推进日期：</label>
												<div class="col-sm-7 input-group start-date">
													<input name="date" type="text" class="form-control">
													<span
														class="input-group-addon glyphicon glyphicon-calendar"></span>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-success">查询</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-shield-advance-loop">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">盾构推进参数曲线</h4>
									</div>
									<div class="modal-body">
										<form class="form-horizontal" role="form">
											<div class="form-group">
												<label class="col-sm-4 control-label"
													for="input-shield-horizontal-start-loop">请输入环号：</label>
												<div class="col-sm-5 input-group">
													<input id="input-shield-horizontal-start-loop" type="text"
														class="form-control">
												</div>
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-success">绘制曲线</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Close</button>
									</div>
								</div>
							</div>
						</div>

						<div class="modal fade" id="modal-by-date1">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">盾构推进信息查询</h4>
									</div>
									<div class="modal-body">
										<form id="form-query-by-date" class="form-inline" role="form">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-start-date">推进日期：</label>
												<div class="col-sm-7 input-group start-date">
													<input id="input-start-date" type="text"
														class="form-control"> <span
														class="input-group-addon glyphicon glyphicon-calendar"></span>
												</div>
											</div>
											<div class="col-sm-4">
												<button id="querydate" type="submit" class="btn btn-success">查询</button>
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
						<div class="modal fade" id="modal-advance-loop">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form2" class="form-inline" role="form" method="post"
										action="/GPSG/construct-web/advance_getByLoop.action">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">盾构推进信息查询</h4>
										</div>
										<div class="modal-body">
											<div class="form-group col-sm-8">
												<label class="col-sm-5 control-label" for="input-loop">环号：</label>
												<div class="col-sm-7 input-group">
													<input id="input-loop" name="loop" type="text"
														class="form-control">
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button id="button2" type="button" class="btn btn-success">查询</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<table class="table">
							<tbody>
								<tr>
									<td>序号</td>
									<td>推进环号</td>
									<td>项目编号</td>
									<td>推进日期</td>
									<td>推进开始时间</td>
									<td>推进结束时间</td>
									<td>掘进速度</td>
									<td>盾构总推力</td>
									<td>刀盘扭矩</td>
									<td>大刀盘转速</td>
									<td>贯入度速度</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.list" id="advance">
									<tr>
										<td id="index"><s:property value="#advance.id" />
										</td>
										<td id="aa"><s:property value="#advance.tunnelLoop" />
										</td>
										<td id="bb"><s:property value="#advance.proId" />
										</td>
										<td id="cc"><s:property value="#advance.today" />
										</td>
										<td id="dd"><s:property value="#advance.startTime" />
										</td>
										<td id="ee"><s:property value="#advance.endTime" />
										</td>
										<td id="ff"><s:property value="#advance.speed" />
										</td>
										<td id="gg"><s:property
												value="#advance.shieldPushStrength" />
										</td>
										<td id="hh"><s:property value="#advance.cutterTorque" />
										</td>
										<td id="ii"><s:property
												value="#advance.cutterRotateSpeed" />
										</td>
										<td id="jj"><s:property value="#advance.penetrationSpeed" />
										</td>
										<td><a id="detail" class="btn-detail" href="#">详细</a>
										</td>
										<td id="ll" class="hide"><s:property
												value="#advance.blenderTorqueLr" />
										</td>
										<td id="mm" class="hide"><s:property
												value="#advance.jackStrokeStartAbcdef" />
										</td>
										<td id="nn" class="hide"><s:property
												value="#advance.jackStrokeEndAbcdef" />
										</td>
										<td id="oo" class="hide"><s:property
												value="#advance.jackOilStartAbcdef" />
										</td>
										<td id="pp" class="hide"><s:property
												value="#advance.jackOilEndAbcdef" />
										</td>
										<td id="qq" class="hide"><s:property
												value="#advance.bubbleSetValue" />
										</td>
										<td id="rr" class="hide"><s:property
												value="#advance.bubblePressureSme" />
										</td>
										<td id="ss" class="hide"><s:property
												value="#advance.bubbleLiduidSme" />
										</td>
										<td id="tt" class="hide"><s:property
												value="#advance.inFlowSme" />
										</td>
										<td id="uu" class="hide"><s:property
												value="#advance.outFlowSme" />
										</td>
										<td id="vv" class="hide"><s:property
												value="#advance.inDensitySme" />
										</td>
										<td id="ww" class="hide"><s:property
												value="#advance.outDensitySme" />
										</td>
										<td id="xx" class="hide"><s:property
												value="#advance.oilInjectionFmr" />
										</td>
										<td id="yy" class="hide"><s:property
												value="#advance.oilRemainFmr" />
										</td>
										<td id="zz" class="hide"><s:property
												value="#advance.oilUseFmr" />
										</td>
										<td id="aaa" class="hide"><s:property
												value="#advance.oilTotalFmr" />
										</td>
										<td id="bbb" class="hide"><s:property
												value="#advance.creator" />
										</td>
										<td id="ccc" class="hide"><s:property
												value="#advance.createDate" />
										</td>
										<td id="ddd" class="hide"><s:property
												value="#advance.memo" />
										</td>
										<td id="eee" class="hide"><s:property
												value="#advance.status" />
										</td>
										<td id="fff" class="hide"><s:property
												value="#advance.isEast" />
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="post"
									action="advance_getAllRecord.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent"
											href="advance_getAllRecord.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="advance_getAllRecord.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="advance_getAllRecord.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="advance_getAllRecord.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
										</a>
									</s:if>

								</form>
							</div>
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
							<h4 class="modal-title" id="myModalLabel">盾构推进详细信息</h4>
						</div>
						<div class="modal-body">
							<table class="table">
								<tbody>
									<tr>
										<td>序号：</td>
										<td id="index1"></td>
									</tr>
									<tr>
										<td>推进环号：</td>
										<td id="a"></td>
									</tr>
									<tr>
										<td>项目编号：</td>
										<td id="b"></td>
									</tr>
									<tr>
										<td>推进日期：</td>
										<td id="c"></td>
									</tr>
									<tr>
										<td>推进开始时间：</td>
										<td id="d"></td>
									</tr>
									<tr>
										<td>推进结束时间：</td>
										<td id="e"></td>
									</tr>
									<tr>
										<td>掘进速度：</td>
										<td id="f"></td>
									</tr>
									<tr>
										<td>盾构总推力：</td>
										<td id="g"></td>
									</tr>
									<tr>
										<td>刀盘扭矩：</td>
										<td id="h"></td>
									</tr>
									<tr>
										<td>大刀盘转速 ：</td>
										<td id="i"></td>
									</tr>
									<tr>
										<td>贯入度速度：</td>
										<td id="j"></td>
									</tr>
									<tr>
										<td>搅拌机扭矩左/右：</td>
										<td id="k"></td>
									</tr>
									<tr>
										<td>千斤顶行程_推进开始A/B/C/D/E/F：</td>
										<td id="l"></td>
									</tr>
									<tr>
										<td>千斤顶行程_推进结束A/B/C/D/E/F：</td>
										<td id="m"></td>
									</tr>
									<tr>
										<td>千斤顶油压_推进开始A/B/C/D/E/F：</td>
										<td id="n"></td>
									</tr>
									<tr>
										<td>千斤顶油压_推进结束A/B/C/D/E/F：</td>
										<td id="o"></td>
									</tr>
									<tr>
										<td>气泡仓设定值：</td>
										<td id="p"></td>
									</tr>
									<tr>
										<td>气泡仓压力推进开始/中途/结束：</td>
										<td id="q"></td>
									</tr>
									<tr>
										<td>气泡仓液位推进开始/中途/结束 ：</td>
										<td id="r"></td>
									</tr>
									<tr>
										<td>进泥流量推进开始/中途/结束：</td>
										<td id="s"></td>
									</tr>
									<tr>
										<td>排泥流量推进开始/中途/结束：</td>
										<td id="t"></td>
									</tr>
									<tr>
										<td>进泥密度推进开始/中途/结束：</td>
										<td id="u"></td>
									</tr>
									<tr>
										<td>排泥密度推进开始/中途/结束：</td>
										<td id="v"></td>
									</tr>
									<tr>
										<td>盾尾油脂注入量前部/中部/后部：</td>
										<td id="w"></td>
									</tr>
									<tr>
										<td>盾尾油脂剩余量前部/中部/后部：</td>
										<td id="x"></td>
									</tr>
									<tr>
										<td>盾尾油脂用量前部/中部/后部：</td>
										<td id="y"></td>
									</tr>
									<tr>
										<td>用量总量：</td>
										<td id="z"></td>
									</tr>
									<tr>
										<td>记录人：</td>
										<td id="3a"></td>
									</tr>
									<tr>
										<td>记录日期 ：</td>
										<td id="3b"></td>
									</tr>
									<tr>
										<td>备注：</td>
										<td id="3c"></td>
									</tr>
									<tr>
										<td>报表状态：</td>
										<td id="3d"></td>
									</tr>
									<tr>
										<td>班次：</td>
										<td id="3e"></td>
									</tr>
									<tr>
										<td>东西线（0-东 1-西）：</td>
										<td id="3f"></td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60px" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>