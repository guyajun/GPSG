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
	function query() {
		$('#form1').submit();
	}
</script>
<script type="text/javascript">
	function add() {	
	if(checkdate() && checkloop() && checkorder())
	{
		$('#form2').submit();
	}
	}
</script>
<script type="text/javascript">
	function del() {
		$('#formdel').submit();
	}
</script>
<script>
	function submitForm2() {
		$('#ff3').submit();
	}
</script>
<script>
function checkloop(){
var date2=document.getElementById("loopnum").value;
if(isNaN(date2) || date2.length==0 )
{alert("���зǷ��ַ�������ֻ��Ϊ����");
return false;
}else
{return true;}
}
</script>
<script>
function checkdate(){
var date=document.getElementById("producedate").value;
if(date.length != 8 || isNaN(date) )
{alert("�������ڳ������� �� ���зǷ��ַ�");
return false;
}else{return true;}
}
</script>
<script>
function checkorder(){
var date3=document.getElementById("order").value;
if(isNaN(date3) || date3.length == 0)
{alert("���зǷ��ַ�,���ֻ��Ϊ����");
return false;
}else{return true;}
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
	<div class="easyui-panel" title="��Ƭ״̬����" style="width:auto;">
		<form id="form1" method="post" action="queryGp.action">
			<table border="0">
				<tr>
					<td>�������Ƭ��Ų�ѯ:</td>
					<td><input id="cc" class="easyui-validatebox" name="str"
						style="width:250px;" /></td>
					<td><a href="javascript:void(0)" class="easyui-linkbutton"
						onclick="query();">��ѯ</a></td>
				</tr>
			</table>
		</form>
		<br />
		<form id="formdel" method="post" action="gpstatusdel.action">
			������ɾ����Ƭ���:<input name="gpTotalInfo.gpId" style="width:250px;" /> <a
				class="easyui-linkbutton" onclick="del();">ɾ����Ƭ</a>
		</form>
	</div>
	<div class="easyui-panel" title="��ӹ�Ƭ���" style="width:auto;">
		<form id="form2" method="post" action="addgp.action">
			<table border="0">
				<tr>
					<td>��������:</td>
					<td><input class="easyui-validatebox" id="producedate" name="producedate"
						style="width:150px;" onblur="checkdate()" /></td>

					<td>����:</td>
					<td><input class="easyui-validatebox"  id="loopnum" name="loopnum"
						style="width:150px;"  onblur="checkloop()" /></td>
					<td>���:</td>
					<td><input class="easyui-validatebox"  id="order" name="order"
						style="width:150px;"  onblur="checkorder()"/></td>
					<td><a href="javascript:void(0)" class="easyui-linkbutton"
						onclick="add();">���</a></td>
				</tr>
			</table>
		</form>
		<div style="padding:10px 0 10px 0">
			<form action="gptotal.action" id="ff3">
				<a class="easyui-linkbutton" onclick="submitForm2();">���¹�Ƭȫ��������</a>
			</form>
		</div>
	</div>
	<div style="width:auto;height:400px;">
		<s:action name="gpStatus" executeResult="true" />
	</div>
</body>
</html>
