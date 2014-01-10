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
	function save() {
		$('#ff2').submit();
	}
	function saves()
	{
	$('#ff3').submit();
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
			title:"�ƻ���Ϣ",
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
			toolbar:[{
				text:'�༭',
				iconCls:'icon-edit',
				handler: getselect
			},'-',{
				text:'ɾ��',
				iconCls:'icon-remove',
				handler:function(){
					var user = $('#tt').datagrid('getSelected');
					if(user.id=="")
					{
						$('#tt').datagrid('deleteRow',0);
						}
					else
					{
						$.messager.confirm('ɾ��','ȷ��ɾ��   '+user.id+'  ��',function(c){
						if(c){
						$.ajax({
							type:'post',
							url:'/GP/plan/delplan.action',
							data:{id:user.id},
							dataType:'text',
							success: function(data){
								var selectedrowid = $('#tt').datagrid('getSelected');
								$('#tt').datagrid('deleteRow',$('#tt').datagrid('getRowIndex',selectedrowid));
								$.messager.alert('ȷ��','ɾ���ɹ�!');
								$('#tt').datagrid('acceptChanges');
								$('#tt').datagrid('selectRow',0);
								usersrefresh();
							}
						});
						}
					});
					}
				}	
			},'-',{
				text:'ˢ��',
				iconCls:'icon-reload',
				handler:function(){
					usersrefresh();
				}
			}
			],
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
<script>
function cleardata(){
			$('#ff2').form('clear');
			$('#dd2').div('clear');
		}
		function submitForm(){
		var s1=document.getElementById("ss1").value;
		
		var s2=document.getElementById("ss2").value;
		if(s2>s1)
		{
		$('#ff2').submit();
		$('#ff2').form('clear');
		}
		else
		{alert("��ֹ���ű��������ʼ����");}
		}
</script>
</head>
  <body>
   <jsp:include page="../produce/produce_head.jsp"></jsp:include>
	<div class="box-left">
		<div title="��������" style="width:170px;padding:10px;overflow:hidden;">
			<ul class="easyui-tree">
				<s:action name="testMenu" executeResult="true" />
			</ul>
		</div>
	</div>
  <div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="�ƻ�����" style="width:auto">
		<div  id="dd2" style="padding:10px 0 10px 10px">
	    <form action="addplan.action" id="ff2" method="post">
	    	<table>
	    		<tr>
	    			<td>��ʼʱ��:</td>
	    			<td><select class="easyui-datebox"  name="plan.startTime" style="width:130px;"></select></td>
					<td>����ʱ��:</td>
	    			<td><select class="easyui-datebox"  name="plan.endTime" style="width:130px;"></select></td>
					<td>��ʼ����:</td>
	    			<td><input id="ss1" class="easyui-validatebox" type="text" name="plan.startNum"style="width:130px;"></td>
					<td>��ֹ����:</td>
	    			<td><input id="ss2" class="easyui-validatebox" type="text" name="plan.endNum"style="width:130px;"></td>
	    		</tr>
	    	</table>
	    </form>
	    <br />
		<div style="padding:5px">
	    	<a  class="easyui-linkbutton" onClick="submitForm()">�����ƻ�</a>
			<a  class="easyui-linkbutton" onClick="cleardata()">���</a>
		<!--  	<a  class="easyui-linkbutton" onClick="getValue2()">ÿ�ռƻ�</a> -->
	    </div>
	    </div>
	</div>
	
	<div class="easyui-panel" id="dd3" style="width:auto; display:none;">
		<form action="editplan.action" id="ff3" method="post">
				<table>
					<tr>
						<td>������Ҫ�༭���� ��:</td>
						<td><input type="text" name="plan.id"></input></td>
						<td><a class="easyui-linkbutton" onclick="saves();">�༭</a></td>
					</tr>
				</table>
			</form>

	</div>	
	
	<table id="tt"  title="�ƻ��༭" style="width:auto;height:500px">
	</table>
</body>
</html>
