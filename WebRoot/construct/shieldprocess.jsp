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
  </head>
  
  <body>
   <jsp:include page="../produce/produce_head.jsp"></jsp:include>
    <div class="box-left">
    <div  title="��������" style="width:170px;padding:10px;overflow:hidden;">
  <jsp:include page="../construct/leftmenu.jsp"></jsp:include>
  </div>
  </div>
  <div style="margin:0px 0;"></div>
	<div class="easyui-panel" title="�ܹ��ƽ����̼�¼��" style="width:auto">
		
	 
	    <table id="tt" class="easyui-datagrid"  style="width:auto;height:250px">
	    <thead>
	    <tr>
	    <th data-options="field:'id',width:100" align="center">���</th>
	    <th data-options="field:'proId',width:100" align="center">��Ŀ���</th>
	    <th data-options="field:'tunnelLoop',width:100" align="center">�ƽ�����</th>
	    <th data-options="field:'today',width:100" align="center">�ƽ�����</th>
	    <th data-options="field:'creator',width:100" align="center">��¼��</th>
	    <th data-options="field:'createDate',width:100" align="center">��¼����</th>
	    <th data-options="field:'url',width:100" align="center">�ļ���ַ</th>
	    </tr>
	    </thead>
	    <s:iterator  value="#request['steelsearch']" id="c2">
	    <tr>
	    <td><s:property value="#c2.id" /></td> 
	     <td><s:property value="#c2.proId" /></td>
	      <td><s:property value="#c2.tunnelLoop" /></td>
	       <td><s:property value="#c2.today" /></td>
	        <td><s:property value="#c2.creator" /></td>
	          <td><s:property value="#c2.createDate" /></td>
	          <td><a href="../<s:property value="#c2.url" />" target="_blank"><s:property value="#c2.url" /></a></td>
	          </tr>
	    </s:iterator>
	</table>
	<input class="easyui-linkbutton" type="button" name="Submit" onclick="javascript:history.back(-1);" value="������һҳ">
	</div>
</body>
</html>
