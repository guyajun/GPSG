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
<script src="/GPSG/Web/construct-manage/construct-data-measure.js"></script>
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
							<a id="a-mud" href="/GPSG/construct-web/soil.action"
								class="btn btn-danger">剖面位置/土质图</a> <a id="a-facility"
								href="/GPSG/construct-web/facility.action" class="btn btn-primary">沿线重要设施</a>
							<a id="a-measure" href="/GPSG/construct-web/measure.action"
								class="btn btn-success btn-lg">测点布置情况</a> <a id="a-advance"
								href="/GPSG/construct-web/advance_getAllRecord.action"
								class="btn btn-warning">盾构推进数据</a> <a id="a-pose"
								href="/GPSG/construct-web/pose.action" class="btn btn-success">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action"
								class="btn btn-primary ">同步注浆数据</a> <a id="a-thing"
								href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
						</div>
					</div>
				</div>
			</div>
			<div id="div-measure" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">测点布置情况</h3>
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
									data-target="#modal-syn-date">按索引查询</a></li> -->
								<li><a href="#" data-toggle="modal"
									data-target="#modal-measure-cedian">按测点查询</a></li>
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
								<li><a href="#" data-toggle="modal"
									data-target="#modal-total">导出全部记录</a></li>
								
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
								<li><a id="date-md" href="/GPSG/construct-web/draw.action">绘制时间-比重</a>
								</li>
							</ul>
						</div> -->
						</div>
						<table class="table table-condensed table-hover table-responsive">
					<tbody>
						<tr>
							<td>索引号</td>
							<td>测点名称</td>
							<td>测点类型</td>
							<td>隧道坐标(X)</td>
							<td>隧道坐标(Y)</td>
							<td>组坐标(X)</td>
							<td>组坐标(Y)</td>
							<td>基准</td>
							<td>相关建筑物</td>
							<td>东西线</td>
							<td>操作</td>
						</tr>

						<s:iterator value="#request.measureList" id="measure">
							<tr>
								<td id="index"><s:property value="#measure.cbIndx" />
								</td>
								<td id="aa"><s:property value="#measure.cbCdno" />
								</td>
								<td id="bb"><s:property value="#measure.cbType" />
								</td>
								<td id="cc"><s:property value="#measure.cbTx" />
								</td>
								<td id="dd"><s:property value="#measure.cbTy" /></td>
								<td id="ee"><s:property value="#measure.cbGx" />
								</td>
								<td id="ff"><s:property value="#measure.cbGy" /></td>
								<td id="gg"><s:property value="#measure.cbBase" /></td>
								<td id="hh"><s:property value="#measure.cbBldrel" />
								</td>
								<td id="ii"><s:property value="#measure.isEast" /></td>

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
							action="/GPSG/construct-web/measure.action">
							<input id="input-page" name="pageNow" style="width:30px;"
								value="<s:property value="#page.pageNow"/>"> /
							<s:property value="#page.totalPage" />
							<s:if test="#page.hasFirst">
								<s:a target="_parent" href="measure.action?pageNow=1">首页</s:a>
							</s:if>
							<s:if test="#page.hasPre">
								<a target="_parent"
									href="measure.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
								</a>
							</s:if>
							<s:if test="#page.hasNext">
								<a target="_parent"
									href="measure.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
								</a>
							</s:if>
							<s:if test="#page.hasLast">
								<a target="_parent"
									href="measure.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
								</a>
							</s:if>
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
									<div class="row">
										<form id="form-total" method="post"
											action="/GPSG/construct-web/excelAll3.action"
											class="form-inline" role="form">
											<div class="form-group col-sm-9">
												<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
												<div class="col-sm-6">
													<input id="excelPath" name="excelPath"
														value="d:/测点布置情况.xls" type="text" class="form-control">
												</div>
											</div>
											<div class="col-sm-3">
												<button id="export-all-btn" type="submit" class="btn btn-success">导出</button>
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

				</div>

				<div class="modal fade" id="modal-syn-date">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">测点索引</h4>
							</div>
							<div class="modal-body">
								<form id="form-date-query" method="post"
									action="/GPSG/construct-web/indx.action" class="form-inline"
									role="form">
									<div class="form-group col-sm-8">
										<label class="col-sm-5 control-label" for="input-date">请输入索引号：</label>
										<div class="col-sm-7">
											<input id="input-date" name="cbIndx" type="text"
												class="form-control">
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" id="query-date-btn"
									class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>
						</div>
					</div>
				</div>
				<div class="modal fade" id="modal-measure-cedian">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">测点查询</h4>
							</div>
							<div class="modal-body">
								<form id="form1" method="post"
									action="/GPSG/construct-web/cedian.action" class="form-inline"
									role="form">
									<div class="form-group col-sm-8">
										<label class="col-sm-5 control-label" for="input-start-date">测点：</label>
										<div class="col-sm-7 input-group">
											<input id="input-start-date" name="cbCdno" type="text"
												class="form-control">
										</div>
									</div>
									<div class="col-sm-4">
										<button id="button2" type="button" class="btn btn-success">查询</button>
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
											<td>索引号</td>
											<td id="index1"></td>
										</tr>
										<tr>
											<td>测点名称</td>
											<td id="a"></td>
										</tr>
										<tr>
											<td>测点类型</td>
											<td id="b"></td>
										</tr>
										<tr>
											<td>隧道坐标(X)</td>
											<td id="c"></td>
										</tr>
										<tr>
											<td>隧道坐标(Y)</td>
											<td id="d"></td>
										</tr>
										<tr>
											<td>组坐标(X)</td>
											<td id="e"></td>
										</tr>
										<tr>
											<td>组坐标(Y)</td>
											<td id="f"></td>
										</tr>
										<tr>
											<td>基准</td>
											<td id="g"></td>
										</tr>
										<tr>
											<td>相关建筑物</td>
											<td id="h"></td>
										</tr>

										<tr>
											<td>isEast</td>
											<td id="u"></td>
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
	</div>
	
	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60" marginheight="0" marginwidth="0"></iframe>
	</div>
	
</body>
</html>