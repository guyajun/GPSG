$(function(){
	$.ajax({
		type:"post",
		url:"/GPSG/admin/ShowModulesTree.action",
		dataType:"JSON",
		success:modulestree
	});	

$('#saveBtn').on('click',function(){
	var nodes = $('#authoritytree').tree('getChecked', 'checked');	
	var str="";
	for(var i=0;i<nodes.length;i++){
		str+=nodes[i].id+",";
	}
	$('#menuIds').val(str);
	$('#form-authority').submit();
});
function modulestree(data)
{
	$('#authoritytree').tree({
		checkbox:true,
		data:data.modulesTree
	});
	loadtreedata($('#roleId').val());
}

function loadtreedata(id)
{
	$.ajax({
		type:'post',
		url:'/GPSG/admin/UserAuthority.action',
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

});

