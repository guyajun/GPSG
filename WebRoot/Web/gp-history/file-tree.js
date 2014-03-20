$(function() {
//	if($('#label').text()!=""){
//		$('#label').removeClass('hide');
//		$('#upload').removeClass('hide');
//	}
	
	$.ajax({
		type : "post",
		url : "/GPSG/construct-web/fileTree.action",
		data:{localPath:$('#localPath').val()},
		dataType : "JSON",
		success : modulestree
	});

	// $('#saveBtn').on('click',function(){
	// var nodes = $('#authoritytree').tree('getChecked', 'checked');
	// var str="";
	// for(var i=0;i<nodes.length;i++){
	// str+=nodes[i].id+",";
	// }
	// $('#menuIds').val(str);
	// $('#form-authority').submit();
	// });
	function modulestree(data) {
		$('#authoritytree').tree({
			checkbox : true,
			data : data.modulesTree
		});
		loadtreedata(data);
	}

	function loadtreedata(data) {
		var rootNodes = new Array();
		rootNodes = $('#authoritytree').tree('getRoots');
		$.each(rootNodes, function(i, n) {
			$('#authoritytree').tree('check', n.target);
		});
//		$.each(data.modulesTree, function(i, n) {
//			var node = $('#authoritytree').tree('find', n);
//			$('#authoritytree').tree('check', node.target);
//		});
	}

});
