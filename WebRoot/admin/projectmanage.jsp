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
	function queryProject() {
			$('#query').submit();
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
	<div id="tt" class="easyui-panel" style="auto;height:auto; padding:0px;">
		<div class="easyui-tabs" style="width:auto;">
		<div title="��Ŀ��Ϣ">
		<form id="query" method="post" action="queryProject.action">
		  <table border="0">
				<tr>
					  <td>��������Ŀ����</td>
					  <td>
						   <input id="cc" class="easyui-validatebox" name="str" style="width:250px;"/>			
					  </td>
					  <td>
						   <a href="javascript:void(0)" class="easyui-linkbutton" onclick="queryProject();">��ѯ</a>      
					  </td>
					  <td>
						   <a href="../admin/addproject.jsp" class="easyui-linkbutton">�����Ŀ</a>      
					  </td>
				</tr>
		  </table>
		</form>	
	
		  <table  border="1" cellspacing="1" cellpadding="8" width="900">
  		<tr align="center" bgcolor="white" height="30" >
  			<th>��Ŀ����</th><th>����Ŀ����</th><th>��Ŀ����</th><th>������λ</th><th>ʩ����λ</th><th>��ϸ</th><th>����</th>		
  		</tr>
  		
  		
  		
  		
  		<s:iterator value="#request.list" id="proInfo">
  		<tr height="30">
			<td><s:property value="#proInfo.proName"/></td>
			<td><s:property value="#proInfo.proInfo.proName"/></td>
			<td><s:property value="#proInfo.directorId"/></td>
			<td><s:property value="#proInfo.produceUnit"/></td>			
			<td><s:property value="#proInfo.constructUnit"/></td>		
			<td><a target="_parent"  href="findProInfo.action?proInfo.id=<s:property value="#proInfo.id"/>">��ϸ��Ϣ(���޸�)</a> </td>	
			
			<td> <a target="_parent"  href="deleteProInfo.action?proInfo.id=<s:property value="#proInfo.id"/>" onClick="if(!confirm('ɾ������Ŀ��ɾ������������Ŀ��ȷ��ɾ����'))return false;else return true;">ɾ��</a> </td>		
		</tr>		
		</s:iterator>
		
		
		<tr>
			<s:set name="page" value="#request.page"></s:set>
  				<s:if test="#page.hasFirst">
				<s:a target="_parent" href="show_project.action?pageNow=1">��ҳ</s:a>
				</s:if>
				<s:if test="#page.hasPre">
					<a target="_parent" href="show_project.action?pageNow=<s:property value="#page.pageNow-1"/>">��һҳ</a>
				</s:if>
				<s:if test="#page.hasNext">
					<a target="_parent" href="show_project.action?pageNow=<s:property value="#page.pageNow+1"/>">��һҳ</a>
				</s:if>
				<s:if test="#page.hasLast">
					<a target="_parent" href="show_project.action?pageNow=<s:property value="#page.totalPage"/>">βҳ</a>
				</s:if>
		</tr>
		
  	</table>
</div>
</div>
</div>
</body>
</html>
