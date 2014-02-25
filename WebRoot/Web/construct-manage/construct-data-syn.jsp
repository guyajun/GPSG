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
<script src="/GPSG/Web/construct-manage/construct-data-syn.js"></script>
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
								href="/GPSG/construct-web/pose.action" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action"
								class="btn btn-primary btn-lg">同步注浆数据</a> <a id="a-thing"
								href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
						</div>
					</div>
				</div>
			</div>
			<div id="div-syn" class="row ">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">同步注浆信息</h3>
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
								<ul class="dropdown-menu" role="menu"><!-- 
									<li><a href="#" data-toggle="modal"
										data-target="#modal-syn-date">按时间查询</a>
									</li> -->
									<li><a href="#" data-toggle="modal"
										data-target="#modal-syn-loop">按环号查询</a>
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
									<li><a id="date-md" href="/GPSG/construct-web/draw6.action">绘制时间-浆液比重</a>
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
									<li><a id="excel-all" href="#" data-toggle="modal"
										data-target="#modal-total">导出全部记录</a>
									</li>
								</ul>
							</div>
						</div>
						<table class="table table-condensed table-hover table-responsive">
							<tbody>
								<tr>
									<td>序号</td>
									<td>推进环号</td>
									<td>项目编号</td>
									<td>推进日期</td>
									<td>压力设定上限</td>
									<td>压力实际上限</td>
									<td>压力设定下限</td>
									<td>压力实际下限</td>
									<td>压力检测时间</td>
									<td>方量设定值</td>
									<td>方量实际值</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.groutList" id="syn">
									<tr>
										<td id="index1"><s:property value="#syn.id" /></td>
										<td id="aa"><s:property value="#syn.tunnelLoop" /></td>
										<td id="bb"><s:property value="#syn.proId" /></td>
										<td id="cc"><s:date name="#syn.today" format="yyyy-MM-dd" />
										</td>
										<td id="dd"><s:property value="#syn.setUpperLimit" /></td>
										<td id="ee"><s:property value="#syn.actualUpperLimit" />
										</td>
										<td id="ff"><s:property value="#syn.setLowerLimit" /></td>
										<td id="gg"><s:property value="#syn.actualLowerLimit" />
										</td>
										<td id="hh"><s:property value="#syn.checkPressureTime" />
										</td>
										<td id="ii"><s:property value="#syn.groutSetValue" /></td>
										<td id="jj"><s:property value="#syn.groutActualValue" />
										</td>
										<td><a id="detail" class="btn-detail" href="#">详细</a></td>
										<td id="kk" class="hide"><s:property
												value="#syn.serifluxRatio" /></td>
										<td id="ll" class="hide"><s:property value="#syn.slump" />
										</td>
										<td id="mm" class="hide"><s:property
												value="#syn.accident" /></td>
										<td id="nn" class="hide"><s:property value="#syn.memo" />
										</td>
										<td id="oo" class="hide"><s:property value="#syn.creator" />
										</td>
										<td id="pp" class="hide"><s:property
												value="#syn.createDate" /></td>
										<td id="qq" class="hide"><s:property value="#syn.status" />
										</td>
										<td id="rr" class="hide"><s:property value="#syn.isEast" />
										</td>

									</tr>
								</s:iterator>

							</tbody>
						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="get"
									action="/GPSG/construct-web/syn.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent" href="syn.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="syn.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="syn.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="syn.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
										</a>
									</s:if>
								</form>
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
												action="/GPSG/construct-web/excelAll6.action"
												class="form-inline" role="form">
												<div class="form-group col-sm-9">
													<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath"
															value="d:/同步注浆信息.xls" type="text" class="form-control">
													</div>
												</div>
												<div class="col-sm-3">
													<button type="submit" class="btn btn-success">导出</button>
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
						<div class="modal fade" id="modal-syn-date">
							<div class="modal-dialog">
								<div class="modal-content">
									<form class="form-inline" role="form" method="post"
										action="/GPSG/construct-web/syndate.action">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">同步注浆</h4>
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
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-pose-number">
				<div class="modal-dialog">
					<div class="modal-content">
						<form class="form-horizontal"
							action="/GPSG/construct-web/number.action" role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">盾构/管片姿态信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label class="col-sm-4 control-label"
										for="input-measure-number">请输入项目编号：</label>
									<div class="col-sm-5 input-group">
										<input id="input-measure-number" type="text" name="number"
											class="form-control">
									</div>
								</div>
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-syn-loop">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">盾构推进信息查询</h4>
						</div>
						<div class="modal-body">
							<form id="form-query-by-loop" method="post"
								action="/GPSG/construct-web/synLoop.action" class="form-inline"
								role="form">
								<div class="form-group col-sm-8">
									<label class="col-sm-5 control-label" for="input-start-date">环号：</label>
									<div class="col-sm-7 input-group">
										<input id="tunnelLoop" name="tunnelLoop" type="text"
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
							<h4 class="modal-title" id="myModalLabel">土质信息</h4>
						</div>
						<div class="modal-body">
							<table class="table">
								<tbody>
									<tr>
										<td>序号</td>
										<td id="index1"></td>
									</tr>

									<tr>
										<td>推进环号</td>
										<td id="a"></td>
									</tr>
									<tr>
										<td>项目编号</td>
										<td id="b"></td>
									</tr>
									<tr>
										<td>推进日期</td>
										<td id="c"></td>
									</tr>
									<tr>
										<td>压力设定上限</td>
										<td id="d"></td>
									</tr>
									<tr>
										<td>压力实际上限</td>
										<td id="e"></td>
									</tr>
									<tr>
										<td>压力设定下限</td>
										<td id="f"></td>
									</tr>
									<tr>
										<td>压力实际下限</td>
										<td id="g"></td>
									</tr>
									<tr>
										<td>压力检测时间</td>
										<td id="h"></td>
									</tr>
									<tr>
										<td>方量设定值</td>
										<td id="i"></td>
									</tr>
									<tr>
										<td>方量实际值</td>
										<td id="j"></td>
									</tr>
									<tr>
										<td>浆液指标</td>
										<td id="k"></td>
									</tr>
									<tr>
										<td>坍落度</td>
										<td id="l"></td>
									</tr>
									<tr>
										<td>意外情况</td>
										<td id="m"></td>
									</tr>
									<tr>
										<td>备注</td>
										<td id="n"></td>
									</tr>
									<tr>
										<td>记录人</td>
										<td id="o"></td>
									</tr>
									<tr>
										<td>记录时间</td>
										<td id="p"></td>
									</tr>
									<tr>
										<td>状态</td>
										<td id="q"></td>
									</tr>

									<tr>
										<td>东西线</td>
										<td id="r"></td>
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
			scrolling="no" height="60" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>