<%@ page language="java"
	import="org.tool.CommonParam,java.text.SimpleDateFormat,java.util.Date;"
	pageEncoding="UTF-8"%>
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
<script src="/GPSG/Web/gp-history/ftp1.js"></script>
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
						<%
							CommonParam cp = new CommonParam();
							String produceFilePath = cp.getString("local-imgs-produce");
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							Date date = new Date();
							String today = sdf.format(date);
						%>
						<table class="table">
							<tbody>
								<tr>
									<td>序号</td>
									<td>文件夹名称</td>
									<td>操作</td>
								</tr>
								<%
									int i = 0;
								%>
								<s:iterator value="#request.dadList" id="dad">
									<tr>
										<td><%=++i%></td>
										<td id="aa"><s:property />
										</td>
										<td><a href="/GPSG/stream/getFtpStream.action?downloadZip=<s:property/>">下载</a></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
				<div class="modal fade" id="modal-download">
					<div class="modal-dialog">
						<div class="modal-content">
							<form id="form-download" action="ftpDownloadFolder.action"
								method="post" class="form-horizontal" role="form">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">从FTP下载文件</h4>
								</div>
								<div class="modal-body">
									<div class="form-group">
										<label class="col-sm-3 control-label" for="input">保存路径：</label>
										<div class="col-sm-9 input-group">
											<input id="input" class="col-sm-9" readonly type="text"
												name="savePath" value="<%=produceFilePath%>" /> <input
												id="downloads" name="downloads" type="hidden">
										</div>
									</div>
								</div>
								<div class="modal-footer">
									<button type="submit" class="btn btn-success">下载</button>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">关闭</button>
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