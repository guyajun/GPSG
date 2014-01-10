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
	function save() {
		$('#ff2').submit();
	}
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
	<div style="margin:0px 0;"></div>
	<div style="margin:0px 0;"></div>
	<div class="easyui-panel" title="��Ӳ˵�" style="width:auto;">
		<div style="padding:10px 0 10px 10px">
			<form action="adduser.action" id="ff2" method="post">
				<table>
					<tr>
						<td>�˵�����:</td>
						<td><input type="text" name="userinfo.jobNumber"></input>
						</td>
						<td>�˵�����:</td>
						<td><input type="text" name="userinfo.fullName"></input>
						</td>
						<td>���˵����:</td>
						<td><input type="text" name="userinfo.loginName"></input>
						</td>
						<td><a class="easyui-linkbutton" onclick="save();">����</a>
						</td>
					</tr>
				</table>
			</form>

		</div>
	</div>
	<div class="easyui-panel" title="ɾ���˵�" style="width:auto;">
		<div style="padding:10px 0 10px 10px">
			<form id="ff3" method="post">
				<table>
					<tr>
						<td>�˵����:</td>
						<td><input class="easyui-validatebox" type="text" name="uid"></input>
						</td>
						<td>
							<div style="padding:5px">
								<a class="easyui-linkbutton" onClick="del();">ɾ��</a>
							</div></td>
					</tr>
				</table>
			</form>
		</div>
		</div>

		<div style="margin:10px 0;"></div>
		<table class="easyui-datagrid" title="�˵���Ϣ"
			style="width:auto;height:250px">
			<thead>
				<tr>
					<th data-options="field:'itemid',width:60,align:'center'">�˵����</th>
					<th data-options="field:'productid',width:60,align:'center'">�˵�����</th>
					<th data-options="field:'listprice',width:80,align:'center'">�˵�����</th>
					<th data-options="field:'unitcost',width:80,align:'center'">���˵����</th>
					<th data-options="field:'attr1',width:100,align:'center'">������</th>
					<th data-options="field:'status',width:60,align:'center'">����ʱ��</th>
				</tr>
			</thead>
		</table>
</body>
</html>
