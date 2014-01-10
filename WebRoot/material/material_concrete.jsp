<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<title>��Ƭ����������Ϣϵͳ</title>
<link href="../css/produce.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">
<link rel="stylesheet" type="text/css" href="../css/demo.css">
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	$(function() {

		$.ajax({
			type : "post",
			url : "/GP/material/comboData_concrete.action",
			success : function() {
			}
		});
	});
</script>
<script type="text/javascript">
	$(function() {
		var src = $("#image").attr("src");
		var url = src.substring(src.lastIndexOf("/") + 1, src.length);
		var reportId = src.substring(src.lastIndexOf("/") + 1, src
				.lastIndexOf("."));
		$(".url").attr("value", url);
		$(".reportId").attr("value", reportId);
	});
</script>
</head>

<body>
	<jsp:include page="../produce/produce_head.jsp"></jsp:include>
	<div class="box-left">
		<div title="��������" style="width:170px;padding:10px;overflow:hidden;">
			<ul class="easyui-tree">
				<s:action name="testMenu" executeResult="true" />
			</ul>
		</div>
	</div>
	<div>
		<div style="margin:10px 0;"></div>
		<div id="tt" class="easyui-panel" title="������ͼ���ƻ���������֤����"
			style="auto;height:auto; padding:0px;">
			<div style="padding:20px 20px 20px 40px">
				<form method="post" action="concQual.action">
					<table>
						<tr>
							<td>��������:</td>
							<td><input id="dd" class="easyui-datebox"
								style="width:250px;" name="concQual.purchaseTime"></input>
							</td>

						</tr>
						<tr>
							<td>��������:</td>
							<td><input type="text" style="width:250px;"
								name="concQual.purchaseAmount"></input>
							</td>
							<td>���֪ͨ����:</td>
							<td><input type="text" style="width:250px;"
								name="concQual.mixRatioId"></input>
							</td>
						</tr>
						<tr>
							<td>ʹ�ÿ�ʼ����:</td>
							<td><input id="dd" class="easyui-datebox"
								style="width:250px;" name="concQual.useBeginTime"></input>
							</td>
							<td>ʹ�ý�������:</td>
							<td><input id="dd" class="easyui-datebox"
								style="width:250px;" name="concQual.useEndTime"></input>
							</td>
						</tr>
						<tr>
							<td><input type="text" class="url" name="concQual.url"
								style="display:none"></td>
							<td><input type="text" class="reportId"
								name="concQual.reportId" style="display:none"></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" id="save" value="����������Ϣ"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="tt" class="easyui-panel" title="��������ͼ�������֪ͨ��"
			style="auto;height:auto;">
			<div style="padding:20px 20px 20px 40px">
				<form method="post" action="concMixRatio.action">
					<table height="100px">
						<tr>
							<td>�� ��:</td>
							<td><input id="dd" class="easyui-datebox"
								style="width:250px;" name="concMixRatio.date"></input>
							</td>
						</tr>
						<tr>
							<td><input type="text" class="url" name="concMixRatio.url"
								style="display:none"></td>
							<td><input type="text" class="reportId"
								name="concMixRatio.mixRatioId" style="display:none"></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" id="save" value="����������Ϣ"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="preview" class="easyui-panel" title="ͼƬԤ��"
			style="width:auto;height:auto">
			<img style="align:center;width:1000px;height:1000px" id="image" src="../uploadfile/${request.fileName}">
		</div>
	</div>
</body>
</html>
