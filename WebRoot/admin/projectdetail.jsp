<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>��Ƭ����������Ϣϵͳ</title>
<link href="../css/produce.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../themes/icon.css" />
<link rel="stylesheet" type="text/css" href="../css/demo.css" />
<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	function submit() {
		$('#form1').submit();
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

	<h3>����Ŀ��Ϣ���£�</h3>
	<s:set name="pro3" value="#request.pro3"></s:set>
	<s:form action="updateProInfo.action" method="post" id="form1">
		<table border="0" cellpadding="5" bgcolor="#D9DFAA"
			style="width:auto;">
			<tr>
				<td>��Ŀ���ƣ�</td>
				<td><input name="proInfo.id"
					value="<s:property value="#pro3.id"/>" / type="hidden"> <input
					name="proInfo.proName" style="width:269px;"
					value="<s:property value="#pro3.proName"/>" /></td>

			</tr>
			<tr>
				<td>����Ŀ���ƣ�</td>
				<td><select name="proInfo.proInfo.proName" style="width:269px;"
					value="<s:property value="#pro3.proInfo.proName"/>">
						<option value="0" selected></option>
						<s:iterator value="#request.listpro" id="list1">
							<option value="<s:property value="#list1.id"/>">
								<s:property value="#list1.proName" />
							</option>
						</s:iterator>
				</select></td>
			</tr>
			<tr>
				<td>��Ŀ����</td>
				<td><input name="proInfo.directorId" style="width:269px;"
					value="<s:property value="#pro3.directorId"/>" /></td>
			</tr>
			<tr>
				<td>��Ŀ����绰��</td>
				<td><input name="proInfo.directorPhone" style="width:269px;"
					value="<s:property value="#pro3.directorPhone"/>" /></td>
			</tr>
			<tr>
				<td>��Ŀ���ͣ�</td>
				<td><input name="proInfo.proType" style="width:269px;"
					value="<s:property value="#pro3.proType"/>" /></td>
			</tr>
			<tr>
				<td><label>һ����ȫ�ܼ�</label></td>
				<td><input name="proInfo.levelOneId" style="width:269px;"
					value="<s:property value="#pro3.levelOneId"/>" /></td>
			</tr>
			<tr>
				<td><label>������ȫ�ܼ�</label></td>
				<td><input name="proInfo.levelTwoId" style="width:269px;"
					value="<s:property value="#pro3.levelTwoId"/>" /></td>
			</tr>
			<tr>
				<td><label>�ƻ�������Ƭ����</label></td>
				<td><input name="proInfo.gpCount" style="width:269px;"
					value="<s:property value="#pro3.gpCount"/>" /></td>
			</tr>
			<tr>
				<td><label>������λ</label></td>
				<td><input name="proInfo.produceUnit" style="width:269px;"
					value="<s:property value="#pro3.produceUnit"/>" /></td>
			</tr>
			<tr>
				<td><label>���赥λ</label></td>
				<td><input name="proInfo.buildUnit" style="width:269px;"
					value="<s:property value="#pro3.buildUnit"/>" /></td>
			</tr>
			<tr>
				<td><label>��Ƶ�λ</label></td>
				<td><input name="proInfo.designUnit" style="width:269px;"
					value="<s:property value="#pro3.designUnit"/>" /></td>
			</tr>
			<tr>
				<td><label>���ܵ�λ</label></td>
				<td><input name="proInfo.manageUnit" style="width:269px;"
					value="<s:property value="#pro3.manageUnit"/>" /></td>
			</tr>
			<tr>
				<td><label>ʩ����λ</label></td>
				<td><input name="proInfo.constructUnit" style="width:269px;"
					value="<s:property value="#pro3.constructUnit"/>" /></td>
			</tr>
		</table>
		<table bgcolor="#D9DFAA" style="width:auto;">
			<tr>
				<td><label>��Ŀ���</label> <select name="proInfo.proBlock"
					style="width:100px;">
						<option>��·���</option>
						<option selected>Խ�����</option>
						<option>�������</option>
						<option>��ɽ���</option>
				</select></td>
				<td><label>�ش���Ŀ</label> <select name="proInfo.importantPro"
					style="width:100px;">
						<option value="1" selected>��</option>
						<option value="0">��</option>
				</select></td>
			</tr>

			<tr>
				<td><label>�ص��ע</label> <select name="proInfo.keyFocus"
					style="width:100px;">
						<option value="1" selected>��</option>
						<option value="0">��</option>
				</select></td>
				<td width="179px;"><label>��Ŀ״̬</label> <select
					name="proInfo.proStatus" style="width:100px;">
						<option>�ڽ�</option>
						<option>�ѽ�</option>
						<option>δ��</option>
						<option>��Ӫ</option>
						<option>ά��</option>
				</select></td>
			</tr>
			<tr>
				<td><label>��Ŀ���</label> <select name="proInfo.proClass"
					style="width:100px;">
						<option>����</option>
				</select></td>
				<td><label>ʡ����Ŀ</label> <select name="proInfo.provincePro"
					style="width:100px;">
						<option value="1" selected>��</option>
						<option value="0">��</option>
				</select></td>
			</tr>

		</table>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			onclick="submit();">�޸�</a>
	</s:form>
</body>
</html>
