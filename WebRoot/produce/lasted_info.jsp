<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">
<link rel="stylesheet" type="text/css" href="../css/demo.css">
</head>
<body>

	<div class="easyui-panel"
		style="width:950px;height:200px;padding:10px;" title="��Ƭ�����������">
		<table width="650px;" border="0">
			<tr>
				<td style="font-size:200%">�ۼ�������Ƭ: ${request.loop}��<br /> <br />
					�ƻ�������Ƭ:${request.planGpCount}��</td>
				<td style="font-size:200%" align="center" width="400px;">
					�ۼ�����ռ�ƻ������ٷֱȣ� <img src="../images/003.jpg" width="200" height="120" />
				</td>
			</tr>
		</table>
	</div>

	<div class="easyui-panel"
		style="width:950px;height:200px;padding:10px;" title="����ƴװ�ƽ���̬">
		<table width="650px" border="0">
			<tr>
				<td style="font-size:200%">�ܹ��ƽ���${request.tunnelLoop} �� <br />
					<br /> ƴװ�ɻ���1060 ��</td>
				<td style="font-size:200%" align="center" width="400px;">
					ʩ���ɻ�ռ�ܻ����ٷֱȣ� <img src="../images/003.jpg" width="200" height="120" />
				</td>
			</tr>
		</table>
	</div>
	<div class="easyui-panel"
		style="width:950px;height:200px;padding:10px;" title="����ƴװ�ƽ���̬">
		<table width="650px" border="0">
			<tr>
				<td style="font-size:200%">�ܹ��ƽ��� �� <br /> <br /> ƴװ�ɻ��� ��</td>
				<td style="font-size:200%" align="center" width="400px;">
					ʩ���ɻ�ռ�ܻ����ٷֱȣ� <img src="../images/003.jpg" width="200" height="120" />
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
