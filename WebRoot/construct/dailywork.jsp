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
<script>
	function viewmypic(mypic, imgfile) {
		if (imgfile.value) {
			mypic.src = imgfile.value;
			mypic.style.display = "";
			mypic.border = 1;
		}
	}
</script>

<script>
	function dynamic() {
		var t = document.getElementById('process');
		var s = t.value;
		if (s == 'show1') {
			show1.style.display = "";
			show2.style.display = "none";
			show3.style.display = "none";
			show4.style.display = "none";
			show5.style.display = "none";
		}
		if (s == 'show2') {
			show1.style.display = "none";
			show2.style.display = "";
			show3.style.display = "none";
			show4.style.display = "none";
			show5.style.display = "none";
		}
		if (s == 'show3') {
			show1.style.display = "none";
			show2.style.display = "none";
			show3.style.display = "";
			show4.style.display = "none";
			show5.style.display = "none";
		}
		if (s == 'show4') {
			show1.style.display = "none";
			show2.style.display = "none";
			show3.style.display = "none";
			show4.style.display = "";
			show5.style.display = "none";
		}
		if (s == 'show5') {
			show1.style.display = "none";
			show2.style.display = "none";
			show3.style.display = "none";
			show4.style.display = "none";
			show5.style.display = "";
		}
	}
</script>
</head>

<body onload="dynamic()">
	<jsp:include page="../construct/produce_head.jsp"></jsp:include>
	<div class="box-left">
		<div title="��������" style="width:170px;padding:10px;overflow:hidden;">
			<jsp:include page="../construct/leftmenu.jsp"></jsp:include>
		</div>
	</div>
	<div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="�����ϴ�" style="width:auto">
		<div style="padding:10px 0 10px 0">
			<form id="ff2" method="post">
				<table>
					<tr>
						<td>��ѡ��Ҫ�ϴ��ı���</td>
						<td><select name="pro_process" id="process"
							class="easyui-validatebox" style="width:130px;"
							onchange="dynamic();">
								<option value="show1" selected>���ʱ���</option>
								<option value="show2">�𽺼�ⱨ��</option>
								<option value="show3">�𽺼��鱨��</option>
								<option value="show4">��˨���鱨��</option>
								<option value="show5">����ʵ����鱨��</option>
						</select></td>

					</tr>
				</table>
			</form>
			<div id="show1" style="padding:5px;">
				<form id="show11" method="post" action="waterProof1.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>������:</td>
							<td><input id="test123" class="easyui-validatebox"
								type="text" name="waterProof.reportId"></input>
							</td>

						</tr>						
					</table>
					<s:file name="upload" label="�ϴ����ļ�"></s:file>
				</form>
				
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onClick="$('#show11').submit();">�ϴ�������</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					onClick="clear()">���</a>
			</div>

			<div id="show2" style="padding:5px;display:none;">
				<form id="show22" method="post" action="waterProof2.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>������:</td>
							<td><input id="test2" class="easyui-validatebox" type="text"
								name="waterProof.reportId"></input>
							</td>

						</tr>
						
					</table>
					<s:file name="upload" label="�ϴ����ļ�"></s:file>
				</form>
				
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onClick="$('#show22').submit();">�ϴ�������</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					onClick="clear()">���</a>
			</div>
			<div id="show3" style="padding:5px;display:none;">
				<form id="show33" method="post" action="waterProof3.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>�� �� �� ��</td>
							<td><input id="test3" name="waterProof.reportId"
								style="width:130px;"/></td>

						</tr>
						
					</table>
					<s:file name="upload" label="�ϴ����ļ�"></s:file>
				</form>
				
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onClick="$('#show33').submit();">�ϴ�������</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					onClick="clear()">���</a>
			</div>
			
			<div id="show4" style="padding:5px;display:none;">
				<form id="show44" method="post" action="boltQuality1.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>�� �� �� ��</td>
							<td><input id="test3" name="boltQuality.reportId"
								style="width:130px;"/></td>

						</tr>
						
					</table>
					<s:file name="upload" label="�ϴ����ļ�"></s:file>
				</form>
				
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onClick="$('#show44').submit();">�ϴ�������</a>
			</div>
		
			<div id="show5" style="padding:5px;display:none;">
				<form id="show55" method="post" action="boltQuality2.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>�� �� �� ��</td>
							<td><input id="test3" name="boltQuality.reportId"
								style="width:130px;"/></td>
						</tr>						
					</table>
					<s:file name="upload" label="�ϴ����ļ�"></s:file>
				</form>
				
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onClick="$('#show55').submit();">�ϴ�������</a>
			</div>
		
			
		</div>
	</div>
</body>
</html>
