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
<script src="/GPSG/Web/bootstrap-3.0.0/js/moment.min.js"></script>
<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" charset="utf-8">
	$(function() {
		$('.choose').on(
				'click',
				function() {
					var tr = $(this).parent().parent();
					var photos = tr.find('#td-photo').text().split('@');
					$('#modal-body').empty();
					for ( var i = 0; i < photos.length; i++) {
						var item = $('#template').clone();
						item.find('.oneImg').attr(
								'href',
								'/GPSG/Web/gp-history/image-construct.jsp?folder=Downwell&fileName='
										+ photos[i] + '.png');
						item.find('.oneImg').text(photos[i]+'.png');
						item.appendTo($('#modal-body'));
					}
					$('#modal-photo').modal('show');
				});
	});
</script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div id="div-advance" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">管片施工信息</h3>
					</div>
					<div class="panel-body">
						<%
							int i = 0;
						%>
						<table class="table">
							<tbody>
								<tr>
									<td>序号</td>
									<td>生产端编号</td>
									<td>情况说明</td>
									<td>照片</td>
									<td>结论</td>
									<td>东西线(0—东线 1—西线)</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.list" id="row">
									<tr>
										<td><%=++i%></td>
										<td><s:property value="#row.produceLoop" />
										</td>
										<td><s:property value="#row.condition" />
										</td>
										<td id="td-photo"><s:property value="#row.photo" /></td>
										<td><s:property value="#row.result" />
										</td>
										<td><s:property value="#row.isEast" />
										</td>
										<td><a href="#" class="choose">查看照片</a></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
				<div class="modal fade" id="modal-photo">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">请选择图片</h4>
							</div>
							<div id="modal-body" class="modal-body"></div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</div>
					</div>
				</div>
				<div class="hide">
					<div id="template" class="well text-center">
						<a class="oneImg"></a>
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