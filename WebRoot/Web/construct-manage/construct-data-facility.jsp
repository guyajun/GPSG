<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
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
<script src="/GPSG/Web/construct-manage/construct-data-facility.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info" style="height:150px;">
					<div class="panel-heading">查询事项</div>
					<div class="panel-body">
						<div class="well">
							<a id="a-mud" href="/GPSG/construct-web/soil.action"
								class="btn btn-danger">剖面位置/土质图</a> <a id="a-facility"
								href="/GPSG/construct-web/facility.action"
								class="btn btn-primary btn-lg">沿线重要设施</a> <a id="a-measure"
								href="/GPSG/construct-web/measure.action" class="btn btn-success">测点布置情况</a>
							<a id="a-advance"
								href="/GPSG/construct-web/advance_getAllRecord.action"
								class="btn btn-warning">盾构推进数据</a> <a id="a-pose"
								href="/GPSG/construct-web/pose.action" class="btn btn-success ">盾构/管片姿态</a>
							<a id="a-syn" href="/GPSG/construct-web/syn.action"
								class="btn btn-primary">同步注浆数据</a> <a id="a-thing"
								href="/GPSG/construct-web/thing.action" class="btn btn-danger">施工大事记录</a>
						</div>
					</div>
				</div>
			</div>
			<div id="div-facility" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">沿线重要设施</h3>
					</div>
					<div class="panel-body">
						<div class="well">
						<div class="btn-group">
							<button type="button" class="btn btn-primary">查询</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
							<!-- 	<li><a href="#" data-toggle="modal"
									data-target="#modal-syn-date">按索引号查询</a></li> -->
								<li><a href="#" data-toggle="modal"
									data-target="#modal-syn-loop">按环号查询</a></li>
							</ul>
						</div>
						<div class="btn-group">
							<button type="button" class="btn btn-primary">EXCEL导出</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#" data-toggle="modal"
									data-target="#modal-total">导出全部记录</a></li>

							</ul>
						</div><!-- 
						<div class="btn-group">
							<button type="button" class="btn btn-primary">绘制曲线</button>
							<button type="button" class="btn btn-primary dropdown-toggle"
								data-toggle="dropdown">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu" role="menu">
								<li><a id="date-md" href="/GPSG/construct-web/draw.action">绘制环号-桩基与隧道间距</a>
								</li>
							</ul>
						</div> -->


						<div class="modal fade" id="modal-total">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">导出所有记录</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<form id="form-total" method="post"
												action="/GPSG/construct-web/excelAll2.action"
												class="form-inline" role="form">
												<div class="form-group col-sm-9">
													<label class="col-sm-6 control-label" for="excelPath">请输入EXCEL导出路径：</label>
													<div class="col-sm-6">
														<input id="excelPath" name="excelPath"
															value="d:/沿线重要设施.xls" type="text" class="form-control">
													</div>
												</div>
												<div class="col-sm-3">
													<button type="submit" id="export-all-btn" class="btn btn-success">导出</button>
												</div>
											</form>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="modal fade" id="modal-syn-date">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">建筑物索引</h4>
								</div>
								<div class="modal-body">
									<form id="form-date-query" method="post"
										action="/GPSG/construct-web/sheshiDengji.action"
										class="form-inline" role="form">
										<div class="form-group col-sm-8">
											<label class="col-sm-5 control-label" for="input-date">请输入索引号：</label>
											<div class="col-sm-7">
												<input id="input-date" name="ssIndx" type="text"
													class="form-control">
											</div>
										</div>
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" id="query-date-btn"
										class="btn btn-success">查询</button>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="modal-syn-loop">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">剖面位置/土质图</h4>
								</div>
								<div class="modal-body">
									<form id="form-query-by-loop" method="post"
										action="/GPSG/construct-web/sheshiLoop.action"
										class="form-inline" role="form">
										<div class="form-group col-sm-8">
											<label class="col-sm-5 control-label" for="input-loop">环号：</label>
											<div class="col-sm-7">
												<input id="input-loop" name="ssLoop" type="text"
													class="form-control">
											</div>
										</div>
									</form>
								</div>
								<div class="modal-footer">
									<button type="button" id="query-loop-btn"
										class="btn btn-success">查询</button>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					<div class="modal fade" id="modal-detail">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">土质信息</h4>
								</div>
								<div class="modal-body">
									<table class="table">
										<tbody>
											<tr>
												<td>索引号</td>
												<td id="index1"></td>
											</tr>
											<tr>
												<td>项目编号</td>
												<td id="a"></td>
											</tr>
											<tr>
												<td>环号</td>
												<td id="b"></td>
											</tr>
											<tr>
												<td>里程</td>
												<td id="c"></td>
											</tr>
											<tr>
												<td>建筑物名称</td>
												<td id="d"></td>
											</tr>
											<tr>
												<td>建筑物保护等级</td>
												<td id="e"></td>
											</tr>
											<tr>
												<td>建筑物名建造年份</td>
												<td id="f"></td>
											</tr>
											<tr>
												<td>建筑物结构</td>
												<td id="g"></td>
											</tr>
											<tr>
												<td>建筑物用途</td>
												<td id="h"></td>
											</tr>

											<tr>
												<td>穿越形式</td>
												<td id="i"></td>
											</tr>
											<tr>
												<td>基础形式</td>
												<td id="j"></td>
											</tr>
											<tr>
												<td>基底标高</td>
												<td id="k"></td>
											</tr>
											<tr>
												<td>桩基与隧道间距</td>
												<td id="l"></td>
											</tr>

											<tr>
												<td>允许差异沉降</td>
												<td id="m"></td>
											</tr>
											<tr>
												<td>允许隆起沉降</td>
												<td id="n"></td>
											</tr>
											<tr>
												<td>相关测点列表</td>
												<td id="o"></td>
											</tr>
											<tr>
												<td>允许倾斜</td>
												<td id="p"></td>
											</tr>


											<tr>
												<td>东西线</td>
												<td id="q"></td>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</div>
						</div>
					</div>
					<div>
						<table class="table">
							<tbody>
								<tr>
									<td>索引号</td>
									<td>项目编号</td>
									<td>环号</td>
									<td>里程</td>
									<td>建筑物名称</td>
									<td>建筑物保护等级</td>
									<td>建筑物名建造年份</td>
									<td>建筑物结构</td>
									<td>建筑物用途</td>
									<td>穿越形式</td>
									<td>基础形式</td>
									<td>桩基与隧道间距</td>
									<td>基底标高</td>

									<td>操作</td>
								</tr>


								<s:iterator value="#request.sheshiList" id="sheshi">
									<tr>
										<td id="index"><s:property value="#sheshi.ssIndx" /></td>
										<td id="aa"><s:property value="#sheshi.proId" /></td>
										<td id="bb"><s:property value="#sheshi.ssLoop" /></td>
										<td id="cc"><s:property value="#sheshi.ssLicheng" /></td>
										<td id="dd"><s:property value="#sheshi.ssDspt" /></td>
										<td id="ee"><s:property value="#sheshi.ssType" /></td>
										<td id="ff"><s:property value="#sheshi.ssYear" /></td>
										<td id="gg"><s:property value="#sheshi.ssJiegou" /></td>
										<td id="hh"><s:property value="#sheshi.ssYongtu" /></td>
										<td id="ii"><s:property value="#sheshi.ssCyxs" /></td>
										<td id="jj"><s:property value="#sheshi.ssBase" /></td>
										<td id="kk"><s:property value="#sheshi.ssJdbg" /></td>
										<td id="ll"><s:property value="#sheshi.ssZsjj" /></td>
										<td><a id="detail" class="btn-detail" href="#">详细</a></td>
										<td id="mm" class="hide"><s:property
												value="#sheshi.ssCycj" /></td>
										<td id="nn" class="hide"><s:property
												value="#sheshi.ssLqcj" /></td>

										<td id="oo" class="hide"><s:property
												value="#sheshi.ssRelcd" /></td>
										<td id="pp" class="hide"><s:property value="#sheshi.ssQx" />
										</td>


										<td id="qq" class="hide"><s:property
												value="#sheshi.IsEast" /></td>



									</tr>
								</s:iterator>

							</tbody>
						</table>
</div>
						<div class="well">
							<div class="col-sm-offset-4">
								<s:set name="page" value="#request.pager"></s:set>
								<form id="form-page" method="get"
									action="/GPSG/construct-web/facility.action">
									<input id="input-page" name="pageNow" style="width:30px;"
										value="<s:property value="#page.pageNow"/>"> /
									<s:property value="#page.totalPage" />
									<s:if test="#page.hasFirst">
										<s:a target="_parent" href="facility.action?pageNow=1">首页</s:a>
									</s:if>
									<s:if test="#page.hasPre">
										<a target="_parent"
											href="facility.action?pageNow=<s:property value="#page.pageNow-1"/>
									">上一页
										</a>
									</s:if>
									<s:if test="#page.hasNext">
										<a target="_parent"
											href="facility.action?pageNow=<s:property value="#page.pageNow+1"/>
								">下一页
										</a>
									</s:if>
									<s:if test="#page.hasLast">
										<a target="_parent"
											href="facility.action?pageNow=<s:property value="#page.totalPage"/>
							">尾页
										</a>
									</s:if>
								</form>
							</div>
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