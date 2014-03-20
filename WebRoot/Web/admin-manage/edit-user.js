$(function(){
	var _button1 = $('#button1');
	var _form1 = $('#form1');
	var _alert1 = $('#alert1');
	var form1Validator = _form1.validate({
		rules : {
			fullName : {
				required : true

			},
			jobNumber : {
				required : true,
				number : true
			},
			loginName : {
				required : true

			},
			email : {
				required : true,
				email : true
			},
			cellPhone : {
				required : true,
				number : true

			}
		},
		messages : {
			fullName : {
				required : "名称不能为空"

			},
			jobNumber : {
				required : "工号不能为空",
				number : "工号必须是数字"
			},
			loginName : {
				required : "登录名不能为空"

			},
			email : {
				required : "邮箱不能为空",
				email : "邮箱格式不正确"
			},
			cellPhone : {
				required : "电话不能为空",
				number : "电话必须是数字"
			}
		}
	});
	function errorHandle(message) {
		_alert1.removeClass('hide').html(message);
		setTimeout(function() {
			_alert1.addClass('hide').html('');
		}, 5000);
	};
	_button1.on('click', function() {
		if (form1Validator.form()) {
			_form1.submit();
		}
	});
});
