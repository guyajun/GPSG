<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head> 
  <link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../css/demo.css">
  </head>
  
  <body>
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
  </body>
</html>
