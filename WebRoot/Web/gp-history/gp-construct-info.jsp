<%@ page language="java" pageEncoding="UTF-8"
	import="java.io.File, org.tool.CommonParam"%>
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
<script src="/GPSG/Web/gp-history/gp-construct-info.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div id="div-advance">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">管片施工信息</h3>
					</div>
					<div class="panel-body">
						<div class="well">
							<div class="btn-group">
								<button type="button" class="btn btn-primary">查询施工端管片信息</button>
								<button type="button" class="btn btn-primary dropdown-toggle"
									data-toggle="dropdown">
									<span class="caret"></span> <span class="sr-only">Toggle
										Dropdown</span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#" data-toggle="modal"
										data-target="#modal-loop">按环号查询</a>
									</li>
								</ul>
							</div>
							<div class="btn-group">
								<a href="/GPSG/construct-web/updateAction.action"
									class="btn btn-primary">更新管片全生命周期表</a>
							</div>
							<div class="modal fade" id="modal-loop">
								<div class="modal-dialog">
									<div class="modal-content">
										<form id="form-query" method="post"
											action="/GPSG/construct-web/getByLoopTotal.action"
											class="form-horizontal" role="form">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal"
													aria-hidden="true">&times;</button>
												<h4 class="modal-title" id="myModalLabel">管片施工信息</h4>
											</div>
											<div id="template" class="modal-body">
												<div id="alert1" class="alert alert-danger text-center hide"></div>
												<div class="form-group">
													<label class="col-sm-4 control-label" for="input-loop">成环环号：</label>
													<div class="col-sm-5 input-group">
														<input id="input-loop" name="tunnelLoop" type="text"
															class="form-control">
													</div>
												</div>
											</div>
											<div class="modal-footer">
												<button id="queryButton" type="button"
													class="btn btn-success">查询</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
						<%
							int i = 0;
						%>
						<table class="table">
							<tbody>
								<tr>
									<td>序号</td>
									<td>环号</td>
									<td>盾构/管片姿态</td>
									<td>同步注浆</td>
									<td>进场检查</td>
									<td>下井前检查</td>
									<td>拼装前检查</td>
									<td>管片修补</td>
									<td>东西线(0—东 1—西)</td>
								</tr>
								<s:iterator value="#request.list" id="row">
									<tr>
										<td><%=++i%></td>
										<td><s:property value="#row.tunnelLoop" />
										</td>
										<td><a
											href="/GPSG/Web/gp-history/image-construct.jsp?folder=SHIELD_POSE&fileName=<s:property value="#row.shieldPosePic" />"><s:property
													value="#row.shieldPosePic" /> </a>
										</td>
										<td><a
											href="/GPSG/Web/gp-history/image-construct.jsp?folder=ReportSG&fileName=<s:property value="#row.synchronousGroutPic" />"><s:property
													value="#row.synchronousGroutPic" /> </a></td>
										<s:if test="#row.inCheckPic!=0">
											<td><a
												href="inCheck_getList.action?tunnelLoop=<s:property value="#row.tunnelLoop" />"><s:property
														value="#row.inCheckPic" /> </a>
											</td>
										</s:if>
										<s:else>
											<td><s:property value="#row.inCheckPic" />
											</td>
										</s:else>



										<s:if test="#row.downWellPic!=0">
											<td><a
												href="downWell_getList.action?tunnelLoop=<s:property value="#row.tunnelLoop" />"><s:property
														value="#row.downWellPic" /> </a>
											</td>
										</s:if>
										<s:else>
											<td><s:property value="#row.downWellPic" />
											</td>
										</s:else>



										<s:if test="#row.pzqcheckPic!=0">
											<td><a
												href="pzqCheck_getList.action?tunnelLoop=<s:property value="#row.tunnelLoop" />"><s:property
														value="#row.pzqcheckPic" /> </a>
											</td>
										</s:if>
										<s:else>
											<td><s:property value="#row.pzqcheckPic" />
											</td>
										</s:else>

										<s:if test="#row.segmentrepairPic != 0">
											<td><a
												href="xunJian_getList.action?tunnelLoop=<s:property value="#row.tunnelLoop" />"><s:property
														value="#row.segmentrepairPic" /> </a>
											</td>
										</s:if>
										<s:else>
											<td><s:property value="#row.segmentrepairPic" />
											</td>
										</s:else>
										<td><s:property value="#row.isEast" />
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="post" action="total_getAll.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent" href="total_getAll.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="total_getAll.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="total_getAll.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="total_getAll.action?pageNow=<s:property value="#page.totalPage"/>
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