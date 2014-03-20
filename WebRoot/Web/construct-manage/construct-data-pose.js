$(function() {
	var mud = $('#div-mud');
	var _startDatePicker = $('.start-date');
	var _endDatePicker = $('.end-date');
	var _detailBtn = $('.btn-detail');
	var _pageInput = $('#input-page');
	var _LoopInput = $('#input-loop');
	var _queryLoopBtn = $('#query-loop-btn');

	var _excelAll = $('#excel-all');
	var _excelPart = $('#excel-part');
	var _excelDatebtn = $('#excel-by-date');
	var _queryByDateBtn = $('#by-date');
	var _queryByLoopBtn = $('#by-loop');
	var _excelExportBtn = $('#excel-export-btn');

	
	
	var _button1 = $('#button1');
	var _form1 = $('#form1');
	var _alert1=$('#alert1');
	var form1Validator = _form1.validate({
		rules : {
			startLoop : {
				required : true,
				number : true
			},
			endLoop : {
				required : true,
				number : true
			}
		},
		messages : {
			startLoop : {
				required : "起始环号不能为空",
				number : "起始环号必须是数字"
			},
			endLoop : {
				required : "终止环号不能为空",
				number : "终止环号必须是数字"
			}
		}
	});
	function errorHandle(message) {
		_alert1.removeClass('hide').html(message);
        setTimeout(function() {
        	_alert1.addClass('hide').html('');
        }, 5000);
    }
	_button1.on('click', function() {
		if (form1Validator.form()) {
			var var1=_form1.find('#gp-high-start-loop').val();
			var var2=_form1.find('#gp-high-end-loop').val();
			if(var1<0 && var2<0){
				var1-=0;var2-=0;
			}
			if(var1 >= var2){
				errorHandle("起始环号必须小于终止环号！");
			}else{
				_form1.submit();				
			}
		}
	});

	var _button2 = $('#button2');
	var _form2 = $('#form2');
	var _alert2=_form2.find('#alert2');
	var form2Validator = _form2.validate({
		rules : {
			startLoop : {
				required : true,
				number : true
			},
			endLoop : {
				required : true,
				number : true
			}
		},
		messages : {
			startLoop : {
				required : "起始环号不能为空",
				number : "起始环号必须是数字"
			},
			endLoop : {
				required : "终止环号不能为空",
				number : "终止环号必须是数字"
			}
		}
	});
	function errorHandle2(message) {
		_alert2.removeClass('hide').html(message);
        setTimeout(function() {
        	_alert2.addClass('hide').html('');
        }, 5000);
    }
	_button2.on('click', function() {
		if (form2Validator.form()) {
			var var1=_form2.find('#gp-pan-start-loop').val();
			var var2=_form2.find('#gp-pan-end-loop').val();
			if(var1<0 && var2<0){
				var1-=0;var2-=0;
			}
			if(var1 >= var2){
				errorHandle2("起始环号必须小于终止环号！");
			}else{
				_form2.submit();				
			}
		}
	});
	
	var _exportAllBtn = $('#export-all-btn');
	var _totalForm = $('#form-total');
	var totalValidator = _totalForm.validate({
		rules : {
			excelPath : "required"
		},
		messages : {
			excelPath : "路径不能为空"
		}
	});
	_exportAllBtn.on('click', function() {
		if (totalValidator.form()) {
			_totalForm.submit();
		}
	});

	_queryForm = $('#form-query-by-loop');
	_queryLoopBtn = $('#query-loop-btn');
	var queryValidator = _queryForm.validate({
		rules : {
			tunnelLoop : {
				required : true,
				number : true
			}
		},
		messages : {
			tunnelLoop : {
				required : "环号不能为空",
				number : "环号必须是数字"
			}
		}
	});

	_queryLoopBtn.on('click', function() {
		if (queryValidator.form()) {
			_queryForm.submit();
		}
	});
	var _button3 = $('#btn-click');
	var _form3 = $('#form-four');
	var _alert3=_form3.find('#alert3');
	var form3Validator = _form3.validate({
		rules : {
			startLoop : {
				required : true,
				number : true
			},
			endLoop : {
				required : true,
				number : true
			}
		},
		messages : {
			startLoop : {
				required : "起始环号不能为空",
				number : "起始环号必须是数字"
			},
			endLoop : {
				required : "终止环号不能为空",
				number : "终止环号必须是数字"
			}
		}
	});
	function errorHandle3(message) {
		_alert3.removeClass('hide').html(message);
        setTimeout(function() {
        	_alert3.addClass('hide').html('');
        }, 5000);
    }
	_button3.on('click', function() {
		if (form3Validator.form()) {
			var var1=_form3.find('#shield-start-loop').val();
			var var2=_form3.find('#shield-end-loop').val();
			var checkBoxes = $('.check-one');
			var str = "";
			var flag=0;
			for ( var i = 0; i < checkBoxes.length; i++) {
				if (checkBoxes[i].checked == true) {
					flag++;
					str += checkBoxes[i].value + "2";
				}
			}
			if(var1<0 && var2<0){
				var1-=0;var2-=0;
			}
			if(var1 >= var2){
				errorHandle3("起始环号必须小于终止环号！");
			}else if(flag==0){
				errorHandle3("至少选中一种曲线");
			}else{
				$('#checked').val(str);
				_form3.submit();				
			}
		}
	});
	$('#query-date-btn').on('click', function() {
		$('#form-date-query').submit();
	});
	$('#query-loop-btn').on('click', function() {
		$('#form-query-by-loop').submit();
	});
	$('#btn-by-condition').on('click', function() {
		$('#form-loop-query').submit();
	});
	_queryByDateBtn.on('click', function() {
		$('#div-query-by-date').removeClass('hide');
	});
	_queryByLoopBtn.on('click', function() {
		$('#modal-mud-loop').modal('show');
	});
	_pageInput.keyup(function(e) {
		var pageNow = _pageInput.val();
		$.ajax();
		if (e.keyCode === 13) {
			$('#form-page').submit();
		}
	});
	_detailBtn.on('click', function() {
		var tr = $(this).parent().parent();
		$('#xuhao1').text(tr.find('#xuhao').text());
		$('#index1').text(tr.find('#index').text());
		$('#a').text(tr.find('#aa').text());
		$('#b').text(tr.find('#bb').text());
		$('#c').text(tr.find('#cc').text());
		$('#d').text(tr.find('#dd').text());
		$('#e').text(tr.find('#ee').text());
		$('#f').text(tr.find('#ff').text());
		$('#g').text(tr.find('#gg').text());
		$('#h').text(tr.find('#hh').text());
		$('#i').text(tr.find('#ii').text());
		$('#j').text(tr.find('#jj').text());
		$('#k').text(tr.find('#kk').text());
		$('#l').text(tr.find('#ll').text());
		$('#m').text(tr.find('#mm').text());
		$('#n').text(tr.find('#nn').text());
		$('#o').text(tr.find('#oo').text());
		$('#p').text(tr.find('#pp').text());
		$('#q').text(tr.find('#qq').text());
		$('#r').text(tr.find('#rr').text());
		$('#s').text(tr.find('#ss').text());
		$('#t').text(tr.find('#tt').text());
		$('#u').text(tr.find('#uu').text());
		$('#v').text(tr.find('#vv').text());
		$('#w').text(tr.find('#ww').text());
		$('#modal-detail').modal('show');
	});
	_startDatePicker.datetimepicker({
		pickTime : false,
		orientation : 'left',
		defaultDate : moment(),
		format : "YYYY-MM-DD",
		icons : {
			time : "fa fa-clock-o",
			date : "fa fa-calendar",
			up : "fa fa-arrow-up",
			down : "fa fa-arrow-down"
		}
	});
	_endDatePicker.datetimepicker({
		pickTime : false,
		orientation : 'left',
		defaultDate : moment(),
		format : "YYYY-MM-DD",
		icons : {
			time : "fa fa-clock-o",
			date : "fa fa-calendar",
			up : "fa fa-arrow-up",
			down : "fa fa-arrow-down"
		}
	});

});