<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
  <title>��Ƭ����������Ϣϵͳ</title>
  </head>
  <body>
	<div class="easyui-panel" title="��������ѹǿ��������" style="width:auto">	 
	    <table id="tt" class="easyui-datagrid"  style="width:auto;height:250px">
	    <thead>
	    <tr>
	    <th data-options="field:'id',width:100" align="center">���</th>
	    <th data-options="field:'reportId',width:200" align="center">������</th>
	      <th data-options="field:'proId',width:100" align="center">���״̬</th>
	    <th data-options="field:'pdfLocation',width:300" align="center">�ļ���ַ</th>
	    </tr>
	    </thead>
	    <s:iterator  value="#request['pdfsearch']" id="c2">
	    <tr>
	    <td><s:property value="#c2.id" /></td> 
	     <td><s:property value="#c2.reportId" /></td>
	     <s:if test="#c2.proId = 1">
	     <td>�ϸ�</td>
	     </s:if>
	     <s:else>
	     <td>���ϸ�</td>
	     </s:else>
	           <td><a href="/GP/uploadfile<s:property value="pdfLocation" />" target="_blank"><s:property value="#c2.pdfLocation" /> </a></td>
	          </tr>
	    </s:iterator>
	</table>
<!-- 	<input class="easyui-linkbutton" type="button" name="Submit" onclick="javascript:history.back(-1);" value="������һҳ"> -->
	</div>
</body>
</html>
