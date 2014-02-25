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
	<link rel="stylesheet" type="text/css" href="/GPSG/themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="/GPSG/themes/icon.css"/>
	<link rel="stylesheet" type="text/css" href="/GPSG/css/demo.css"/>
	<script type="text/javascript" src="/GPSG/js/jquery-1.8.0.min.js"></script>
 	<script type="text/javascript" src="/GPSG/js/jquery.easyui.min.js"></script>	
	<script src="/GPSG/Web/admin-manage/getByRoleId.js"></script>
</head>
<body>
	<div id="wrap">		
		<iframe src="/GPSG/construct-web/menu.action" width="100%" height="160px"></iframe>
		<div class="container">			
			<div class="row">
				<div class="col-sm-12">
					<div class="panel panel-info" style="height:800px;">
						<div class="panel-heading">
							<h3 class="panel-title">权限分配</h3>
						</div>
						<div class="panel-body">
							<form id="form-authority" class="hide" method="post" action="/GPSG/system/editAuthority.action">
								<input id="roleId" value="<s:property value="#request.roleId1"/>" name="roleId" type='text'>
								<input id="menuIds" name="menuIds" type="text">
							</form>
							<div class="container">
								<div class="row">
								<div>
									<button type="button" class="btn btn-danger btn-lg btn-block"><s:property value="#request.roleName"/></button>
									
								</div>
								<div class="col-sm-offset-5">
								  	<ul id="authoritytree"></ul>
								 </div>
								 <button id="saveBtn" type="button" class="btn btn-success btn-lg btn-block">保存</button>
							  </div>
							</div>
						</div>
					</div>
				</div>
			<!-- 	<div class="modal fade" id="modal-right">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">请选择该角色可操作菜单</h4>
							</div>
							<div class="modal-body">							 
									<form id="form-authority" method="post" action="/GPSG/system/editAuthority.action">
										<input id="roleId" name="roleId" type='text'>
										<input id="menuIds" name="menuIds" type="text">
									</form>
										  <table id="table-id" class="table">
											<tbody>
												<tr>
													<td>序号</td>
													<td>主菜单</td>
													<td>子菜单</td>
												</tr>
												<s:iterator value="#request.list" id="menu">
												<s:if test="#menu.functionInfo.id==0">
												<tr>
													<td class="hide alert alert-warning"><s:property value="#menu.id"/></td>
													<td class="alert alert-success">
														<input class="main" value="<s:property value="#menu.id"/>" type='checkbox'/>
														<s:property value="#menu.functionName"/>
													</td>
													<s:iterator value="#request.list" id="subMenu">
													<s:if test="#subMenu.functionInfo.id==#menu.id">
														<td class="alert alert-info">
															<input value="<s:property value="#subMenu.id"/>" class="subMenu" type='checkbox'/>
															<s:property value="#subMenu.functionName"/>
														</td>													
													</s:if>
													</s:iterator>										
												</tr>
												</s:if>
												</s:iterator>
											</tbody>
										</table>
								</div>
							<div class="modal-footer">
								
								<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							</div>
						</div>
					</div>
				</div> -->
				<div class="hide col-sm-7">
					<div class="panel panel-info"  style="height:600px;">
						<div class="panel-heading">
							<h3 class="panel-title">详细内容</h3>
						</div>
						<div class="panel-body">
							 <table class="table">
								<tbody>
									<tr>
										<td>序号</td>
										<td>主菜单</td>
										<td>子菜单</td>
									</tr>
									<s:iterator value="#request.list" id="menu">
									<s:if test="#menu.functionInfo.id==0">
									<tr>
										<td class="hide alert alert-warning"><s:property value="#menu.id"/></td>
										<td class="alert alert-success"><input class="main" type='checkbox'/><s:property value="#menu.functionName"/></td>
										<s:iterator value="#request.list" id="subMenu">
										<s:if test="#subMenu.functionInfo.id==#menu.id">
										<td class="alert alert-info"><input class="subMenu" type='checkbox'/><s:property value="#subMenu.functionName"/></td>
										
										</s:if>
										</s:iterator>										
									</tr>
									</s:if>
									</s:iterator>
								</tbody>
							</table>
						</div>
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
