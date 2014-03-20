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
	<script src="/GPSG/Web/admin-manage/role.js"></script>
</head>
<body>
	<div id="wrap">		
		<iframe src="/GPSG/construct-web/menu.action" width="100%" height="160px"></iframe>
		<div class="container">			
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-info" style="height:800px;">
						<div class="panel-heading">
							<h3 class="panel-title">详细内容</h3>
						</div>
						<div class="panel-body">
							<div class="well">
								<a href="#" class="btn btn-success" data-toggle="modal" data-target="#modal-query">查询角色信息</a>
								<a href="#" class="btn btn-success" data-toggle="modal" data-target="#modal-add">添加角色信息</a>								
								<s:property value="#request.msg"/>
							</div>
							<table class="table" id="table">
								<tbody>
									<tr>
										<td>序号</td>
										<td>角色名称</td>
										<td>角色描述</td>
										<td>操作</td>
										<td>操作</td>
										<td>操作</td>
									</tr>
									<s:iterator value="#request.list" id="role">
									<tr>
										<td id="td-id"><s:property value="#role.id"/></td>
										<td id="td-name" class="aaa"><s:property value="#role.roleName"/></td>
										<td id="td-description"><s:property value="#role.roleDescription"/></td>
										<td><a href="/GPSG/system/getByRoleId.action?roleId=<s:property value="#role.id"/>" class="assign">分配权限</a></td>
										<td>
											<a href="#" class="edit">修改</a>
										</td>
										<td>
											<a href="#" class="delete">删除</a>
										</td>
									</tr>
									</s:iterator>
								</tbody>
							</table>
						</div>
					</div>
				</div>				
			</div>
			<form id="form-hide" method="post" action="/GPSG/system/role_deleteRole.action" class="hide form-horizontal" role="form">
				<input id="role-name" name="name" type="text" class="form-control">
			</form>
			<div class="modal fade" id="modal-query">
				<div class="modal-dialog">
					<div class="modal-content">						
						<form id="form1" method="post" action="/GPSG/system/getRoleByName.action" class="form-horizontal" role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								<h4 class="modal-title">查询角色信息</h4>
							</div>
							<div class="modal-body">			
								<div class="form-group">
								    <label for="role-name" class="col-sm-4 control-label">角色名称：</label>
								    <div class="col-sm-6">
								      <input id="role-name" name="name" type="text" class="form-control">
								    </div>
								  </div>
							</div>
							<div class="modal-footer">
								<button id="button1" type="button" class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-add">
				<div class="modal-dialog">
					<div class="modal-content">						
						<form id="form2" method="post" action="/GPSG/system/role_addRole.action" class="form-horizontal" role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								<h4 class="modal-title">添加角色信息</h4>
							</div>
							<div class="modal-body">			
								<div class="form-group">
								    <label for="role-name1" class="col-sm-4 control-label">角色名称：</label>
								    <div class="col-sm-6">
								      <input id="role-name1" name="name" type="text" class="form-control">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="role-description" class="col-sm-4 control-label">角色描述：</label>
								    <div class="col-sm-6">
								      <input id="role-description" name="description" type="text" class="form-control">
								    </div>
								  </div>
							</div>
							<div class="modal-footer">
								<button id="button2" type="button" class="btn btn-success">保存</button>
								<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-edit">
				<div class="modal-dialog">
					<div class="modal-content">						
						<form id="form3" method="post" action="/GPSG/system/role_editRole.action" class="form-horizontal" role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								<h4 class="modal-title">编辑角色信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
								    <label for="role-name" class="col-sm-4 control-label">角色名称：</label>
								    <div class="col-sm-6">								    	
								      <input id="role-id" name="id" type="hidden" class="form-control">
								      <input id="role-name" name="name" type="text" class="form-control">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="role-description" class="col-sm-4 control-label">角色描述：</label>
								    <div class="col-sm-6">
								      <input id="role-description" name="description" type="text" class="form-control">
								    </div>
								  </div>
							</div>
							<div class="modal-footer">
								<button id="button3" type="button" class="btn btn-success">保存</button>
								<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
							</div>
					</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<div id="footer">
<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60px"
						marginheight="0" marginwidth="0"></iframe>
</div>
</body>
</html>
