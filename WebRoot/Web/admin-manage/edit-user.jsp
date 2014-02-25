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
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">编辑用户信息</div>
					<div class="panel-body">
						<form class="form-horizontal" role="form" method="post"
							action="/GPSG/system/updateUser.action">
							<div class="form-group">
								<label class="col-sm-2 control-label" for="fullName">姓名：</label>
								<div class="col-sm-10">
									<input type="hidden" name="userInfo.id" class="form-control"
										value="<s:property value="userInfo.id"/>"> <input
										type="text" class="form-control" name="userInfo.fullName"
										id="fullName" value="<s:property value="userInfo.fullName"/>">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="jobNumber">工号：</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										name="userInfo.jobNumber" id="jobNumber"
										value="<s:property value="userInfo.jobNumber"/>">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="loginName">登录名：</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										name="userInfo.loginName" id="loginName"
										value="<s:property value="userInfo.loginName"/>">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="password">密码：</label>
								<div class="col-sm-10">
									<s:if test="userInfo.fullName==#session.name">
										<input type="text" class="form-control"
											name="userInfo.password" id="password"
											value="<s:property value="userInfo.password"/>">
									</s:if>
									<s:else>
										<input type="password" class="form-control" disabled
											name="userInfo.password" id="password"
											value="<s:property value="userInfo.password"/>">
									</s:else>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">部门：</label>
								<div class="col-sm-10">
									<select id="select" class="form-control"
										name="userInfo.departmentInfo.id">
										<s:iterator value="#request.depList" id="dep">
											<s:if test="#dep.id==userInfo.departmentInfo.id">
												<option selected value="<s:property value="#dep.id"/>">
													<s:property value="#dep.departmentName" />
												</option>
											</s:if>
											<s:else>
												<option value="<s:property value="#dep.id"/>">
													<s:property value="#dep.departmentName" />
												</option>
											</s:else>
										</s:iterator>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">角色：</label>
								<div class="col-sm-10">
									<select class="form-control" name="userInfo.roleInfo.id">
										<s:iterator value="#request.list" id="role">
											<s:if test="#role.id==userInfo.roleInfo.id">
												<option selected value="<s:property value="#role.id"/>">
													<s:property value="#role.roleName" />
												</option>
											</s:if>
											<s:else>
												<option value="<s:property value="#role.id"/>">
													<s:property value="#role.roleName" />
												</option>
											</s:else>
										</s:iterator>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="cellPhone">手机：</label>
								<div class="col-sm-10">
									<input type="text" class="form-control"
										name="userInfo.cellPhone" id="cellPhone"
										value="<s:property value="userInfo.cellPhone"/>">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label" for="email">邮箱：</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="userInfo.email"
										id="email" value="<s:property value="userInfo.email"/>">
								</div>
							</div>
							<button type="submit" class="btn btn-primary">保存</button>
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