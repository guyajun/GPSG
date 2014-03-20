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
<script src="/GPSG/Web/admin-manage/projectmanage.js"></script>
</head>
<body>
	<div id="wrap">
		<iframe src="/GPSG/construct-web/menu.action" width="100%"
			height="160px"></iframe>
		<div class="container">
			<div class="row">
				<div class="panel panel-info">
					<div class="panel-heading">项目管理</div>
					<div class="panel-body">
						<div class="well">
							<a href="#" class="btn btn-success" data-toggle="modal"
								data-target="#modal-add">添加项目信息</a> <a href="#"
								class="btn btn-success" data-toggle="modal"
								data-target="#modal-query">查询项目信息</a>

						</div>
						<table class="table">
							<tbody>
								<tr>
									<td>项目ID</td>
									<td>项目编号</td>
									<td>项目名称</td>
									<td>项目类型</td>
									<td>管片数量</td>
									<td>管片起始编号</td>
									<td>管片终止编号</td>
									<td>操作</td>
									<td>操作</td>
									<td>操作</td>
								</tr>
								<s:iterator value="#request.prolist" id="pro">
									<tr>
										<td id="index"><s:property value="#pro.id" /></td>
										<td id="aa"><s:property value="#pro.proCode" /></td>
										<td id="bb"><s:property value="#pro.proName" /></td>
										<td id="cc"><s:property value="#pro.proType" /></td>
										<td id="dd"><s:property value="#pro.gpCount" /></td>
										<td id="ee"><s:property value="#pro.startGpId" />
										</td>
										<td id="ff"><s:property value="#pro.endGpId" /></td>
										<td><a href="#" class="edit">修改</a></td> 
									<td><a href="#" class="delete">删除</a></td>
										<td><a href="#" class="detail">详细</a></td>
										<td id="gg" class="hide"><s:property value="#pro.gkTltp" />
										</td>
										<td id="hh" class="hide"><s:property value="#pro.gkTllg" />
										</td>
										<td id="ii" class="hide"><s:property value="#pro.gkIndm" />
										</td>
										<td id="jj" class="hide"><s:property value="#pro.gkOtdm" />
										</td>
										<td id="kk" class="hide"><s:property value="#pro.gkSdtp" />
										</td>
										<td id="ll" class="hide"><s:property value="#pro.gkSddm" />
										</td>
										<td id="mm" class="hide"><s:property value="#pro.gkSdlg" />
										</td>
										<td id="nn" class="hide"><s:property value="#pro.gkStrg" />
										</td>
										<td id="oo" class="hide"><s:property value="#pro.gkStdt" />
										</td>
										<td id="pp" class="hide"><s:property value="#pro.gkLayer" />
										</td>
										<td id="qq" class="hide"><s:property
												value="#pro.gkAxspic1" /></td>
										<td id="rr" class="hide"><s:property
												value="#pro.gkAxspic2" /></td>
										<td id="ss" class="hide"><s:property value="#pro.gkPzxs" />
										</td>
										<td id="tt" class="hide"><s:property value="#pro.gkXt" />
										</td>
										<td id="uu" class="hide"><s:property value="#pro.gkCst" />
										</td>
										<td id="vv" class="hide"><s:property value="#pro.gkSpt" />
										</td>
										<td id="ww" class="hide"><s:property value="#pro.gkBld" />
										</td>
										<td id="xx" class="hide"><s:property value="#pro.gkCstmg" />
										</td>
										<td id="yy" class="hide"><s:property value="#pro.gkSptmg" />
										</td>
										<td id="zz" class="hide"><s:property value="#pro.gkBldmg" />
										</td>
										<td id="aaa" class="hide"><s:property
												value="#pro.description" /></td>
										<td id="bbb" class="hide"><s:property
												value="#pro.ringWidth" /></td>
										<td id="ccc" class="hide"><s:property
												value="#pro.proStatus" /></td>
										<td id="ddd" class="hide"><s:property
												value="#pro.produceUnit" /></td>
										<td id="eee" class="hide"><s:property
												value="#pro.completeTime" /></td>
										<td id="fff" class="hide"><s:property value="#pro.memo" />
										</td>
										<td id="ggg" class="hide"><s:property value="#pro.isEast" />
										</td>


									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-edit">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop" method="post"
							action="/GPSG/system/editpro123.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">编辑角色信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">项目编号：</label>
									<div class="col-sm-6">
										<input id="role-id" name="id" type="hidden"
											class="form-control"> <input id="role-name1"
											name="proCode" type="text" class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name2" class="col-sm-4 control-label">项目名称：</label>
									<div class="col-sm-6">
										<input id="role-name2" name="proName" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name3" class="col-sm-4 control-label">项目类型：</label>
									<div class="col-sm-6">
										<input id="role-name3" name="proType" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name4" class="col-sm-4 control-label">管片数量：</label>
									<div class="col-sm-6">
										<input id="role-name4" name="gpCount" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name5" class="col-sm-4 control-label">管片起始编号：</label>
									<div class="col-sm-6">
										<input id="role-name5" name="startGpId" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">管片终止编号：</label>
									<div class="col-sm-6">
										<input id="role-name6" name="endGpId" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name7" class="col-sm-4 control-label">隧道类型：</label>
									<div class="col-sm-6">
										<input id="role-name7" name="gkTltp" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name8" class="col-sm-4 control-label">隧道总长：</label>
									<div class="col-sm-6">
										<input id="role-name8" name="gkTllg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name9" class="col-sm-4 control-label">隧道内径：</label>
									<div class="col-sm-6">
										<input id="role-name9" name="gkIndm" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name10" class="col-sm-4 control-label">隧道外径：</label>
									<div class="col-sm-6">
										<input id="role-name10" name="gkOtdm" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name11" class="col-sm-4 control-label">盾构类型：</label>
									<div class="col-sm-6">
										<input id="role-name11" name="gkSdtp" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name12" class="col-sm-4 control-label">盾构直径：</label>
									<div class="col-sm-6">
										<input id="role-name12" name="gkSddm" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name13" class="col-sm-4 control-label">盾构长度：</label>
									<div class="col-sm-6">
										<input id="role-name13" name="gkSdlg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name14" class="col-sm-4 control-label">起始环号：</label>
									<div class="col-sm-6">
										<input id="role-name14" name="gkStrg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name15" class="col-sm-4 control-label">起始里程：</label>
									<div class="col-sm-6">
										<input id="role-name15" name="gkStdt" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name16" class="col-sm-4 control-label">地质资料图：</label>
									<div class="col-sm-6">
										<input id="role-name16" name="gkLayer" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name17" class="col-sm-4 control-label">纵向轴线图：</label>
									<div class="col-sm-6">
										<input id="role-name17" name="gkAxspic1" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name18" class="col-sm-4 control-label">横向轴线图：</label>
									<div class="col-sm-6">
										<input id="role-name18" name="gkAxspic2" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name19" class="col-sm-4 control-label">拼装形式：</label>
									<div class="col-sm-6">
										<input id="role-name19" name="gkPzxs" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name20" class="col-sm-4 control-label">每环管片个数：</label>
									<div class="col-sm-6">
										<input id="role-name20" name="gkXt" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name21" class="col-sm-4 control-label">施工队伍：</label>
									<div class="col-sm-6">
										<input id="role-name21" name="gkCst" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name22" class="col-sm-4 control-label">监理单位：</label>
									<div class="col-sm-6">
										<input id="role-name22" name="gkSpt" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name23" class="col-sm-4 control-label">业主单位：</label>
									<div class="col-sm-6">
										<input id="role-name23" name="gkBld" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name24" class="col-sm-4 control-label">施工负责人：</label>
									<div class="col-sm-6">
										<input id="role-name24" name="gkCstmg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name25" class="col-sm-4 control-label">监理负责人：</label>
									<div class="col-sm-6">
										<input id="role-name25" name="gkSptmg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name26" class="col-sm-4 control-label">业主负责人：</label>
									<div class="col-sm-6">
										<input id="role-name26" name="gkBldmg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name27" class="col-sm-4 control-label">项目描述：</label>
									<div class="col-sm-6">
										<input id="role-name27" name="description" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name28" class="col-sm-4 control-label">环宽：</label>
									<div class="col-sm-6">
										<input id="role-name28" name="ringWidth" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name29" class="col-sm-4 control-label">项目状态：</label>
									<div class="col-sm-6">
										<input id="role-name29" name="proStatus" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name30" class="col-sm-4 control-label">管片生产单位：</label>
									<div class="col-sm-6">
										<input id="role-name30" name="produceUnit" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name31" class="col-sm-4 control-label">竣工时间：</label>
									<div class="col-sm-6">
										<input id="role-name31" name="completeTime" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name32" class="col-sm-4 control-label">备注：</label>
									<div class="col-sm-6">
										<input id="role-name32" name="memo" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name33" class="col-sm-4 control-label">东西线：</label>
									<div class="col-sm-6">
										<input id="role-name33" name="isEast" type="text"
											class="form-control">
									</div>
								</div>


							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-success">保存</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-add">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop2" method="post"
							action="/GPSG/system/addpro.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">添加项目信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name1" class="col-sm-4 control-label">项目ID：</label>
									<div class="col-sm-6">
										<input id="role-name1" name="id" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-jobNumber" class="col-sm-4 control-label">项目编号：</label>
									<div class="col-sm-6">
										<input id="role-jobNumber" name="proCode" type="text"
											class="form-control">
									</div>
								</div>

								<div class="form-group">
									<label for="role-Log" class="col-sm-4 control-label">项目名称：</label>
									<div class="col-sm-6">
										<input id="role-Log" name="proName" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-Phone" class="col-sm-4 control-label">项目类型：</label>
									<div class="col-sm-6">
										<input id="role-Phone" name="proType" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">管片数量：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gpCount" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">管片起始编号：</label>
									<div class="col-sm-6">
										<input id="role-name" name="startGpId" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">管片终止编号：</label>
									<div class="col-sm-6">
										<input id="role-name" name="endGpId" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">隧道类型：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkTltp" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">隧道总长：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkTllg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">隧道内径：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkIndm" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">隧道外径：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkOtdm" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">盾构类型：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkSdtp" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">盾构直径：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkSddm" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">盾构长度：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkSdlg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">起始环号：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkStrg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">起始里程：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkStdt" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">地质资料图：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkLayer" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">纵向轴线图：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkAxspic1" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">横向轴线图：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkAxspic2" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">拼装形式：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkPzxs" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">每环管片个数：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkXt" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">施工队伍：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkCst" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">监理单位：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkSpt" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">业主单位：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkBld" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">施工负责人：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkCstmg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">监理负责人：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkSptmg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">业主负责人：</label>
									<div class="col-sm-6">
										<input id="role-name" name="gkBldmg" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">项目描述：</label>
									<div class="col-sm-6">
										<input id="role-name" name="description" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">环宽：</label>
									<div class="col-sm-6">
										<input id="role-name" name="ringWidth" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">项目状态：</label>
									<div class="col-sm-6">
										<input id="role-name" name="proStatus" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">管片生产单位：</label>
									<div class="col-sm-6">
										<input id="role-name" name="produceUnit" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">竣工时间：</label>
									<div class="col-sm-6">
										<input id="role-name" name="completeTime" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">备注：</label>
									<div class="col-sm-6">
										<input id="role-name" name="memo" type="text"
											class="form-control">
									</div>
								</div>
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">东西线：</label>
									<div class="col-sm-6">
										<input id="role-name" name="isEast" type="text"
											class="form-control">
									</div>
								</div>

							</div>
							<div class="modal-footer">
								<button id='export-all-btn' type="button" class="btn btn-success">保存</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<form id="form-hide" method="post" action="/GPSG/system/deletepro.action" class="hide form-horizontal" role="form">
				<input id="role-name88" name="proName" type="text" class="form-control">
			</form>
			<div class="modal fade" id="modal-query">
				<div class="modal-dialog">
					<div class="modal-content">
						<form id="form-query-by-loop3" method="post"
							action="/GPSG/system/getByproName.action" class="form-horizontal"
							role="form">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">查询项目信息</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
									<label for="role-name" class="col-sm-4 control-label">项目名称：</label>
									<div class="col-sm-6">
										<input id="role-name" name="proName" type="text"
											class="form-control">
									</div>
								</div>
							</div>
							<div class="modal-footer">
								<button id='export-all-btn2' type="button" class="btn btn-success">查询</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal fade" id="modal-detail">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">项目信息</h4>
						</div>
						<div class="modal-body">
							<table class="table">
								<tbody>
									<tr>
										<td>项目ID</td>
										<td id="index1"></td>
									</tr>

									<tr>
										<td>项目编号</td>
										<td id="a"></td>
									</tr>
									<tr>
										<td>项目名称</td>
										<td id="b"></td>
									</tr>
									<tr>
										<td>项目类型</td>
										<td id="c"></td>
									</tr>
									<tr>
										<td>管片数量</td>
										<td id="d"></td>
									</tr>
									<tr>
										<td>管片起始编号</td>
										<td id="e"></td>
									</tr>
									<tr>
										<td>管片终止编号</td>
										<td id="f"></td>
									</tr>
									<tr>
										<td>隧道类型</td>
										<td id="g"></td>
									</tr>
									<tr>
										<td>隧道总长</td>
										<td id="h"></td>
									</tr>
									<tr>
										<td>隧道内径</td>
										<td id="i"></td>
									</tr>
									<tr>
										<td>隧道外径</td>
										<td id="j"></td>
									</tr>
									<tr>
										<td>盾构类型</td>
										<td id="k"></td>
									</tr>
									<tr>
										<td>盾构直径</td>
										<td id="l"></td>
									</tr>
									<tr>
										<td>盾构长度</td>
										<td id="m"></td>
									</tr>
									<tr>
										<td>起始环号</td>
										<td id="n"></td>
									</tr>
									<tr>
										<td>起始里程</td>
										<td id="o"></td>
									</tr>
									<tr>
										<td>地质资料图</td>
										<td id="p"></td>
									</tr>
									<tr>
										<td>纵向轴线图</td>
										<td id="q"></td>
									</tr>

									<tr>
										<td>横向轴线图</td>
										<td id="r"></td>
									</tr>
									<tr>
										<td>拼装形式</td>
										<td id="s"></td>
									</tr>
									<tr>
										<td>每环管片个数</td>
										<td id="t"></td>
									</tr>
									<tr>
										<td>施工队伍</td>
										<td id="u"></td>
									</tr>
									<tr>
										<td>监理单位</td>
										<td id="v"></td>
									</tr>
									<tr>
										<td>业主单位</td>
										<td id="w"></td>
									</tr>
									<tr>
										<td>施工负责人</td>
										<td id="x"></td>
									</tr>
									<tr>
										<td>监理负责人</td>
										<td id="y"></td>
									</tr>
									<tr>
										<td>业主负责人</td>
										<td id="z"></td>
									</tr>
									<tr>
										<td>项目描述</td>
										<td></td>
									</tr>
									<tr>
										<td>环宽</td>
										<td id="3b"></td>
									</tr>
									<tr>
										<td>项目状态</td>
										<td id="3c"></td>
									</tr>
									<tr>
										<td>管片生产单位</td>
										<td id="3d"></td>
									</tr>
									<tr>
										<td>竣工时间</td>
										<td id="3e"></td>
									</tr>
									<tr>
										<td>备注</td>
										<td id="3f"></td>
									</tr>
									<tr>
										<td>东西线</td>
										<td id="3g"></td>
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
			<div class="modal fade" id="modal-project">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">查询项目信息</h4>
						</div>
						<div class="modal-body">
							<form class="form-inline" role="form">
								<div class="form-group col-sm-8">
									<label class="col-sm-5 control-label" for="input-project-name">项目名称：</label>
									<div class="col-sm-7 input-group">
										<input id="input-project-name" type="text"
											class="form-control">
									</div>
								</div>
								<div class="col-sm-4">
									<button type="submit" class="btn btn-success">查询</button>
								</div>
							</form>
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
			scrolling="no" height="60px" marginheight="0" marginwidth="0"></iframe>
	</div>
</body>
</html>