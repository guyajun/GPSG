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
		          {field:'rfidTid',title:'оƬ���',align:'center',width:200},
		          {field:'coverId',title:'��ͷ���',align:'center',width:100},
		          {field:'gpId',title:'��Ƭ���',align:'center',width:200},
		          {field:'status',title:'оƬ״̬',align:'center',width:100},
		          {field:'creator',title:'ɨ����',align:'center',width:100},
		          {field:'enableTime',title:'����ʱ��',align:'center',width:100}
		          ]],		          
		pagination:true,
		rownumbers:true		
	});
	$('#tt22').datagrid('getPager').pagination({
		displayMsg:'��ǰ��ʾ��{from}��{to}��{total}��¼ '
	});

}