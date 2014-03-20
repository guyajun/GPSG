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
						<!-- <div class="well">
							<div class="btn-group">
								<a id="download-btn" href="#"
									class="btn btn-success btn-lg">下载文件夹</a>
							</div>
						</div> 
						<form id="form-download" action="/GPSG/stream/getFtpStream.action"
							method="post" class="form-horizontal" role="form">
							<div class="form-group">
								<div class="col-sm-6 input-group">
									<input id="downloads" name="downloads" type="text">
								</div>
							</div>
						</form>-->
						<table class="table">
							<tbody>
								<tr>
									<!-- <td><input id="check-all" class="check-all"
										type="checkbox"></td>-->
									<td>序号</td>
									<td>文件夹名称</td>
									<td>操作</td>
								</tr>
								<%
									int i = 0;
								%>
								<s:iterator value="#request.dadList" id="dad">
									<tr>
										<!-- <td><input class="check-one" type="checkbox"
											value="<s:property/>" /></td>-->
										<td><%=++i%></td>
										<td id="abc"><s:property /></td>
										<td><a class="download-class" type="button" href="#">下载</a>
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<%
							CommonParam cp = new CommonParam();
							String produceFilePath = cp.getString("local-imgs-produce");
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							Date date = new Date();
							String today = sdf.format(date);
						%>
						<!-- 	<div class="modal fade" id="modal-download">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">从FTP下载文件</h4>
									</div>
									<div class="modal-body">
										<form id="form-download" action="ftpDownloadFolder.action"
											method="post" class="form-horizontal" role="form">
											<div class="form-group">
												<label class="col-sm-4 control-label" for="input">文件保存路径：</label>
												<div class="col-sm-6 input-group">
													<input id="input" type="hidden" name="savePath"
														value="C:\Users\Administrator\Downloads" /> <input
														id="downloads" name="downloads" type="hidden">
												</div>
											</div>
										</form>
									</div>
									<div class="modal-footer">
										<button id="download-btn" type="button"
											class="btn btn-success">下载</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
									</div>
								</div>
							</div>
						</div> -->
						<div class="modal fade" id="modal-download">
							<div class="modal-dialog">
								<div class="modal-content">
									<form id="form-download" action="ftpDownloadFolder.action"
										method="post" class="form-horizontal" role="form">
										<div class="alert alert-success text-left">
											点击下载直接保存到了“下载”文件夹，解压缩之后保存到了<%=produceFilePath%></div>
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">下载并解压缩</h4>
										</div>
										<div class="modal-body">
											<div class="form-group">
												<label class="col-sm-5 control-label"></label>
												<div class="col-sm-5 input-group">
													<a id="a-download" class="btn btn-success">从ftp下载压缩包并解压缩</a>
												</div>
											</div>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<!-- <div class="modal fade" id="modal-download">在哪台电脑上访问就下载到哪台电脑上，但我们的目的是只能下载到安装施工端系统的电脑上
							<div class="modal-dialog">
								<div class="modal-content">
									<form class="form-horizontal">
										<div class="alert alert-success text-left">
											点击下载直接保存到了“下载”文件夹，解压缩之后保存到了<%=produceFilePath%></div>
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">下载并解压缩</h4>
										</div>
										<div class="modal-body">
											<div class="form-group">
												<label class="col-sm-5 control-label">第一步下载：</label>
												<div class="col-sm-5 input-group">
													<a id="a-download" href="" class="btn btn-success">从ftp下载压缩包</a>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-5 control-label">第二步解压缩：</label>
												<div class="col-sm-5 input-group end-date">
													<button id="unZip-btn" type="button"
														class="btn btn-success">解压缩压缩包</button>
												</div>
											</div>
											<div id="alert2" class="alert alert-danger text-center hide"></div>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Close</button>
										</div>
									</form>
								</div>
							</div>
						</div> -->
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