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
function submitForm(){
		$('#ff2').submit();
		$('#ff2').form('clear');
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
	<div class="easyui-panel" title="�ƻ���ѯ" style="width:auto">
		<div style="padding:10px 0 10px 10px">
	    <form id="ff2" action="plansearch.action" method="post">
	    	<table>
	    		<tr>
	    			<td>�ƻ���ʼ���� ��:</td>
	    			<td><input id="datestart" name="datestart" class="easyui-datebox"></input></td>
					<td>��</td>
					<td><input id="dateend" name="dateend"class="easyui-datebox"></input></td>
					<td><a  class="easyui-linkbutton" onClick="submitForm()">��ѯ</a></td>
			<!--  		<td><a  class="easyui-linkbutton" onClick="">ÿ�ռƻ�</a></td> -->
	    		</tr>
	    	</table>
	    </form>
	    </div>
	    <div class="easyui-panel" title="��ѯ���">
	    <table id="tt" class="easyui-datagrid"  style="width:auto;height:250px">
	    <thead>
	    <tr>
	    <th data-options="field:'itemid',width:100" align="center">���</th>
	    <th data-options="field:'starttime',width:100" align="center">�ƻ���ʼʱ��</th>
	    <th data-options="field:'endtime',width:100" align="center">�ƻ�����ʱ��</th>
	    <th data-options="field:'startnum',width:100" align="center">��ʼ����</th>
	    <th data-options="field:'endnum',width:100" align="center">��ֹ����</th>
	    <th data-options="field:'creater',width:100" align="center">������</th>
	    <th data-options="field:'createtime',width:100" align="center">����ʱ��</th>
	     <th data-options="field:'modifier',width:100" align="center">�޸���</th>
	    <th data-options="field:'modifytime',width:100" align="center">�޸�ʱ��</th>
	    </tr>
	    </thead>
	    <s:iterator  value="#request['plansearch']" id="c2">
	    <tr>
	    <td><s:property value="#c2.id" /></td> 
	     <td><s:property value="#c2.startTime" /></td>
	      <td><s:property value="#c2.endTime" /></td>
	       <td><s:property value="#c2.startNum" /></td>
	        <td><s:property value="#c2.endNum" /></td>
	         <td><s:property value="#c2.creator" /></td>
	          <td><s:property value="#c2.createTime" /></td>
	          <td><s:property value="#c2.modifier" /></td>
	          <td><s:property value="#c2.modifyTime" /></td>
	          </tr>
	    </s:iterator>
	    
	</table>
	</div>
	</div>
</body>
</html>
