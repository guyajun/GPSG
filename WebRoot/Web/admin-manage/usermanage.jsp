<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
	<title>施工端数据展示</title>
	<link href="/GP/Web/bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet">
	<link href="/GP/Web/bootstrap-3.0.0/css/bootstrap-datetimepicker.css" rel="stylesheet">
	<link href="/GP/Web/bootstrap-3.0.0/css/sticky-footer-navbar.css" rel="stylesheet">
	<script src="/GP/Web/bootstrap-3.0.0/js/jquery-1.9.1.js"></script>
	<script src="/GP/Web/bootstrap-3.0.0/js/jquery.validate.js"></script>
	<script src="/GP/Web/bootstrap-3.0.0/js/bootstrap.js"></script>
	<script src="/GP/Web/bootstrap-3.0.0/js/bootbox.js"></script>
	<script src="/GP/Web/bootstrap-3.0.0/js/moment.min.js"></script>
	<script src="/GP/Web/bootstrap-3.0.0/js/bootstrap-datetimepicker.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GP/construct-web/menu.action" width="100%" height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">用户管理</div>
					<div class="panel-body">
						<div class="well">
							<a href="#" class="btn btn-success">添加</a>
							<a href="#" class="btn btn-success">查询</a>
						</div>
						<table class="table">
							<tr>
								<td>序号</td>
								<td>姓名</td>
								<td>登陆名</td>
								<td>部门</td>
								<td>角色</td>
								<td>手机</td>
								<td>创建人</td>
								<td>创建时间</td>
								<td>操作</td>
								<td>操作</td>
							</tr>
							<tr>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td>1</td>
								<td><a href="#">编辑</a></td>
								<td><a href="#">删除</a></td>
							</tr>
						</table>

					</div>
				</div>
			</div>
		</div>
	</div>
	
<div id="footer">
<iframe src="/GP/Web/footer.jsp" class="col-md-12" frameborder="0" scrolling="no" height="60px"
						marginheight="0" marginwidth="0"></iframe>
</div>
</body>
</html>