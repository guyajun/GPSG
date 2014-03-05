$(function() {
	var _button1 = $('#button1');
	var _form1 = $('#form1');
	var form1Validator = _form1.validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : "角色名称不能为空!"
			}
		}
	});
	_button1.on('click', function() {
		if (form1Validator.form()) {
			_form1.submit();
		}
	});
	
	var _button2 = $('#button2');
	var _form2 = $('#form2');
	var form2Validator = _form2.validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : "角色名称不能为空!"
			}
		}
	});
	_button2.on('click', function() {
		if (form2Validator.form()) {
			_form2.submit();
		}
	});
	
	
	var _button3 = $('#button3');
	var _form3 = $('#form3');
	var form3Validator = _form3.validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : "角色名称不能为空!"
			}
		}
	});
	_button3.on('click', function() {
		if (form3Validator.form()) {
			_form3.submit();
		}
	});
	
	
	$('.delete').on('click', function() {
		var tr = $(this).parent().parent();
		var roleName = tr.find('#td-name').text();
		$('#form-hide').find('#role-name').val(roleName);
		bootbox.dialog({
			message : "可能有若干用户属于这个角色,请确保无人属于这个角色再删除！",
			title : "注意",
			buttons : {
				success : {
					label : "确定",
					className : "btn-danger",
					callback : function() {
						$('#form-hide').submit();
					}
				},
				danger : {
					label : "取消",
					className : "bootbox-close-button close btn-success"
				}
			}
		});
	});
	$('.edit')
			.on(
					'click',
					function() {
						var tr = $(this).parent().parent();
						$('#modal-edit').find('#role-id').val(
								tr.find('#td-id').text());
						$('#modal-edit').find('#role-name').val(
								tr.find('#td-name').text());
						$('#modal-edit').find('#role-description').val(
								tr.find('#td-description').text());
						$('#modal-edit').modal('show');
					});
	$('#saveBtn').on('click', function() {
		var roleId = $('#roleId');
		var checkBoxes = $('#table-id').find('.subMenu');
		var count = 0;
		var menuIds = "";
		for ( var i = 0; i < checkBoxes.length; i++) {
			if (checkBoxes[i].checked == true) {
				menuIds += checkBoxes[i].value + ",";
			}
		}
		$('#menuIds').val(menuIds);
		$('#form-authority').submit();

	});

	// $('.assign').on('click',function(){
	// var tr = $(this).parent().parent();
	// var roleId=tr.find('#td-id');
	// $('#roleId').val(tr.find('#td-id').text());
	// // $('#modal-right').modal('show');
	// // window.location.reload();
	// });
	$('.main').on('click', function() {
		if ($(this).is(':checked')) {
			var tr = $(this).parent().parent();
			var checkBoxes = tr.find('.subMenu');
			for ( var i = 0; i < checkBoxes.length; i++) {
				checkBoxes[i].checked = true;
			}
		} else {
			var tr = $(this).parent().parent();
			var checkBoxes = tr.find('.subMenu');
			for ( var i = 0; i < checkBoxes.length; i++) {
				checkBoxes[i].checked = false;
			}
		}
	});

	$('.subMenu').on('click', function() {
		if ($(this).is(':checked')) {
			var tr = $(this).parent().parent();
			var checkBoxes = tr.find('.subMenu');
			var count = 0;
			for ( var i = 0; i < checkBoxes.length; i++) {
				if (checkBoxes[i].checked == true) {
					count++;
				}
			}
			if (count == checkBoxes.length) {
				tr.find('.main').attr('checked', true);
			}
		}
	});
});
