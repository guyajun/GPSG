<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
  <title>��Ƭ����������Ϣϵͳ</title>
   <link href="css/produce.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css"/>
	<link rel="stylesheet" type="text/css" href="themes/icon.css"/>
	<link rel="stylesheet" type="text/css" href="css/demo.css"/>
	<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript">	
		function query1(){
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
 <div style="margin:0px 0;"></div>
	<div id="tt" class="easyui-panel" style="auto;height:768px; padding:0px;">
		<div class="easyui-tabs" style="width:auto;">
		<div title="оƬ�����ѯ">
		<form id="query" method="post" action="queryRFID.action">
		  <table border="0">
				<tr>
					  <td>������ר�ñ�ǩ���Ƭ��Ų�ѯ</td>
					  <td>
						   <input id="cc" class="easyui-validatebox" name="str" style="width:250px;"/>			
					  </td>
					  <td>
						   <a href="javascript:void(0)" class="easyui-linkbutton" onclick="query1();">��ѯ</a>      
					  </td>
				</tr>
		  </table>
		</form>	
	
		<div class="easyui-panel" title="��ѯ���">
	    <table id="tt" class="easyui-datagrid"  style="width:auto;height:250px">
		    <thead>
			    <tr>
				    <th data-options="field:'rfidTid',width:250" align="center">оƬ���</th>
				    <th data-options="field:'coverId',width:100" align="center">ר�ñ�ǩ</th>
				    <th data-options="field:'gpId',width:250" align="center">��Ƭ���</th>
				    <th data-options="field:'status',width:100" align="center">״̬</th>
				    <th data-options="field:'creator',width:100" align="center">ɨ����</th>
				    <th data-options="field:'enableTime',width:100" align="center">оƬ����ʱ��</th>
			    </tr>
		    </thead>
		    <s:iterator  value="#request.rfidRefGp3" id="c2">
		    <tr>
			    <td width="250px"><s:property value="#c2.rfidTid" /></td> 
			     <td><s:property value="#c2.coverId" /></td>
			      <td width="250px"><s:property value="#c2.gpId" /></td>
			       <td><s:property value="#c2.status" /></td>		 
			         <td><s:property value="#c2.creator" /></td>
			          <td><s:property value="#c2.enableTime" /></td>		        
		    </tr>
		    </s:iterator>
	    
	</table>
	</div>
	</div>
	</div>
</div>
	  
</body>
</html>
