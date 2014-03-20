$(function(){
	loadrolestable();
});

function loadrolestable()
{
	$('#tt22').datagrid({
		title:'RFID',
		url:"/GP/material/show_RFID.action",
		idField:'id',
		width:1000,
		fitColumns:true,
		striped:true,
		singleSelect:true,
		pageList:[20,30,50],
		columns:[[	
		          {field:'rfidTid',title:'芯片编号',align:'center',width:200},
		          {field:'coverId',title:'扪头编号',align:'center',width:100},
		          {field:'gpId',title:'管片编号',align:'center',width:200},
		          {field:'status',title:'芯片状态',align:'center',width:100},
		          {field:'creator',title:'扫描人',align:'center',width:100},
		          {field:'enableTime',title:'启用时间',align:'center',width:100}
		          ]],		          
		pagination:true,
		rownumbers:true		
	});
	$('#tt22').datagrid('getPager').pagination({
		displayMsg:'当前显示从{from}到{to}共{total}记录 '
	});

}