<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<title>施工端数据展示</title>
	  <link rel="stylesheet" type="text/css" href="/GPSG/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/GPSG/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="/GPSG/css/demo.css">
	<link href="/GPSG/Web/bootstrap-3.0.0/css/bootstrap.css" rel="stylesheet">
	<script src="/GPSG/Web/bootstrap-3.0.0/js/jquery-1.9.1.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/jquery.validate.js"></script>
	<script src="/GPSG/Web/bootstrap-3.0.0/js/bootstrap.js"></script>
</head>
<body>	
    <div class="container">
      <div class="row">
       		<div class="col-sm-4">
       			<ul class="easyui-tree" >
					<li>
						<span>本体库</span>
						<ul>
							<s:iterator value="#request.list1" id="level1">
								<s:if test="#level1.parentId == 0">
									<li>
										<span><s:property value="#level1.name"/></span>
										<ul>
											<s:iterator value="#request.list2" id="level2">
												<s:if test="#level2.parentId==#level1.id">
													<li  data-options="state:'closed'">
														<span><s:property value="#level2.name"/></span>
														<ul>
															<s:iterator value="#request.list3" id="level3">
																<s:if test="#level3.parentId==#level2.id">
																	<li  data-options="state:'closed'">
																		<span><s:property value="#level3.name"/></span>
																	</li>
																</s:if>
															</s:iterator>
														</ul>
													</li>
												</s:if>
											</s:iterator>
										</ul>
									</li>
								</s:if>
							</s:iterator>
						</ul>
					</li>
				</ul>       		
       		</div>
      </div>
    </div>
</body>
</html>