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
        var begin=document.getElementById('datestart');
        var end=document.getElementById('dateend');
        if(begin != null && end != null)
        {
		$('#ff2').submit();
		$('#ff2').form('clear');
		}
		else
		{
		alert('����������');
		}
		}
</script>
	<script type="text/javascript">
var frameheight;
var ALL;
$(function(){
	loadUserTable();
});
	function loadUserTable()
	{
		var lastIndex;
		$('#tt').datagrid({
			url:"/GP/admin/planDataGrid.action",
			idField:'id',
			fitColumns:true,
			striped:true,
			singleSelect:true,
			
			pageList:[20,30,50],
			columns:[[
			  {field:'id',title:'���',width:80,align:'center'},
                   {field:'starttime',title:'�ƻ���ʼʱ��',width:80,align:'center'},     
                   {field:'endtime',title:'�ƻ�����ʱ��',width:80,align:'center'},   
                   {field:'startnum',title:'��ʼ����',width:80,align:'center'},   
                   {field:'endnum',title:'��ֹ����',width:80,align:'center'},
                  // {field:'total',title:'�ܻ���',width:80,align:'center'},
                   {field:'creater',title:'������',width:80,align:'center'}, 
                   {field:'createtime',title:'����ʱ��',width:80,align:'center'},  
                   {field:'modifier',title:'�޸���',width:80,align:'center'}, 
                   {field:'modifytime',title:'�޸�ʱ��',width:80,align:'center'}
			          ]],
		    pagination:true,
			rownumbers:true,
		});
		$('#tt').datagrid('getPager').pagination({
			displayMsg:'��ǰ��ʾ��{from}��{to}��{total}��¼ '
		});
	}
	var flag = false;
	function getselect()
	{
	document.getElementById('dd3').style.display="";
	}
	function usersrefresh()
	{
		$('#tt').datagrid({
			url:"/GP/admin/planDataGrid.action"
		});
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
	<div class="easyui-panel" title="�ƻ���ѯ" style="width:auto">
		<div style="padding:10px 0 10px 10px">
	    <form action="plansearch.action" id="ff2" method="post">
	    	<table>
	    		<tr>
	    			<td>�ƻ���ʼ���� ��:</td>
	    			<td><input id="datestart" name="datestart" class="easyui-datebox" ></input></td>
					<td>��</td>
					<td><input id="dateend" name="dateend"class="easyui-datebox" ></input></td>
					<td><a  class="easyui-linkbutton" onClick="submitForm()">��ѯ</a></td>
				<!--  	<td><a  class="easyui-linkbutton">ÿ�ռƻ�</a></td> -->
	    		</tr>
	    	</table>
	    </form>
	    </div><table id="tt" class="easyui-datagrid" title="��ѯ���" style="width:auto;height:550px">
	</table>
	</div>
</body>
</html>
