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
	<script>
	function submitForm()
	{
	var t=document.getElementById('reporttype');
	var s=t.value;
	if(s == '10001')
	{$('#ff2').submit();}
	if(s == '10002')
	{$('#ff3').submit();}
	if(s == '10003')
	{$('#ff4').submit();}
	if(s == '10005')
	{$('#ff6').submit();}
	if(s == '10006')
	{$('#ff7').submit();}
	}
	</script>
	
	<script>
		function dynamic(ff2){
		var t=document.getElementById('reporttype');
			var s=t.value;
			if(s == '10001')
			{
			ff2.style.display="";
			ff3.style.display="none";
			ff4.style.display="none";			
			ff6.style.display="none";
			ff7.style.display="none";
			} else
			if(s == '10002')
			{
			ff2.style.display="none";
			ff3.style.display="";
			ff4.style.display="none";			
			ff6.style.display="none";
			ff7.style.display="none";
			}
			if(s=='10003')
			{
			ff2.style.display="none";
			ff3.style.display="none";
			ff4.style.display="";			
			ff6.style.display="none";
			ff7.style.display="none";
			}
			if(s=='10005')
			{
			ff2.style.display="none";
			ff3.style.display="none";
			ff4.style.display="none";
			ff6.style.display="";
			ff7.style.display="none";
			}
			if(s=='10006')
			{
			ff2.style.display="none";
			ff3.style.display="none";
			ff4.style.display="none";
			ff6.style.display="none";
			ff7.style.display="";
			}
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
	<div class="easyui-panel" title="ԭ���ϱ����ѯ" style="width:auto">
		<div style="padding:10px 0 10px 10px">
	    	<table>
	    		<tr>
					<td>��������:</td>
	    			<td><select class="easyui-validatebox" name="reporttype" id="reporttype" style="width:130px;" onchange="dynamic(ff2);">
					<option value="10001">�ֽ�ԭ���ϼ�ⱨ��</option>
					<option value="10002">�ֽ�����֤����</option>
					<option value="10003">��������������֤����</option>
					<option value="10005">���������֪ͨ��</option>
    				<option value="10006">Ԥ�������֤����</option>
					</select></td>
					</tr>
			</table>
			 <form action="steelsearch.action" id="ff2" method="post" >
			<table>
			<tr>
					<td>������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="steelRaw.reportId" ></input></td>
	    	</tr>
	    	</table>
				<!--  	<td>��������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="role"></input></td>
	    		</tr>
				<tr></tr>
	    		<tr>
	    			<td>�����ϴ�����:</td>
	    			<td><input class="easyui-datebox" type="text" name="role"></input></td>
					<td>��</td>
					<td><input id="dd" class="easyui-datebox"></input></td>
	    		</tr>
	    		-->
	    	
	    </form>
	    <form action="steelquality.action" id="ff3" method="post" style="display:none">
			<table>
			<tr>
					<td>������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="steelRaw.reportId" ></input></td>
	    	</tr>
	    	</table>
	    </form>
	     <form action="concquality.action" id="ff4" method="post" style="display:none">
			<table>
			<tr>
					<td>������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="steelRaw.reportId" ></input></td>
	    	</tr>
	    	</table>
	    </form>
	    <form action="concretematch.action" id="ff6" method="post" style="display:none">
			<table>
			<tr>
					<td>������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="steelRaw.reportId" ></input></td>
	    	</tr>
	    	</table>
	    </form>
	    <form action="embedquality.action" id="ff7" method="post" style="display:none">
			<table>
			<tr>
					<td>������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="steelRaw.reportId" ></input></td>
	    	</tr>
	    	</table>
	    </form>
	    
	    
	    
		<div style="padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onClick="submitForm()">��ѯ</a>
	    </div>
	    </div>
	    </div>
</body>
</html>
