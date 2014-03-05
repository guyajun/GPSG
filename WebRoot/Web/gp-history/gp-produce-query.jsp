<%@ page language="java" pageEncoding="UTF-8"
	import="org.tool.CommonParam"%>
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
			<div id="div-advance" class="row">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">管片生产信息</h3>
					</div>
					<div class="panel-body">
						<div class="well">
							<div class="btn-group">
								<button type="button" class="btn btn-primary">查询生产端管片信息</button>
								<button type="button" class="btn btn-primary dropdown-toggle"
									data-toggle="dropdown">
									<span class="caret"></span> <span class="sr-only">Toggle
										Dropdown</span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#" data-toggle="modal"
										data-target="#modal-loop">按生产流水环号查询</a>
									</li>
								</ul>
							</div>
						</div>
						<table class="table">
							<tbody>
								<tr>
									<td>序号</td>
									<td>管片编号</td>
									<td>项目编号</td>
									<td>扪头编号</td>
									<td>生产流水环号</td>
									<td>施工环号</td>
									<td>施工环位置</td>
									<td>类型</td>
									<td>管片状态</td>
									<td>班次</td>
									<td>钢筋原材料</td>
									<td>操作</td>
									<!-- <td>钢筋质量证明书</td>
									<td>混凝土抗压报告</td>
									<td>混凝土配比通知单</td>
									<td>预埋件质量证明书</td>
									<td>混凝土质量</td>
									<td>混凝土抗渗</td>
									<td>钢筋加工</td>
									<td>钢筋骨架半成品</td>
									<td>钢筋骨架质量</td>
									<td>管片外观质量检查</td>
									<td>模具质量检查</td>
									<td>混凝土浇捣</td>
									<td>管片蒸养</td>
									<td>管片水养</td>
									<td>管片试拼装</td>
									<td>管片捡漏</td>
									<td>管片运输</td>
									<td>管片报废日期</td>
									<td>管片报废原因</td>
									<td>管片起吊</td> 
									<td class="hide"><input id="path" type="hidden"
										value='<s:property value="#request.path"/>'></td>-->
								</tr>
								<s:iterator value="#request.list" id="gp">
									<tr>
										<td id="aa"><s:property value="#gp.id" />
										</td>
										<td id="bb"><s:property value="#gp.gpId" />
										</td>
										<td id="cc"><s:property value="#gp.proId" />
										</td>
										<td id="dd"><s:property value="#gp.coverid" />
										</td>
										<td id="ee"><s:property value="#gp.produceLoop" />
										</td>
										<td id="ff"><s:property value="#gp.tunnelLoop" />
										</td>
										<td id="gg"><s:property value="#gp.tunnelLoopLocation" />
										</td>
										<td id="hh"><s:property value="#gp.type" />
										</td>
										<td id="ii"><s:property value="#gp.gpStatus" />
										</td>
										<td id="jj"><s:property value="#gp.workShift" />
										</td>
										<td id="kk"><s:property value="#gp.steelRawReportId" />
										</td>
										<td><a id="detail" class="btn-detail" href="#">详细</a>
										</td>
										<td id="ll" class="hide"><s:property
												value="#gp.steelQualReportId" />
										</td>
										<td id="mm" class="hide"><s:property
												value="#gp.concResistCompReportId" />
										</td>
										<td id="nn" class="hide"><s:property
												value="#gp.concMixRatioId" />
										</td>
										<td id="oo" class="hide"><s:property value="#gp.preEmbed" />
										</td>
										<td id="pp" class="hide"><s:property value="#gp.concQual" />
										</td>
										<td id="qq" class="hide"><s:property
												value="#gp.concResistLeakId" />
										</td>
										<td id="rr" class="hide"><s:property
												value="#gp.steelProcessReportId" />
										</td>
										<td id="ss" class="hide"><s:property
												value="#gp.steelSkelHalfReportId" />
										</td>
										<td id="tt" class="hide"><s:property
												value="#gp.steelSkelQualReportId" />
										</td>
										<td id="uu" class="hide"><s:property
												value="#gp.gpAppeSizeReportId" />
										</td>
										<td id="vv" class="hide"><s:property
												value="#gp.moldQualReportId" />
										</td>
										<td id="ww" class="hide"><s:property
												value="#gp.concPourReportId" />
										</td>
										<td id="xx" class="hide"><s:property
												value="#gp.gpSteamCuringId" />
										</td>
										<td id="yy" class="hide"><s:property
												value="#gp.waterCuringReportId" />
										</td>
										<td id="zz" class="hide"><s:property
												value="#gp.assemReportId" />
										</td>
										<td id="aaa" class="hide"><s:property
												value="#gp.checkLeakReportId" />
										</td>
										<td id="bbb" class="hide"><s:property
												value="#gp.gpTransportReportId" />
										</td>
										<td id="ccc" class="hide"><s:property
												value="#gp.scrapDate" />
										</td>
										<td id="ddd" class="hide"><s:property
												value="#gp.scrapReason" />
										</td>
										<td id="eee" class="hide"><s:property
												value="#gp.gpCraneId" />
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>						
					</div>
				</div>
				<div class="modal fade" id="modal-download">
					<div class="modal-dialog">
						<div class="modal-content">
							<form id="form2" class="form-horizontal" role="form" method="post"
								action="/GPSG/construct-web/ftpFolders.action">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title" id="myModalLabel">选择时间段</h4>
								</div>
								<div class="modal-body">										
									<div id="alert2" class="alert alert-danger text-center hide"></div>
									<div class="form-group">
										<label class="col-sm-5 control-label" for="input-start-date">开始时间：</label>
										<div class="col-sm-5 input-group start-date">
											<input id="input-start-date" name="startDate" type="text"
												class="form-control"> <span
												class="input-group-addon glyphicon glyphicon-calendar"></span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-5 control-label" for="input-end-date">结束时间：</label>
										<div class="col-sm-5 input-group end-date">
											<input id="input-end-date" name="endDate" type="text"
												class="form-control"> <span
												class="input-group-addon glyphicon glyphicon-calendar"></span>
										</div>
									</div>
								</div>
								<div class="modal-footer">
									<button id="button2" type="button" class="btn btn-success">查看下载</button>
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="modal fade" id="modal-upload">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">本地文件上传FTP</h4>
							</div>
							<div class="modal-body">
								<form id="form-upload" action="copyFtpUpload.action"
									method="post" class="form-horizontal" role="form"
									enctype="multipart/form-data">
									<div class="form-group">
										<label class="col-sm-4 control-label" for="input-gp-date">选择文件：</label>
										<div class="col-sm-6 input-group">
											<input type="file" name="upload" />
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button id="upload-btn" type="button" class="btn btn-success">上传</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</div>
					</div>
				</div>
				<!-- <div class="modal fade" id="modal-upload">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">本地文件上传FTP</h4>
										</div>
										<div class="modal-body">
											<form id="form-upload" action="ftpUpload.action"
												method="post" class="form-horizontal" role="form">
												<div class="form-group">
													<label class="col-sm-4 control-label" for="input-gp-date">文件夹路径：</label>
													<div class="col-sm-6 input-group">
														<input type="text" name="localPath" value="D:\debug1" />
													</div>
												</div>
											</form>
										</div>
										<div class="modal-footer">
											<button id="upload-btn" type="button" class="btn btn-success">上传</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">关闭</button>
										</div>
									</div>
								</div>
							</div> -->
				<div class="modal fade" id="modal-measure-query-date">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">管片生产信息</h4>
							</div>
							<div class="modal-body">
								<form class="form-horizontal" role="form">
									<div class="form-group">
										<label class="col-sm-4 control-label" for="input-gp-date">请输入时间：</label>
										<div class="col-sm-5 input-group gp-produce-date">
											<input id="input-gp-date" type="text" class="form-control">
											<span class="input-group-addon glyphicon glyphicon-calendar"></span>
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</div>
					</div>
				</div>
				<div class="modal fade" id="modal-loop">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title" id="myModalLabel">管片生产信息</h4>
							</div>
							<div class="modal-body">
								<form id="form-loop" method="post"
									action="/GPSG/construct-web/getByLoop.action"
									class="form-horizontal" role="form">
									<div class="form-group">
										<label class="col-sm-4 control-label" for="input-loop">请输入环号：</label>
										<div class="col-sm-5 input-group">
											<input id="input-loop" name="loop" type="text"
												class="form-control">
										</div>
									</div>
								</form>
							</div>
							<div class="modal-footer">
								<button id="queryLoopButton" type="button"
									class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
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
							<h4 class="modal-title" id="myModalLabel">管片生产信息</h4>
						</div>
						<div class="modal-body">
							<table class="table">
								<tbody>
									<tr>
										<td>序号</td>
										<td id="a"></td>
									</tr>
									<tr>
										<td>管片编号</td>
										<td id="b"></td>
									</tr>
									<tr>
										<td>项目编号</td>
										<td id="c"></td>
									</tr>
									<tr>
										<td>扪头编号</td>
										<td id="d"></td>
									</tr>
									<tr>
										<td>生产流水环号</td>
										<td id="e"></td>
									</tr>
									<tr>
										<td>施工环号</td>
										<td id="f"></td>
									</tr>
									<tr>
										<td>施工环位置</td>
										<td id="g"></td>
									</tr>
									<tr>
										<td>类型</td>
										<td id="h"></td>
									</tr>
									<tr>
										<td>管片状态</td>
										<td id="i"></td>
									</tr>
									<tr>
										<td>班次</td>
										<td id="j"></td>
									</tr>
									<tr>
										<td>钢筋原材料</td>
										<td id="k"></td>
									</tr>
									<tr>
										<td>钢筋质量证明书</td>
										<td id="l"></td>
									</tr>
									<tr>
										<td>混凝土抗压报告</td>
										<td id="m"></td>
									</tr>
									<tr>
										<td>混凝土配比通知单</td>
										<td id="n"></td>
									</tr>
									<tr>
										<td>预埋件质量证明书</td>
										<td id="o"></td>
									</tr>
									<tr>
										<td>混凝土质量</td>
										<td id="p"></td>
									</tr>
									<tr>
										<td>混凝土抗渗</td>
										<td id="q"></td>
									</tr>
									<tr>
										<td>钢筋加工</td>
										<td><a id="r"></a></td>
									</tr>
									<tr>
										<td>钢筋骨架半成品</td>
										<td><a id="s"></a></td>
									</tr>
									<tr>
										<td>钢筋骨架质量</td>
										<td><a id="t"></a></td>
									</tr>
									<tr>
										<td>管片外观质量检查</td>
										<td><a id="u"></a></td>
									</tr>
									<tr>
										<td>模具质量检查</td>
										<td><a id="v"></a></td>
									</tr>
									<tr>
										<td>混凝土浇捣</td>
										<td><a id="w"></a></td>
									</tr>
									<tr>
										<td>管片蒸养</td>
										<td><a id="x"></a></td>
									</tr>
									<tr>
										<td>管片水养</td>
										<td><a id="y"></a></td>
									</tr>
									<tr>
										<td>管片试拼装</td>
										<td><a id="z"></a></td>
									</tr>
									<tr>
										<td>管片捡漏</td>
										<td id="3a"></td>
									</tr>
									<tr>
										<td>管片运输</td>
										<td id="3b"></td>
									</tr>
									<tr>
										<td>管片报废日期</td>
										<td id="3c"></td>
									</tr>
									<tr>
										<td>管片报废原因</td>
										<td id="3d"></td>
									</tr>
									<tr>
										<td>管片起吊</td>
										<td id="3e"></td>
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
		</div>
	</div>
	<div id="footer">
		<iframe src="/GPSG/Web/footer.jsp" class="col-md-12" frameborder="0"
			scrolling="no" height="60" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>