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
	function dynamic() {
		var t = document.getElementById('process');
		var s = t.value;
		if (s == 'show1') {
			show1.style.display = "";
			show2.style.display = "none";
			show3.style.display = "none";
		}
		if (s == 'show2') {
			show1.style.display = "none";
			show2.style.display = "";
			show3.style.display = "none";
		}
		if (s == 'show3') {
			show1.style.display = "none";
			show2.style.display = "none";
			show3.style.display = "";
		}
	}
</script>
<script>
function submitShow33()
{
//var date=$('#gpCranedate').datebox("getValue");
//var p=document.getElementById("file3").value;
//if(date.length==0)
//{
//alert("��������������");
//}else if(p.length==0)
//{
//alert("��ѡ���ϴ��ļ�");
//}else
//{
$('#show33').submit();
//}
}

</script>
<script>
function submitShow11()
{
var date=$('#concResistCompdate').datebox("getValue");
var p=document.getElementById("file2").value;
if(date.length==0)
{
alert("�������������");
}else if(p.length==0)
{
alert("��ѡ���ϴ��ļ�");
}else
{
$('#show11').submit();
}
}

</script>
<script>
function submitShow()
{
var date=$('#concResistLeakdate123').datebox("getValue");
var p=document.getElementById("file1").value;
if(date.length==0)
{
alert("�������������");
}else if(p.length==0)
{
alert("��ѡ���ϴ��ļ�");
}else
{
$('#show22').submit();
}
}

</script>
</head>

<body onload="dynamic()">
	<jsp:include page="../produce/produce_head.jsp"></jsp:include>
	<div class="box-left">
		<div title="��������" style="width:170px;padding:10px;overflow:hidden;">
			<ul class="easyui-tree">
				<s:action name="testMenu" executeResult="true" />
			</ul>
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
								<option value="show1" selected>��������ѹ</option>
								<option value="show2">����������</option>
								<option value="show3">�������</option>
						</select></td>

					</tr>
				</table>
			</form>
			<div id="show1" style="padding:5px;">
				<form id="show11" method="post" action="concResistComp.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>������:</td>
							<td><input id="test123" class="easyui-validatebox"
								type="text" name="concResistComp.reportId" onchange="tf()"></input>
							</td>
							<td>��������:</td>
							<td><input class="easyui-datebox" name="concResistComp.date" id="concResistCompdate" style="width:130px"></td>

						</tr>

						<tr>
							<td>��ѹǿ�Ⱥϸ��׼(Mpa):</td>
							<td>
							<input class="easyui-validatebox" type="text"
								name="concResistComp.resistCompStan" value="C60"></input>
							</td>
							
						</tr>
						<tr>
							
							<td>��ѹǿ��ʵ��ֵ(Mpa):</td>
							<td><input class="easyui-validatebox" type="text"
								name="resistCompValue1"></input>
							</td>
							<td>��ѹǿ���Ƿ�ϸ�:</td>
							<td><select name="concResistComp.resistCompIsQual"
								id="process" class="easyui-validatebox" style="width:130px;">
									<option value="true" selected>��</option>
									<option value="false">��</option>
							</select></td>
						</tr>
						<tr>
							
							<td>��ѹǿ��ʵ��ֵ(Mpa):</td>
							<td><input class="easyui-validatebox" type="text"
								name="resistCompValue2"></input>
							</td>
							<td>��ѹǿ���Ƿ�ϸ�:</td>
							<td><select name="concResistComp.resistCompIsQual"
								id="process" class="easyui-validatebox" style="width:130px;">
									<option value="true" selected>��</option>
									<option value="false">��</option>
							</select></td>
						</tr>
						<tr>
							
							<td>��ѹǿ��ʵ��ֵ(Mpa):</td>
							<td><input class="easyui-validatebox" type="text"
								name="resistCompValue3"></input>
							</td>
							<td>��ѹǿ���Ƿ�ϸ�:</td>
							<td><select name="concResistComp.resistCompIsQual"
								id="process" class="easyui-validatebox" style="width:130px;">
									<option value="true" selected>��</option>
									<option value="false">��</option>
							</select></td>
						</tr>		
					</table>
					<input type="file" name="upload" id="file2">
				</form>
				<br />
				<br />
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onClick="submitShow11();">�ϴ�������</a> <a href="javascript:void(0)" class="easyui-linkbutton" onClick="clear()">���</a>
			</div>

			<div id="show2" style="padding:5px;display:none;">
				<form id="show22" method="post" action="concResistLeak.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>������:</td>
							<td><input id="test2" class="easyui-validatebox" type="text"
								name="concResistLeak.reportId" onchange="tf1()"></input>
							</td>
							
							<td>��������:</td>
							<td><input class="easyui-datebox" name="concResistLeak.date"  id="concResistLeakdate123" style="width:130px"></td>

						</tr>
						<tr></tr>
						<tr>
							<td>�����ȼ��ϸ��׼:</td>
							<td>
							<input class="easyui-validatebox" name="concResistLeak.resistLeakStan" value="P12" style="width:130px">
							</td>
							
							<td>�����ȼ��Ƿ�ϸ�:</td>
							
							<td><select name="concResistLeak.resistLeakIsQual"
								id="process" class="easyui-validatebox" style="width:130px;">
									<option value="true" selected>��</option>
									<option value="false">��</option>
							</select></td>
						</tr>						
					</table>
					<input type="file" name="upload" id="file1">
				</form>
				<br />
				<br />
				<a  class="easyui-linkbutton" onClick="submitShow();">�ϴ�������</a> 
				<a class="easyui-linkbutton" onClick="clear()">���</a>
			</div>
			<div id="show3" style="padding:5px;display:none;">
				<form id="show33" method="post" action="gpCrane.action" enctype="multipart/form-data">
					<table>
						<tr>
							<td>�� �� �� ��(�������-ģ�� )</td>
							<td><input id="test3" name="gpCrane.reportId"
								style="width:130px;"/> (��:20130601-1)</td> 

						</tr>
						<tr>
							<td>�����¶�(��)</td>
							<td><input id="test3" name="gpCrane.envirmentTemp"
								style="width:130px;" /></td> 

						</tr>
						<tr>
							<td>����ʱ��(h)</td>
							<td><input id="test3" name="gpCrane.steamTime"
								style="width:130px;" /></td> 

						</tr>
						<tr>
							<td>���ʱ��(h)</td>
							<td><input id="test3" name="gpCrane.qidiaoTime"
								style="width:130px;" /></td> 
						</tr>
						<tr>
							<td>�Կ����ǿ��(MPa)</td>
							<td><input id="test3" name="gpCrane.craneStrength"
								style="width:130px;" /></td> 

						</tr>
				<!--  		<tr>
							<td>��������</td>
							<td><input class="easyui-datebox" name="gpCrane.produceDate" id="gpCranedate"
								style="width:130px"></td>
							
							<td>�������</td>
							<td><input class="easyui-datebox"
								name="gpCrane.craneTime" 
								style="width:130px"></td>
						</tr>
						<tr>
							<td>ǩ����</td>
							<td><input class="easyui-validatebox" type="text"
								name="gpCrane.signer"></input></td>
							
							<td>ǩ������</td>
							<td><input class="easyui-datebox"
								name="gpCrane.signTime"
								style="width:130px"></td>
						</tr>-->
					</table>
			<!--  		<input type="file" name="upload" id="file3">  -->
				</form>
				<br />
				<br />
				<a  class="easyui-linkbutton" onClick="submitShow33();">����</a>
			</div>
		</div>
	</div>
</body>
</html>
