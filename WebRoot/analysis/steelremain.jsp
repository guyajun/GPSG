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
		function saveScan() {
			$('#scan').submit();
		}
		
	</script>
	<script type="text/javascript">
		function recalculate() {
		var val=document.getElementById("count").value;
		if(val.length==0)
		{
		alert("�������Ƭ������");
		}else
		{
			$('#formrecalculate').submit();
		}
		}
		
	</script>
	<script type="text/javascript">
	function queryProject() {
			$('#query').submit();
		}
	</script>
	<script type="text/javascript">
		function saveScan() {
			$('#scan').submit();
		}
		
	</script>
	<script type="text/javascript">
		function calculateGpCount() {
			$('#form-count').submit();
		}
		
	</script>
	
  </head>
  
  <body>
      <jsp:include page="../produce/produce_head.jsp"></jsp:include>
	  
      <div class="box-left">
      <div  title="��������" style="width:170px;padding:10px;">
	  <ul class="easyui-tree">
	  <s:action name="testMenu" executeResult="true" />
	  </ul>
	  </div>
	  </div>
 
 <div style="margin:10px 0;"></div>
	<div id="tt" class="easyui-panel" style="width:940px;">
		<div class="easyui-tabs" style="width:930px;">
		<div title="�ֽ�ʣ����Ϣ">		
			
		  <table  border="1" cellspacing="1" cellpadding="8" width="850px">
		  <tr align="center" height="30" >
  			<td colspan="11">�ϴμ���ֽ�����</td>	
  		</tr>
  		<tr align="center" bgcolor="white" height="30" >
  			<th>��6</th><th>��10</th><th>��12</th><th>��16</th><th>��18</th>
  			<th>��18HRB400</th><th>��20</th>	<th>��20HRB400</th>
  			<th>��22HRB400</th><th>��25HRB400</th><th>��28HRB400</th>	
  		</tr>
  		
  		<s:iterator value="#request.gpSteel" id="gpSteel">
  		<tr height="30">
			<td><s:property value="#gpSteel.s6"/></td>
			<td><s:property value="#gpSteel.s10"/></td>
			<td><s:property value="#gpSteel.s12"/></td>
			<td><s:property value="#gpSteel.s16"/></td>			
			<td><s:property value="#gpSteel.s18"/></td>		
			<td><s:property value="#gpSteel.s18hrb400"/></td>
			<td><s:property value="#gpSteel.s20"/></td>
			<td><s:property value="#gpSteel.s20hrb400"/></td>
			<td><s:property value="#gpSteel.s22hrb400"/></td>			
			<td><s:property value="#gpSteel.s25hrb400"/></td>		
			<td><s:property value="#gpSteel.s28hrb400"/></td>							
		</tr>		
		</s:iterator>
			
  	</table>
  	<br/>
  	<br/>
  	<br/>
  	
  	<form id="formrecalculate" method="post" action="recalculate.action">
		  <table border="1" width="850px">
				<tr align="center" height="30">
					  <td>��ѡ���Ѿ�����Ĺ�Ƭ���ͣ�</td>
					  <td>
						   <select id="gpType" class="easyui-combobox" name="gpType"
									style="width:150px;">
								<option value="A">A</option>
								<option value="B">B</option>
								<option value="C" selected>C</option>
								<option value="D">D</option>
								<option value="E">E</option>
								<option value="F">F</option>
						  </select>			
					  </td>
					  
					    <td>�������Ѿ�����Ĺ�Ƭ������</td>
					  <td>
						    <input id="count" class="easyui-validatebox" name="count"
								style="width:150px;" />      
					  </td>
				</tr>
				<tr align="center" height="30">							
					  <td colspan="4">
						    <a class="easyui-linkbutton" onclick="recalculate();">���¼���ʣ��ֽ���</a>    						      
					  </td>
				</tr>			
		  </table>
		</form>		
	<p style="color: red;"><s:property value="#request.mess"/></p>
</div>
</div>
</div>
<div id="tt" class="easyui-panel" style="width:940px;height:auto; padding:0px;">
		<div class="easyui-tabs" style="width:930px;">
		<div title="�ֽ�ʣ����Ϣ">		
  	<br/>
  	
  	<form id="form-count" method="post" action="calculateGpCount.action">
		  <table border="0">
				<tr>
					  <td>��ѡ��Ҫ����Ĺ�Ƭ���ͣ�</td>
					  <td>
						   <select id="gpType" class="easyui-combobox" name="gpType"
									style="width:150px;">
								<option value="A">A</option>
								<option value="B">B</option>
								<option value="C" selected>C</option>
								<option value="D">D</option>
								<option value="E">E</option>
								<option value="F">F</option>
						  </select>			
					  </td>					  			
				</tr>
				<tr>							
					  <td colspan="4">
						    <a class="easyui-linkbutton" onclick="calculateGpCount();">��������Ƭ����</a>      
					  </td>
					  <td ><p>��Ƭ����:<s:property value="#request.gpType"/> ����������:<s:property value="#request.min"/></p></td>
				</tr>			
		  </table>
		</form>		
</div>
</div>
</div>
</body>
</html>
