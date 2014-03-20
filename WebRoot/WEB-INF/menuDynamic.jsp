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
</head>
<body>
<body topmargin="0" leftmargin="0">
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container alert-info" width="100%" style="height:200;">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">	
					<s:iterator value="#request.list" id="menu">		
						<s:if test="#menu.parentId==u.id">	
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
									<s:property value="#menu.functionName"/><b class="caret"></b>
								</a>
								<ul class="dropdown-menu">
									<s:iterator value="#request.list" id="subMenu">
										<s:if test="#subMenu.parentId==#menu.id">																	
											<li>
												<a target="_parent" href="<s:property value="#subMenu.menuUrl"/>"><s:property value="#subMenu.functionName"/></a>
											</li>
										</s:if>
									</s:iterator>
								</ul>
							</li>	
						</s:if>
					</s:iterator>			
				</ul>
			</div>
		<div>
				<img style="height:120px;" class="col-sm-12 img-responsive" src="./images/topbanner_sg.jpg">
			</div>
	</div>
</div>

</body>
</html>