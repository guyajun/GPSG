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
<script src="/GPSG/Web/construct-manage/construct-data-pose.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="well">
				<a id="a-mud" href="/GPSG/construct-web/soil.action"
					class="btn btn-danger">剖面位置/土质图</a> <a id="a-facility"
					href="/GPSG/construct-web/facility.action" class="btn btn-primary">沿线重要设施</a>
				<a id="a-measure" href="/GPSG/construct-web/measure.action"
					class="btn btn-success">测点布置情况</a> <a id="a-advance"
					href="/GPSG/construct-web/advance_getAllRecord.action"
					class="btn btn-warning">盾构推进数据</a> <a id="a-pose"
					href="/GPSG/construct-web/pose.action"
					class="btn btn-success btn-lg">盾构/管片姿态</a> <a id="a-syn"
					href="/GPSG/construct-web/syn.action" class="btn btn-primary">同步注浆数据</a>
				<a id="a-thing" href="/GPSG/construct-web/thing.action"
					class="btn btn-danger">施工大事记录</a>
			</div>
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title">盾构/管片姿态信息</h3>
				</div>
				<div class="panel-body">
					<div class="well">
						<div class="btn-group">
							<button type="button" class="btn btn-primary">查询信息</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#" data-toggle="modal"
									data-target="#modal-pose-loop">按环号查询</a>
								</li>
							</ul>
						</div>
						<div class="modal fade" id="modal-pose-loop">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form-query-by-loop" class="form-horizontal"
										action="/GPSG/construct-web/getposeBytunnelLoop.action"
										role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">盾构/管片姿态信息</h4>
										</div>
										<div class="modal-body">
											<div class="form-group">
												<label class="col-sm-4 control-label" for="input-loop">请输入环号：</label>
												<div class="col-sm-5 input-group">
													<input id="input-loop" name="tunnelLoop" type="text"
														class="form-control">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-sm-4 control-label">请选择东西线：</label>
												<div class="col-lg-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="0" checked> </span> <input
															type="text" class="form-control" value="东线">
													</div>
												</div>
												<div class="col-lg-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="1"> </span> <input
															type="text" class="form-control" value="西线">
													</div>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button id="query-loop-btn" type="button"
												class="btn btn-success">查询</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">关闭</button>
										</div>
									</form>
								</div>
							</div>
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
									data-target="#modal-total">导出全部记录</a>
								</li>
							</ul>
						</div>
						<div class="btn-group">
							<button type="button" class="btn btn-primary">绘制管片姿态曲线</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#" data-toggle="modal"
									data-target="#modal-gp-vertical">管片高程偏差曲线</a>
								</li>
								<li><a href="#" data-toggle="modal"
									data-target="#modal-gp-horizontal">管片平面偏差曲线</a>
								</li>
							</ul>
						</div>
						<div class="btn-group">
							<a href="#" data-toggle="modal" data-target="#modal-four"
								class="btn btn-primary">绘制盾构姿态曲线</a>
						</div>
						<div class="modal fade" id="modal-four">
							<div class="modal-dialog">
								<div class="modal-content">
									<form method="post"
										action="/GPSG/Web/construct-manage/shield-pose-curve.jsp"
										id="form-four" class="form-horizontal" role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">盾构偏差曲线</h4>
										</div>
										<div class="modal-body">
											<div id="alert3" class="alert alert-danger text-center hide"></div>
											<div class="form-group">
												<label class="col-sm-4 control-label"
													for="shield-start-loop">起始环号：</label>
												<div class="col-sm-5 input-group">
													<input id="shield-start-loop" name="startLoop" type="text"
														class="form-control">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-4 control-label" for="shield-end-loop">结束环号：</label>
												<div class="col-sm-5 input-group">
													<input id="shield-end-loop" name="endLoop" type="text"
														class="form-control"> <input id="checked"
														name="checked" type="hidden" />
												</div>
											</div>
											<div class="form-group row">
												<label class="col-sm-4 control-label">请选择东西线：</label>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="0" checked> </span> <input
															type="text" class="form-control" value="东线">
													</div>
												</div>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="1"> </span> <input
															type="text" class="form-control" value="西线">
													</div>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-5 col-sm-offset-1">
													<div class="input-group">
														<span class="input-group-addon"> <input
															class="check-one" value="qiekougaocheng" type="checkbox" />
														</span> <input type="text" value="切口高程偏差" class="form-control" />
													</div>
												</div>
												<div class="col-sm-5">
													<div class="input-group">
														<span class="input-group-addon"> <input
															class="check-one" value="qiekoupingmian" type="checkbox" />
														</span> <input type="text" value="切口平面偏差" class="form-control">
													</div>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-5 col-sm-offset-1">
													<div class="input-group">
														<span class="input-group-addon"> <input
															class="check-one" value="dunweigaocheng" type="checkbox" />
														</span> <input type="text" value="盾尾高程偏差" class="form-control" />
													</div>
												</div>
												<div class="col-sm-5">
													<div class="input-group">
														<span class="input-group-addon"> <input
															class="check-one" value="dunweipingmian" type="checkbox" />
														</span> <input type="text" value="盾尾平面偏差" class="form-control" />
													</div>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button id="btn-click" type="button" class="btn btn-success">绘制曲线</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
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
										<h4 class="modal-title" id="myModalLabel">导出所有记录</h4>
									</div>
									<div class="modal-body">
										<form id="form-total" method="post"
											action="/GPSG/construct-web/excelAll5.action"
											class="form-horizontal" role="form">
											<div class="form-group row">
												<label class="col-sm-5 control-label" for="excelPath">请输入EXCEL导出路径：</label>
												<div class="col-sm-6">
													<input id="excelPath" name="excelPath"
														value="d:/盾构和管片姿态信息.xls" type="text" class="form-control">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-sm-5 control-label">请选择东西线：</label>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="0" checked> </span> <input
															type="text" class="form-control" value="东线">
													</div>
												</div>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="1"> </span> <input
															type="text" class="form-control" value="西线">
													</div>
												</div>
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button id="export-all-btn" type="button"
											class="btn btn-success">导出</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
									</div>
								</div>
							</div>
						</div>

						<div class="modal fade" id="modal-gp-vertical">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form1" method="post"
										action="/GPSG/Web/construct-manage/gp-pose-curve.jsp"
										class="form-horizontal" role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">管片高程偏差曲线</h4>
										</div>
										<div class="modal-body">
											<div id="alert1" class="alert alert-danger text-center hide"></div>
											<div class="form-group">
												<label class="col-sm-4 control-label"
													for="gp-high-start-loop">起始环号：</label>
												<div class="col-sm-5 input-group">
													<input id="gp-high-start-loop" name="startLoop" type="text"
														class="form-control">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-4 control-label" for="gp-high-end-loop">结束环号：</label>
												<div class="col-sm-5 input-group">
													<input id="gp-high-end-loop" name="endLoop" type="text"
														class="form-control">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-sm-4 control-label">请选择东西线：</label>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="0" checked> </span> <input
															type="text" class="form-control" value="东线">
													</div>
												</div>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="1"> </span> <input
															type="text" class="form-control" value="西线">
													</div>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button id="button1" type="button" class="btn btn-success">绘制曲线</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-gp-horizontal">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form2" method="post"
										action="/GPSG/Web/construct-manage/gp-pose-pingmian-curve.jsp"
										class="form-horizontal" role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">管片平面偏差曲线</h4>
										</div>
										<div class="modal-body">
											<div id="alert2" class="alert alert-danger text-center hide"></div>
											<div class="form-group">
												<label class="col-sm-4 control-label"
													for="gp-pan-start-loop">起始环号：</label>
												<div class="col-sm-5 input-group">
													<input id="gp-pan-start-loop" name="startLoop" type="text"
														class="form-control">
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-4 control-label" for="gp-pan-end-loop">结束环号：</label>
												<div class="col-sm-5 input-group">
													<input id="gp-pan-end-loop" type="text" name="endLoop"
														class="form-control">
												</div>
											</div>
											<div class="form-group row">
												<label class="col-sm-4 control-label">请选择东西线：</label>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="0" checked> </span> <input
															type="text" class="form-control" value="东线">
													</div>
												</div>
												<div class="col-sm-3">
													<div class="input-group">
														<span class="input-group-addon"> <input
															type="radio" name="isEast" value="1"> </span> <input
															type="text" class="form-control" value="西线">
													</div>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button id="button2" type="button" class="btn btn-success">绘制曲线</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
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
									<h4 class="modal-title" id="myModalLabel">土质信息</h4>
								</div>
								<div class="modal-body">
									<table class="table">
										<tbody>
											<tr>
												<td>序号</td>
												<td id="xuhao1"></td>
											</tr>
											<tr>
												<td>推进环号</td>
												<td id="index1"></td>
											</tr>
											<tr>
												<td>项目编号</td>
												<td id="a"></td>
											</tr>
											<tr>
												<td>设计线性</td>
												<td id="b"></td>
											</tr>
											<tr>
												<td>设计坡度</td>
												<td id="c"></td>
											</tr>
											<tr>
												<td>盾构坡度</td>
												<td id="d"></td>
											</tr>
											<tr>
												<td>盾构转角</td>
												<td id="e"></td>
											</tr>
											<tr>
												<td>切口里程</td>
												<td id="f"></td>
											</tr>
											<tr>
												<td>盾构姿态高程切口/盾尾</td>
												<td id="g"></td>
											</tr>
											<tr>
												<td>盾构姿态平面切口/盾尾</td>
												<td id="h"></td>
											</tr>
											<tr>
												<td>管片姿态高程</td>
												<td id="i"></td>
											</tr>
											<tr>
												<td>管片姿态平面</td>
												<td id="j"></td>
											</tr>
											<tr>
												<td>盾尾间隙（拼装前）上/右上/右/右下/下/左下/左/左上</td>
												<td id="k"></td>
											</tr>
											<tr>
												<td>管片里程</td>
												<td id="l"></td>
											</tr>
											<tr>
												<td>管片横径</td>
												<td id="m"></td>
											</tr>
											<tr>
												<td>管片竖径</td>
												<td id="n"></td>
											</tr>
											<tr>
												<td>封顶块位置</td>
												<td id="o"></td>
											</tr>
											<tr>
												<td>观测者</td>
												<td id="p"></td>
											</tr>
											<tr>
												<td>检查者</td>
												<td id="q"></td>
											</tr>
											<tr>
												<td>观测时间</td>
												<td id="r"></td>
											</tr>
											<tr>
												<td>备注</td>
												<td id="s"></td>
											</tr>
											<tr>
												<td>提交状态</td>
												<td id="t"></td>
											</tr>
											<tr>
												<td>上环间隙</td>
												<td id="u"></td>
											</tr>
											<tr>
												<td>上环横竖径</td>
												<td id="v"></td>
											</tr>
											<tr>
												<td>东西线(0—东线 1—西线)</td>
												<td id="w"></td>
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
				<div class="container">
					<table class="table">
						<tbody>
							<tr>
								<td>序号</td>
								<td>推进环号</td>
								<td>项目编号</td>
								<td>设计线性</td>
								<td>设计坡度</td>
								<td>盾构坡度</td>
								<td>盾构转角</td>
								<td>切口里程</td>
								<td>盾构姿态高程切口/盾尾</td>
								<td>盾构姿态平面切口/盾尾</td>
								<td>操作</td>

								<!-- 
								<td>管片姿态高程</td>
								<td>管片姿态平面</td>
								<td>盾尾间隙（拼装前）上/右上/右/右下/下/左下/左/左上</td>
								<td>管片里程</td>
								<td>管片横径</td>
								<td>管片竖径</td>
								<td>封顶块位置</td>
								<td>观测者</td>
								<td>检查者</td>
								<td>观测时间</td>
								<td>备注</td>
								<td>提交状态</td>
								<td>上环间隙</td>
								<td>上环横竖径</td>
								<td>东西线(0—东线 1—西线)</td> -->
							</tr>
							<%
								int i = 0;
							%>
							<s:iterator value="#request.poseList" id="pose">
								<tr>
									<td id="xuhao"><%=++i%></td>
									<td id="index"><s:property value="#pose.tunnelLoop" />
									</td>
									<td id="aa"><s:property value="#pose.proId" />
									</td>
									<td id="bb"><s:property value="#pose.designLinear" />
									</td>
									<td id="cc"><s:property value="#pose.designSlope" />
									</td>
									<td id="dd"><s:property value="#pose.shieldSlope" />
									</td>
									<td id="ee"><s:property value="#pose.rotateAngle" />
									</td>
									<td id="ff"><s:property value="#pose.incisionMileage" />
									</td>
									<td id="gg"><s:property value="#pose.shieldVerticalTwo" />
									</td>
									<td id="hh"><s:property value="#pose.shieldPlaneTwo" />
									</td>
									<td><a id="detail" class="btn-detail" href="#">详细</a>
									</td>


									<td id="ii" class="hide"><s:property
											value="#pose.gpVertical" />
									</td>
									<td id="jj" class="hide"><s:property value="#pose.gpPlane" />
									</td>
									<td id="kk" class="hide"><s:property
											value="#pose.shieldTailEight" />
									</td>
									<td id="ll" class="hide"><s:property
											value="#pose.gpMiliage" />
									</td>
									<td id="mm" class="hide"><s:property
											value="#pose.transverseDiameter" />
									</td>
									<td id="nn" class="hide"><s:property
											value="#pose.shaftDiameter" />
									</td>
									<td id="oo" class="hide"><s:property
											value="#pose.capBlockLocation" />
									</td>
									<td id="pp" class="hide"><s:property value="#pose.looker" />
									</td>
									<td id="qq" class="hide"><s:property value="#pose.checker" />
									</td>
									<td id="rr" class="hide"><s:property
											value="#pose.checkDate" />
									</td>
									<td id="ss" class="hide"><s:property value="#pose.memo" />
									</td>
									<td id="tt" class="hide"><s:property value="#pose.status" />
									</td>
									<td id="uu" class="hide"><s:property value="#pose.lastGap" />
									</td>
									<td id="vv" class="hide"><s:property value="#pose.lastHpd" />
									</td>
									<td id="ww" class="hide"><s:property value="#pose.isEast" />
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
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