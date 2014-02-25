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
<link rel="stylesheet" type="text/css"
	href="/GPSG/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="/GPSG/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="/GPSG/css/demo.css" />
<script type="text/javascript" src="/GPSG/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="/GPSG/js/jquery.easyui.min.js"></script>
<script src="/GPSG/Web/gp-history/file-tree.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<div class="panel panel-info" style="height:600px;">
						<div class="panel-heading">
							<h3 class="panel-title">已经上传FTP的文件</h3>
						</div>
						<div class="panel-body">
							<form id="form-authority" class="hide" method="post"
								action="/GPSG/system/editAuthority.action">
								<input id="roleId"
									value="<s:property value="#request.roleId1"/>" name="roleId"
									type='text'> <input id="menuIds" name="menuIds"
									type="text">
							</form>
							<div class="container">
								<div class="row">

									<div class="col-sm-4 col-sm-offset-1">
										<ul id="authoritytree" style="height:600px;"></ul>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-8">
					<div class="panel panel-info" style="height:600px;">
						<div class="panel-heading">
							<h3 class="panel-title">上传信息</h3>
						</div>
						<div class="panel-body" style="height:600px;">
							<form id="form-authority" class="hide" method="post"
								action="/GPSG/system/editAuthority.action">
								<input id="roleId"
									value="<s:property value="#request.roleId1"/>" name="roleId"
									type='text'> <input id="menuIds" name="menuIds"
									type="text">
							</form>
							<div class="container">
								<div class="row">
									<div id="label" class="well" style="height:100px;">
										<h3>
											本地文件<s:property value="#request.localPath" />已上传至FTP的<s:property value="#request.today" />文件夹(详见左树)
										</h3>
										<input id="localPath" type="hidden" value="<s:property value="#request.localPath"/>">
									</div>
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
