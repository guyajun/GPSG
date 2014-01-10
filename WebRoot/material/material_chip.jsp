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
	function saveScan() {
		$('#scan').submit();
	}
	function replace() {
		$('#replace').submit();
	}
	function query() {
		$('#query').submit();
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
	<div style="margin:10px 0;"></div>
	<div id="tt" class="easyui-panel"
		style="auto;height:auto; padding:0px;">
		<div class="easyui-tab" style="width:auto;">
			<div class="easyui-panel" title="оƬ�����ѯ">
				<form id="query" method="post" action="queryRFID.action">
					<table border="0">
						<tr>
							<td>������ר�ñ�ǩ���Ƭ��Ų�ѯ</td>
							<td><input id="cc" class="easyui-validatebox" name="str"
								style="width:250px;" />
							</td>
							<td><a href="javascript:void(0)" class="easyui-linkbutton"
								onclick="query();">��ѯ</a>
							</td>
						</tr>
					</table>
				</form>

				<div>
					<table border="1" cellspacing="1" cellpadding="8" width="900">
						<tr align="center" bgcolor="white" height="30">
							<th>оƬ���</th>
							<th>ר�ñ�ǩ</th>
							<th>��Ƭ���</th>
							<th>оƬ״̬</th>
							<th>������</th>
							<th>����ʱ��</th>
						</tr>


						<s:iterator value="#request.list123" id="rfid">
							<tr>
								<td><s:property value="#rfid.rfidTid" />
								</td>
								<td><s:property value="#rfid.coverId" />
								</td>
								<td><s:property value="#rfid.gpId" />
								</td>
								<td><s:property value="#rfid.status" />
								</td>
								<td><s:property value="#rfid.creator" />
								</td>
								<td><s:property value="#rfid.enableTime" />
								</td>
							</tr>
						</s:iterator>


						<tr>
							<s:set name="page" value="#request.page1"></s:set>
							<s:if test="#page.hasFirst">
								<s:a href="show_RFID.action?pageNow=1">��ҳ</s:a>
							</s:if>
							<s:if test="#page.hasPre">
								<a
									href="show_RFID.action?pageNow=<s:property value="#page.pageNow-1"/>">��һҳ</a>
							</s:if>
							<s:if test="#page.hasNext">
								<a target="_parent"
									href="show_RFID.action?pageNow=<s:property value="#page.pageNow+1"/>">��һҳ</a>
							</s:if>
							<s:if test="#page.hasLast">
								<a
									href="show_RFID.action?pageNow=<s:property value="#page.totalPage"/>">βҳ</a>
							</s:if>
						</tr>

					</table>
				</div>




			</div>
			<div>
				<table id="add" class="easyui-datagrid"
					style="width:auto;height:auto"
					data-options="singleSelect:true,idField:'id'" title="оƬ����">

				</table>

				<div style="padding:5px">
					<form action="scan.action" method="post" id="scan">
						<table>
							<tr>
								<td>��ɨ��оƬ��ţ�</td>
								<td><input name="scan_rfidTid"
									value="<s:property value="#request.saomiao"/>"
									style="width:300px;"></input> <a href="readTxt.action"
									class="easyui-linkbutton">��ʼɨ��</a></td>
							</tr>
							<tr>
								<td>������ר�ñ�ǩ��</td>
								<td><input name="scan_coverId"></input></td>
							</tr>
						</table>
					</form>
					<br /> <br /> <a href="javascript:void(0)"
						class="easyui-linkbutton" onClick="saveScan();">����</a> <a
						href="javascript:void(0)" class="easyui-linkbutton"
						onClick="clear()">���</a>
				</div>
			</div>

			<div title="оƬ�滻" class="easyui-panel"
				style="padding:10px 20px 10px 10px">

				<form id="replace" method="post" action="replace.action">
					<table>
						<tr>
							<td>��ɨ����оƬ���</td>
							<td><input name="scan_rfidTid"
								value="<s:property value="#request.saomiao1"/>"
								style="width:300px;"></input></td>
							<td><a href="readTxt1.action" class="easyui-linkbutton">��ʼɨ��</a>
							</td>

						</tr>
						<tr>
							<td>�������ר�ñ�ǩ</td>
							<td><input id="cc" class="easyui-validatebox"
								name="oldCoverId" style="width:150px;" />
							</td>
							<td>��������ר�ñ�ǩ</td>
							<td><input id="cc" class="easyui-validatebox"
								name="rfidRefGp.coverId" style="width:150px;" />
							</td>

						</tr>
						<tr>
							<td>�� ¼ ��</td>
							<td><input id="cc" class="easyui-validatebox"
								name="rfidRefGp.creator" style="width:150px;" />
							</td>
							<td>��¼ʱ��</td>
							<td><input class="easyui-datebox"
								name="rfidRefGp.createTime" style="width:150px" />
							</td>
						</tr>

					</table>
				</form>
				<div style="padding:5px">
					<a href="javascript:void(0)" class="easyui-linkbutton"
						onClick="replace()">����</a> <a href="javascript:void(0)"
						class="easyui-linkbutton" onClick="clear()">���</a>
				</div>

				<br />

			</div>
		</div>
	</div>

</body>
</html>
