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
<script src="/GPSG/Web/admin-manage/plan1.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">计划管理</div>
					<div class="panel-body">
						<div class="well">
							<a href="#" class="btn btn-success" data-toggle="modal"
								data-target="#modal-add">添加</a> <a href="#"
								class="btn btn-success" data-toggle="modal"
								data-target="#modal-query">查询</a>
						</div>
						<table class="table table-condensed table-hover table-responsive">
							<tbody>
								<tr>
									<td>序号</td>
									<td>项目号</td>
									<td>计划开始时间</td>
									<td>计划结束时间</td>
									<td>起始环号</td>
									<td>终止环号</td>
									<td>计划深度</td>
									<td>创建时间</td>
									<td>操作</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.planList" id="planList">
									<tr>
										<td id="td-id"><s:property value="#planList.id" />
										</td>
										<td id="aa"><s:property value="#planList.proId" />
										</td>
										<td id="bb"><s:property value="#planList.startTime" />
										</td>
										<td id="cc"><s:property value="#planList.endTime" />
										</td>
										<td id="dd"><s:property value="#planList.startNum" />
										</td>
										<td id="ee"><s:property value="#planList.endNum" />
										</td>
										<td id="ff"><s:property value="#planList.coverDepth" />
										</td>
										<td id="gg"><s:property value="#planList.createTime" />
										</td>
										
										<td><a href="#" class="edit">修改</a></td> 
										<td><a href="#" class="delete">删除</a>
									</tr>
								</s:iterator>
							</tbody>

						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#planList.pager"></s:set>
								<form id="form-page" method="get"
									action="/GPSG/system/plan1.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent" href="plan1.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="plan1.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="plan1.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="plan1.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
										</a>
									</s:if>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<form id="form-hide" method="post" action="/GPSG/system/deleteplan1.action" class="hide form-horizontal" role="form">
				<input id="role-name88" name="proId" type="text" class="form-control">
			</form>
			<div class="modal fade" id="modal-add">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop1" method="post"
							action="/GPSG/system/addplan1.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">添加计划信息</h4>
							</div>
							<div class="modal-body">
							<div id="alert1" class="alert alert-danger text-center hide"></div>
								<div class="form-group">
									<label for="role-proId" class="col-sm-4 control-label">项目号：</label>
									<div class="col-sm-6">
										<input id="role-proId" name="proId" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-startTime" class="col-sm-4 control-label">计划开始时间：</label>
									<div class="col-sm-6">
										<input id="role-startTime" name="startTime" type="text"
											class="form-control">
									</div>
								</div>

								<div class="form-group">
									<label for="role-endTime" class="col-sm-4 control-label">计划结束时间：</label>
									<div class="col-sm-6">
										<input id="role-endTime" name="endTime" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-startNum" class="col-sm-4 control-label">起始环号：</label>
									<div class="col-sm-6">
										<input id="role-startNum" name="startNum" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-endNum" class="col-sm-4 control-label">终止环号：</label>
									<div class="col-sm-6">
										<input id="role-endNum" name="endNum" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-coverDepth" class="col-sm-4 control-label">计划深度：</label>
									<div class="col-sm-6">
										<input id="role-coverDepth" name="coverDepth" type="text"
											class="form-control">
									</div>
								</div>

							</div>
							<div class="modal-footer">
								<button id='button1' type="button" class="btn btn-success">保存</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-query">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop3" method="post"
							action="/GPSG/system/searchplan1.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">查询计划信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-startTime" class="col-sm-4 control-label">计划开始时间：</label>
									<div class="col-sm-6">
										<input id="role-startTime" name="startTime" type="text"
											class="form-control">
									</div>
								</div>
							</div>
							<div class="modal-footer">
								<button id='export-all-btn5' type="submit" class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-edit">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop2" method="post"
							action="/GPSG/system/editplan1.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">修改计划信息</h4>
							</div>
							<input id="role-id" name="id" type="hidden" value=""
											class="form-control">
							<div class="modal-body">
							<div id="alert1" class="alert alert-danger text-center hide"></div>
								<div class="form-group">
									<label for="role-proId" class="col-sm-4 control-label">项目号：</label>
									<div class="col-sm-6">
										<input id="role-proId" name="proId" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-startTime" class="col-sm-4 control-label">计划开始时间：</label>
									<div class="col-sm-6">
										<input id="role-startTime" name="startTime" type="text"
											class="form-control">
									</div>
								</div>

								<div class="form-group">
									<label for="role-endTime" class="col-sm-4 control-label">计划结束时间：</label>
									<div class="col-sm-6">
										<input id="role-endTime" name="endTime" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-startNum" class="col-sm-4 control-label">起始环号：</label>
									<div class="col-sm-6">
										<input id="role-startNum" name="startNum" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-endNum" class="col-sm-4 control-label">终止环号：</label>
									<div class="col-sm-6">
										<input id="role-endNum" name="endNum" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-coverDepth" class="col-sm-4 control-label">计划深度：</label>
									<div class="col-sm-6">
										<input id="role-coverDepth" name="coverDepth" type="text"
											class="form-control">
									</div>
								</div>

							</div>
							<div class="modal-footer">
								<button id='button2' type="button" class="btn btn-success">保存</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>


							
						</form>
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