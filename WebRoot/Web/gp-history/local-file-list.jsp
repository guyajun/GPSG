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
	<script src="/GPSG/Web/bootstrap-3.0.0/js/moment.min.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap-datetimepicker.js"></script>
	<script src="/GPSG/Web/gp-history/gp-produce-info.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#check-all').on('click',function(){
				var checkBoxes=$('.check-one');
				if($(this).is(':checked')){
					for(var i=0;i<checkBoxes.length;i++){
						checkBoxes[i].checked = true;
					}
				}
				else{
					for(var i=0;i<checkBoxes.length;i++){
						checkBoxes[i].checked = false;
					}
				}				
			});			  
				$('.check-one').on('click',function(){
					if($(this).is(':checked')){
	  					var checkBoxes=$('.check-one');
						var count=0;
						for(var i=0;i<checkBoxes.length;i++){
							if(checkBoxes[i].checked==true){
								count++;
							}				
						}
						if(count==checkBoxes.length){
							$('#check-all').attr('checked',true);
						}
					}   					
				});
			
			
				$('#download-btn').on('click',function(){
					var checkBoxes=$('.check-one');
					var str="";
					for(var i=0;i<checkBoxes.length;i++){
						if(checkBoxes[i].checked==true){
							str+=checkBoxes[i].value+",";
						}				
					}
					$('#downloads').val(str);
					$('#form-download').submit();
				});
				
				$('#delete-btn').on('click',function(){
					var checkBoxes=$('.check-one');
					var str="";
					for(var i=0;i<checkBoxes.length;i++){
						if(checkBoxes[i].checked==true){
							str+=checkBoxes[i].value+",";
						}				
					}
					$('#delete').val(str);
					$('#form-delete').submit();
				});
		});
	</script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%" height="160px"></iframe>
		<div class="container">
			<div id="div-advance" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">管片生产信息</h3>
					</div>
					<div class="panel-body">
						<div class="well">
							<div class="btn-group">
								<a href="#" type="button" class="btn btn-success" data-toggle="modal" data-target="#modal-new">新建文件夹</a>
							</div>
							<div class="btn-group">
								<form id="form-download" method="post" action="/GPSG/construct-web/ftpDownloadFolder.action">
								<input id="downloads" name="downloads" type="hidden">
								<button id="download-btn" type="button" class="btn btn-success">下载</button>
								</form>
							</div>
							<div class="btn-group">
								<form id="form-delete" method="post" action="/GPSG/construct-web/ftpDeleteFolder.action">
								<input id="delete" name="delete" type="hidden">
							<!-- <button id="delete-btn" type="button" class="btn btn-success">删除</button> -->	
								</form>								
							</div>													
						</div>
						<div class="modal fade" id="modal-new">
								<div class="modal-dialog">
									<div class="modal-content">
										<form id="form-upload" action="ftpCreate.action" method="post" class="form-horizontal" role="form">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
												<h4 class="modal-title" id="myModalLabel">创建文件夹</h4>
											</div>
											<div class="modal-body">											
												<div class="form-group">
													<label class="col-sm-4 control-label" for="input-gp-date">文件夹名称：</label>
													<input name="folderName" type="text">													
												</div>											
											</div>
											<div class="modal-footer">
												<button id="upload-btn" type="submit" class="btn btn-success">上传</button>
												<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
											</div>
										</form>
									</div>
								</div>
							</div>
						<table class="table">
							<tbody>
								<tr>
									<td><input id="check-all" type="checkbox"></td>
									<td>序号</td>
									<td>文件夹名称</td>															
								</tr>         
								<%int i=0; %>   
								<s:iterator value="#request.dadList" id="dad">
								<tr>
									<td><input class="check-one" type="checkbox" value="<s:property/>"/></td>
									<td id="aa">
										<%=++i %>
									</td>
									<td id="aa">
										<a href="/GPSG/construct-web/getSon.action?folder=<s:property/>"><s:property/></a>
									</td>																	
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
			<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60"
						marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>