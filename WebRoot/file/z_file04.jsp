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
	<div class="easyui-panel" title="�����������" style="width:auto">
		<div style="padding:10px 0 10px 10px">
	    <form id="ff2" action="transportsearch.action" method="post">
	    	<table>
	    		<tr>
					<td colspan="2"> ѡ���ѯ���ͣ�<select  class="easyui-validatebox" name="reporttype" style="width:130px;">
        <option value="1001">��������֤����</option>
        <option value="1002">���ռ�¼</option>
        <option value="1003">���öѳ�</option>
        </select></td>
	   <td>������:</td>
	    			<td><input class="easyui-validatebox" type="text" name="reportId" ></input></td>
	    </tr>
		</table>
		<table>		
		<tr>
		<td>
		<div style="padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onClick="submitForm()">��ѯ</a>
	    </div>
		</td>
		</tr>
		</table>
		</form>
	    </div>
</div>
</body>
</html>