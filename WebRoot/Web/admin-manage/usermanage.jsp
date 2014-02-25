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
<script src="/GPSG/Web/admin-manage/usermanage.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">用户管理</div>
					<div class="panel-body">
						<div class="well">
							<a href="/GPSG/system/getRoleAndDepart.action" class="btn btn-success">添加</a> <a href="#"
								class="btn btn-success" data-toggle="modal"
								data-target="#modal-query">查询</a>
						</div>
						<table class="table table-condensed table-hover table-responsive">
							<tbody>
								<tr>
									<td>序号</td>
									<td>工号</td>
									<td>姓名</td>
									<td>登陆名</td>
									<td>部门</td>
									<td>角色</td>
									<td>手机</td>
									<td>邮箱</td>
									<td>操作</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.userList" id="user">
									<tr>
										<td id="td-id"><s:property value="#user.id" />
										</td>
										<td id="td-jobNumber"><s:property value="#user.jobNumber" />
										</td>
										<td id="td-fullName"><s:property value="#user.fullName" />
										</td>
										<td id="cc"><s:property value="#user.loginName" />
										</td>
										<td id="dd"><s:iterator value="#request.depList" id="dep">
												<s:if test="#dep.id==#user.departmentInfo.id">
													<s:property value="#dep.departmentName" />
												</s:if>
											</s:iterator>
										</td>
										<td id="ee"><s:iterator value="#request.roleList"
												id="role">
												<s:if test="#role.id==#user.roleInfo.id">
													<s:property value="#role.roleName" />
												</s:if>
											</s:iterator>
										</td>
										<td id="ff"><s:property value="#user.cellPhone" />
										</td>
										<td id="gg"><s:property value="#user.email" />
										</td>
										<td><a
											href="/GPSG/system/getAllRole.action?userId=<s:property value="#user.id" />">修改</a>
										</td>
										<td><a href="/GPSG/system/deleteUser.action?userId=<s:property value="#user.id"/>">删除</a></td>
									</tr>
								</s:iterator>
							</tbody>

						</table>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="get"
									action="/GPSG/construct-web/usermanage.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent" href="usermanage.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="usermanage.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="usermanage.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="usermanage.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
										</a>
									</s:if>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-delete">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop" method="post"
							action="/GPSG/system/deleteuser.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">删除用户</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">确定删除？</label>

								</div>
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-success">删除</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<form id="form-hide" method="post"
				action="/GPSG/system/deleteuser.action" class="hide form-horizontal"
				role="form">
				<input id="role-name88" name="fullName" type="text"
					class="form-control">
			</form>
			<div class="modal fade" id="modal-add">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop" method="post"
							action="/GPSG/system/adduser.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">添加角色信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name1" class="col-sm-4 control-label">角色名称：</label>
									<div class="col-sm-6">
										<input id="role-name1" name="fullName" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-jobNumber" class="col-sm-4 control-label">工号：</label>
									<div class="col-sm-6">
										<input id="role-jobNumber" name="jobNumber" type="text"
											class="form-control">
									</div>
								</div>

								<div class="form-group">
									<label for="role-Log" class="col-sm-4 control-label">登陆名：</label>
									<div class="col-sm-6">
										<input id="role-Log" name="loginName" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-Phone" class="col-sm-4 control-label">手机：</label>
									<div class="col-sm-6">
										<input id="role-Phone" name="cellPhone" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-email" class="col-sm-4 control-label">邮箱：</label>
									<div class="col-sm-6">
										<input id="role-email" name="email" type="text"
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
			<div class="modal fade" id="modal-query">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop" method="post"
							action="/GPSG/system/getByName.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">查询用户信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">用户姓名：</label>
									<div class="col-sm-6">
										<input id="role-name" name="fullName" type="text"
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
			<div class="modal fade" id="modal-edit">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop" method="post"
							action="/GPSG/system/editUser.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">编辑角色信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name1" class="col-sm-4 control-label">用户姓名：</label>
									<div class="col-sm-6">
										<input id="role-id" name="id" type="hidden"
											class="form-control"> <input id="role-name1"
											name="fullName" type="text" class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-jobNumber" class="col-sm-4 control-label">用户工号：</label>
									<div class="col-sm-6">
										<input id="role-jobNumber" name="jobNumber" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-select" class="col-sm-4 control-label">角色：</label>
									<div class="col-sm-6">
										<select id="role-select" class="form-control">

										</select>
									</div>
								</div>
								<div class="form-group">
									<label for="role-Phone" class="col-sm-4 control-label">用户手机：</label>
									<div class="col-sm-6">
										<input id="role-Phone" name="cellPhone" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-email" class="col-sm-4 control-label">用户邮箱：</label>
									<div class="col-sm-6">
										<input id="role-email" name="email" type="text"
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

	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60px" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>