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
<script src="/GPSG/Web/admin-manage/deptmanage.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">部门管理</div>
					<div class="panel-body">
						<div class="well">
							<a href="#" class="btn btn-success" data-toggle="modal"
								data-target="#modal-add">添加</a>
						</div>
						<table class="table table-hover">
							<tbody>
								<tr>
									<td>序号</td>
									<td>部门名称</td>
									<td>部门描述</td>
									<td>父部门名称</td>
									<td>创建者</td>
									<td>创建时间</td>
									<td>修改者</td>
									<td>修改时间</td>
									<td>操作</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.deplist" id="dep">
									<tr>
										<td id="index"><s:property value="#dep.id" /></td>
										<td id="aa"><s:property value="#dep.departmentName" /></td>
										<td id="bb"><s:property
												value="#dep.departmentDescription" /></td>
										<td id="cc"><s:property value="#dep.id.departmentName" />
										</td>
										<td id="ee"><s:property value="#dep.creatorId" /></td>
										<td id="jj"><s:date name="##dep.createTime"
												format="yyyy-MM-dd" /></td>
										<td id="gg"><s:property value="#dep.modifierId" /></td>
										<td id="jj"><s:date name="#dep.modifyTime"
												format="yyyy-MM-dd" /></td>
										<!--	<td><a href="#" class=" edit btn btn-primary">修改</a> -->
										</td>
										<!--<td>
										 	<a href="/GPSG/system/deleteDep.action?id=<s:property value="#dep.id"/>">删除</a> 
										</td> -->
										<td><a href="#" class="delete btn btn-primary">删除</a>
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<form id="form-hide" method="post"
							action="/GPSG/system/deletedep.action" class="hide form-horizontal"
							role="form">
							<input id="role-name88" name="departmentName" type="text"
								class="form-control">
						</form>
						<div class="modal fade" id="modal-edit">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form-query-by-loop" method="post"
										action="/GPSG/system/editDep123.action" class="form-horizontal"
										role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title">编辑角色信息</h4>
										</div>
										<div class="modal-body">
											<div class="form-group">
												<label for="role-name1" class="col-sm-4 control-label">部门名称：</label>
												<div class="col-sm-6">
													<input id="role-id" name="id" type="hidden"
														class="form-control"> <input id="role-name1"
														name="departmentName" type="text" class="form-control">
												</div>
											</div>
											<div class="form-group">
												<label for="role-name2" class="col-sm-4 control-label">部门描述：</label>
												<div class="col-sm-6">
													<input id="role-name2" name="departmentDescription"
														type="text" class="form-control">
												</div>
											</div>
											<div class="form-group">
												<label for="role-Phone" class="col-sm-4 control-label">父部门名称：</label>
												<div class="col-sm-6">
													<input id="role-Phone" name="cellPhone" type="text"
														class="form-control">
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-success">保存</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-add">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form-query-by-loop" method="post"
										action="/GPSG/system/addDep.action" class="form-horizontal"
										role="form">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title">添加角色信息</h4>
										</div>
										<div class="modal-body">

											<div class="form-group">
												<label for="role-jobNumber" class="col-sm-4 control-label">部门名称：</label>
												<div class="col-sm-6">
													<input id="role-jobNumber" name="departmentName"
														type="text" class="form-control">
												</div>
											</div>

											<div class="form-group">
												<label for="role-Log" class="col-sm-4 control-label">部门描述：</label>
												<div class="col-sm-6">
													<input id="role-Log" name="departmentDescription"
														type="text" class="form-control">
												</div>
											</div>
											<div class="form-group">
												<label for="role-Phone" class="col-sm-4 control-label">父部门名称：</label>
												<div class="col-sm-6">
													<input id="role-Phone" name="cellPhone" type="text"
														class="form-control">
												</div>
											</div>


										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-success">保存</button>
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
		</div>
	</div>

	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60px" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>