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
<script src="/GPSG/Web/admin-manage/login.js"></script>
</head>
<body>
	<div id="wrap">
		<div class="container">
			<div class="page-header">
				<h1>用户登录</h1>
			</div>
			<div class="row">
				<form id="form1" class="form-horizontal col-sm-8" role="form"  style="padding-top:10px;">
					<div id="alert1" class="alert alert-danger text-center hide"></div>
					<div class="form-group">
						<label for="input-name" class="col-sm-4 control-label">用户名：</label>
						<div class="col-sm-6">
							<input type="text" name="loginName" class="form-control"
								id="input-name">
						</div>
					</div>
					<div class="form-group">
						<label for="input-pass" class="col-sm-4 control-label">密&nbsp&nbsp&nbsp&nbsp码：</label>
						<div class="col-sm-6">
							<input type="password" name="password" class="form-control"
								id="input-pass">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-4 col-sm-6 well">
							<button id="button1" type="button"
								class="col-sm-offset-4 btn btn-success btn-lg">11111111111登&nbsp&nbsp&nbsp&nbsp录</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60px" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>
