$(function(){
	$.ajax({
		type:"post",
		url:"/GP/admin/ShowModulesTree.action",
		dataType:"JSON",
		success:modulestree
			});
	
	loadrolestable();
});

var xxx1;
function modulestree(data)
{

	$('#authoritytree').tree({
		checkbox:true,
		data:data.modulesTree,
		onCheck:function(node,checked)
		{
			xxx1 = $('#xxx1').val();
			var treeposition = $('#authoritytree').position().left;
			var selectedRoleId = $('#selectedRoleId').val();
			if(xxx1<treeposition){}
			else
				{
					$.ajax({
						type:'post',
						url:'EditAurhotiry.action',
						data:"roleId="+selectedRoleId+"&checked="+checked+"&nodeId="+node.id,
						dataType:'text',
						success:function(data){}
					});
				}
		}
	});
}

function loadrolestable()
{
	var lastIndex;
	$('#roles').datagrid({
		title:'Role',
		url:"/GP/admin/ShowRoleDataGrid.action",
		idField:'id',
		width:700,
		height:500,
		fitColumns:true,
		striped:true,
		singleSelect:true,
		columns:[[	
		          {field:'id',title:'角色号',align:'center',width:100},
		          {field:'roleName',
		           title:'角色名',
		           align:'center',
		           editor:{
		        	  		type:'validatebox',
		        	  		options:{
		        	  		required:true,
		        	  		missingMessage:'请填写'
		        	  				}
		          		   },
		          width:100},
		          {field:'roleDescription',title:'角色描述',align:'center',width:100}
		          ]],		          
		pagination:true,
		rownumbers:true,
		toolbar:
			[{
				text:'添加',
				iconCls:'icon-add',
				handler:function()
				{
					var t=document.getElementById('ff2');
					t.style.display="";
				}				
			},'-',{				
				text:'删除',
				iconCls:'icon-remove',
				handler:function(){
					var role = $('#roles').datagrid('getSelected');
					if(role.id=="")
						$('#roles').datagrid('deleteRow',0);
					else{
					$.messager.confirm('删除','此操作会影响到相关用户权限，确认删除吗？',function(c){
						if(c)
						{
							$.ajax({
								type:'post',
								url:'deleteRole.action',
								data:{id:role.id},
								dataType:'text',
								success: function(data){
									var selectedrowid = $('#roles').datagrid('getSelected');
									var data1=$.trim(data);
									if(data1=='删除成功')
									{
										$('#roles').datagrid('deleteRow',$('#roles').datagrid('getRowIndex',selectedrowid));
										$('#roles').datagrid('selectRow',0);
									}
									$.messager.alert('确认',data);
								}
							});
						}
					});
					}
					
				}	
			},'-',{
				text:'刷新',
				iconCls:'icon-reload',
				handler:function(){
					rolesrefresh();
				}
			}],
			onBeforeEdit:function(rowIndex,rowData)
			{
			},
			onLoadSuccess:function(data)
			{
				$('#roles').datagrid('selectRow',0);
				if(data.rows.length>0)
					loadtreedata(data.rows[0].id);
			},
			onAfterEdit:function(rowIndex,rowData,changes)
			{
				if(rowData.id=="")
				{
					$.ajax({
						type:"post",
						url:"/GP/admin/AddRole.action",
						data:"name="+rowData.name,
						dataType:"text",
						success:function(data){
							$.messager.alert('确认',data);
							$('#roles').datagrid({
								url:"/GP/admin/ShowRoleDataGrid.action"
							});
							
						}
					});
				}
			},
			onClickRow:function(rowIndex, rowData)
			{
				loadtreedata(rowData.id);				
			}
			
	});
	$('#roles').datagrid('getPager').pagination({
		displayMsg:'当前显示从{from}到{to}共{total}记录 '
	});
}
function loadtreedata(id)
{
	$('#selectedRoleId').val(id);
	xxx1 = $('#xxx1').val();
	
	$.ajax({
		type:'post',
		url:'/GP/admin/UserAuthority.action',
		data:"roleId="+id,
		dataType:'JSON',
		success:function(data)
		{
			var rootNodes = new Array();
			rootNodes = $('#authoritytree').tree('getRoots');
			$.each(rootNodes,function(i,n){
				$('#authoritytree').tree('uncheck',n.target);
			});
			$.each(data.roleModuleIds,function(i,n){
			var node = $('#authoritytree').tree('find',n);
			$('#authoritytree').tree('check',node.target);
			});
		}
	});
}

function rolesrefresh()
{	
	$('#roles').datagrid({
		url:"/GP/admin/ShowRoleDataGrid.action"
	});
}