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
			excelPath : "required",
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
			excelPath : "路径不能为空",
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
			if($('#gp-high-start-loop').val()>=$('#gp-high-start-loop').val()){
				errorHandle("起始环号必须小于终止环号！");
			}else{
				_form1.submit();				
			}
		}
	});
	
	
	
	$('#query-date-btn').on('click',function(){
		$('#form-date-query').submit();
	});
	$('#query-loop-btn').on('click',function(){
		$('#form-query-by-loop').submit();
	});
	$('#btn-by-condition').on('click',function(){
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
		if (e.keyCode === 13) {
			$('#form-page').submit();
		}
	});
	_detailBtn.on('click', function() {
		var tr = $(this).parent().parent();
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
		$('#x').text(tr.find('#xx').text());
		$('#y').text(tr.find('#yy').text());
		$('#z').text(tr.find('#zz').text());
		$('#3a').text(tr.find('#aaa').text());
		$('#3b').text(tr.find('#bbb').text());
		$('#3c').text(tr.find('#ccc').text());
		$('#3d').text(tr.find('#ddd').text());
		$('#3e').text(tr.find('#eee').text());
		$('#3f').text(tr.find('#fff').text());
		$('#modal-detail').modal('show');
	});
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
	_endDatePicker.datetimepicker({
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