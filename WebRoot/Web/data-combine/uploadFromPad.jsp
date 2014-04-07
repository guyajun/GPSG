<%@ page language="java" pageEncoding="UTF-8"
	import="org.tool.CommonParam,java.text.SimpleDateFormat,java.util.Date;"%>
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
<script src="/GPSG/Web/gp-history/gp-produce-info.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div id="div-advance">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">从pad上传施工端文件</h3>
					</div>
					<div class="panel-body">
						<form id="form-upload" action="/GPSG/construct-web/uploadFromPad.action" method="post"
							class="form-horizontal" role="form" enctype="multipart/form-data">
							<div class="form-group">
								<label class="col-sm-4 control-label" for="input-gp-date">请选择文件：</label>
								<div class="col-sm-3 input-group">
									<input type="file" name="upload" />
								</div>
								<div class="col-sm-3">
									<button id="upload-btn" type="submit"
										class="btn btn-success btn-lg">上传</button>
								</div>
							</div>
						</form>
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