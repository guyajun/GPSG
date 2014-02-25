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
<script src="/GPSG/Web/gp-history/ftp.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div id="div-advance" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">FTP上的文件夹</h3>
					</div>
					<div class="panel-body">
						<div class="well">
							<div class="btn-group">
								<a id="download-btn" href="#"
									class="btn btn-success btn-lg">下载文件夹</a>
							</div>
						</div>
						<form id="form-download" action="/GPSG/stream/getFtpStream.action"
							method="post" class="form-horizontal" role="form">
							<div class="form-group">
								<div class="col-sm-6 input-group">
									<input id="downloads" name="downloads" type="hidden">
								</div>
							</div>
						</form>
						<table class="table">
							<tbody>
								<tr>
									<td><input id="check-all" class="check-all"
										type="checkbox"></td>
									<td>序号</td>
									<td>文件夹名称</td>
									<td>操作</td>
								</tr>
								<%
									int i = 0;
								%>
								<s:iterator value="#request.dadList" id="dad">
									<tr>
										<td><input class="check-one" type="checkbox"
											value="<s:property/>" /></td>
										<td><%=++i%></td>
										<td><s:property />
										</td>
										<td><a href="/GPSG/stream/getFtpStream.action?downloadZip=<s:property/>">下载</a></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
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