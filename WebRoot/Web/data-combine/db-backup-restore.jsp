<%@ page language="java" pageEncoding="UTF-8"
	import="java.util.Date, java.text.SimpleDateFormat, org.tool.CommonParam;"%>
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
</head>
<body>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMd-HHmmss");
		Date date = new Date();
		String today = sdf.format(date);
		String bakName = "Shchd_" + today + ".bak";
		String restoreName = "Shgd_" + today + ".bak";
		CommonParam cp=new CommonParam();
		String path=cp.getString("local-bak-path");
	%>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="panel panel-info" style="height:600px;">
						<div class="panel-heading">
							<h3 class="panel-title">数据库备份</h3>
						</div>
						<div class="panel-body" style="padding-top:100px;">
							<form id="form-query" method="post"
								action="/GPSG/construct-web/db_backup.action"
								class="form-horizontal" role="form">								
								<div class="form-group">
									<label class="col-sm-3 control-label" for="backupPath">保存地址：</label>
									<div class="col-sm-9 input-group">
										<input id="backupPath" name="backupPath" type="text"
											width="200px" value="<%=path %>/<%=bakName%>"
											class="form-control">
									</div>
								</div>
								<div class="form-group" style="padding-top:100px;">
									<div class=" col-sm-offset-4">
										<button type="submit" class="btn btn-success btn-lg">备份本地数据库</button>
										<!-- <button type="button" class="btn btn-default">取消</button> -->
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-info" style="height:600px;">
						<div class="panel-heading">
							<h3 class="panel-title">数据库还原</h3>
						</div>
						<div class="panel-body" style="padding-top:100px;">
							<form id="form-query" method="post"
								action="/GPSG/construct-web/db_restore.action"
								class="form-horizontal" role="form" enctype="multipart/form-data">
								<div class="form-group">
									<label class="col-sm-3 control-label" for="restorePath">待还原数据库路径：</label>
									<div class="col-sm-9 input-group">
										<input id="restorePath" name="upload" type="file"
											width="200px"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" for="restorePath">还原后的名称：</label>
									<div class="col-sm-9 input-group">
										<input id="restorePath" name="dbName" type="text" value="GPSG0711"
											width="200px"
											class="form-control">
									</div>
								</div>
								<div class="form-group" style="padding-top:100px;">
									<div class=" col-sm-offset-4">
										<button type="submit" class="btn btn-success btn-lg">还原数据库</button>
										<!-- <button type="button" class="btn btn-default">取消</button> -->
									</div>
								</div>
							</form>
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