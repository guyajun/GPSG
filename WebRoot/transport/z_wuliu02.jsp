<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
  <title>��Ƭ����������Ϣϵͳ</title>
   <link href="../css/produce.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../css/demo.css">
	<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	
	<script type="text/javascript">
	function tf() {
		var tf = document.getElementById("test123");
		var gyj = document.getElementById("hi");
		gyj.value = tf.value;
	}
</script>
<script type="text/javascript">
function submitForm()
{
$('#ff2').submit();
}
</script>
	
  </head>
  
  <body>
   <jsp:include page="../produce/produce_head.jsp"></jsp:include>
    <div class="box-left">
    <div  title="��������" style="width:170px;padding:10px;overflow:hidden;">
  <ul class="easyui-tree">
  <s:action name="testMenu" executeResult="true" />
  </ul>
  </div>
  </div>
  <div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="���չ���" style="width:auto">
		<div style="padding:10px 0 10px 10px">
	    <form id="ff2" action="gpReceive.action" method="post">
	    	<table>
	    		<tr>
	    		<td>֤����:</td>
	    			<td><input class="easyui-validatebox" id="test123" type="text" name="gpReceive.ReportId" style="width:130px;" onchange="tf()"></input></td>
					<td>���ջ���:</td>
	    			<td><input class="easyui-validatebox" type="text" name="gpReceive.ReceiveCount"style="width:130px;"></input></td>
					<td>��������:</td>
	    			<td><input class="easyui-datebox" type="text" name="gpReceive.ReceiveDate"></input></td>
					<td>�� �� �� :</td>
	    			<td><input class="easyui-validatebox" type="text" name="gpReceive.Receiver"style="width:130px;"></input></td>
	    		</tr>
			</table>
	    </form>
		<br />

		
                <s:form action="upload.action" method="post"
					enctype="multipart/form-data">
					<input id="hi" name="url" style="width:150px;" type="hidden" />
					<s:file name="upload" label="�ϴ����ļ�"></s:file>
					<s:submit value="�ϴ�"></s:submit>
				</s:form>
     

<div style="padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onClick="submitForm()">����</a>
</div>
	    </div>
		
	</div>
</body>
</html>
