$(function() {
	var _button1 = $('#aaa');
	var _form1 = $('#form-aaa');
	var _alert1=$('#alert1');
	var form1Validator = _form1.validate({
		rules : {
			number : {
				required : true
			}
		},
		messages : {
			number : {
				required : "测点号不能为空"
			}
		}
	});
	_button1.on('click', function() {
		if (form1Validator.form()) {
				_form1.submit();	
		}
	});
	$('#curve-btn').on('click',function(){
		$('#form-curve').submit();
	});
	var _startDatePicker = $('.div-start');
	_startDatePicker.datetimepicker({
		pickTime: false,
		orientation: 'left',
		defaultDate: moment(),
		format: "YYYY-MM-DD",
		icons: {
			time: "fa fa-clock-o",
			date: "fa fa-calendar",
			up: "fa fa-arrow-up",
			down: "fa fa-arrow-down"
		}
	});
	var _startDatePicker = $('.div-end');
	_startDatePicker.datetimepicker({
		pickTime: false,
		orientation: 'left',
		defaultDate: moment(),
		format: "YYYY-MM-DD",
		icons: {
			time: "fa fa-clock-o",
			date: "fa fa-calendar",
			up: "fa fa-arrow-up",
			down: "fa fa-arrow-down"
		}
	});
});