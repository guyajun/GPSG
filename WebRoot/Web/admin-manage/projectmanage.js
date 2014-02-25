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
	$('.edit').on('click',function(){
		var tr = $(this).parent().parent();
		$('#modal-edit').find('#role-name1').val(tr.find('#aa').text());
		$('#modal-edit').find('#role-name2').val(tr.find('#bb').text());
		$('#modal-edit').find('#role-name3').val(tr.find('#cc').text());
		$('#modal-edit').find('#role-name4').val(tr.find('#dd').text());
		$('#modal-edit').find('#role-name5').val(tr.find('#ee').text());
		$('#modal-edit').find('#role-name6').val(tr.find('#dd').text());
		$('#modal-edit').find('#role-name7').val(tr.find('#ee').text());
		$('#modal-edit').find('#role-name8').val(tr.find('#ff').text());
		$('#modal-edit').find('#role-name9').val(tr.find('#gg').text());
		$('#modal-edit').find('#role-name10').val(tr.find('#hh').text());
		$('#modal-edit').find('#role-name11').val(tr.find('#ii').text());
		$('#modal-edit').find('#role-name12').val(tr.find('#jj').text());
		$('#modal-edit').find('#role-name13').val(tr.find('#kk').text());
		$('#modal-edit').find('#role-name14').val(tr.find('#ll').text());
		$('#modal-edit').find('#role-name15').val(tr.find('#mm').text());
		$('#modal-edit').find('#role-name16').val(tr.find('#nn').text());
		$('#modal-edit').find('#role-name17').val(tr.find('#oo').text());
		$('#modal-edit').find('#role-name18').val(tr.find('#pp').text());
		$('#modal-edit').find('#role-name19').val(tr.find('#qq').text());
		$('#modal-edit').find('#role-name20').val(tr.find('#rr').text());
		$('#modal-edit').find('#role-name21').val(tr.find('#ss').text());
		$('#modal-edit').find('#role-name22').val(tr.find('#tt').text());
		$('#modal-edit').find('#role-name23').val(tr.find('#uu').text());
		$('#modal-edit').find('#role-name24').val(tr.find('#vv').text());
		$('#modal-edit').find('#role-name25').val(tr.find('#ww').text());
		$('#modal-edit').find('#role-name26').val(tr.find('#xx').text());
		$('#modal-edit').find('#role-name27').val(tr.find('#yy').text());
		$('#modal-edit').find('#role-name28').val(tr.find('#zz').text());
		$('#modal-edit').find('#role-name29').val(tr.find('#aaa').text());
		$('#modal-edit').find('#role-name30').val(tr.find('#bbb').text());
		$('#modal-edit').find('#role-name31').val(tr.find('#ccc').text());
		$('#modal-edit').find('#role-name32').val(tr.find('#ddd').text());
		$('#modal-edit').find('#role-name33').val(tr.find('#eee').text());
	
		$('#modal-edit').modal('show');
	});
	// $('#date-md').on('click',function(){
	// 	$
	// });
	$('.delete').on('click',function(){
		var tr = $(this).parent().parent();
		var proName=tr.find('#bb').text();
		$('#form-hide').find('#role-name88').val(proName);
		bootbox.dialog({
			  message: "确定要删除吗？",
			  title: "注意",
			  buttons: {
			    success: {
			      label: "确定",
			      className: "btn-danger",
			      callback: function() {
			        $('#form-hide').submit();
			      }
			    },
			    danger: {
			      label: "取消",
			      className: "bootbox-close-button close btn-success"
			    }
			  }
			});
//		$('#modal-edit').find('#role-id').val(tr.find('#td-id').text());
//		$('#modal-edit').find('#role-name').val(tr.find('#td-name').text());
//		$('#modal-edit').find('#role-description').val(tr.find('#td-description').text());
//		$('#modal-edit').modal('show');
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
	$('.detail').on('click', function() {
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
		$('#x').text(tr.find('#xx').text());
		$('#y').text(tr.find('#yy').text());
		$('#z').text(tr.find('#zz').text());
		$('#3a').text(tr.find('#aaa').text());
		$('#3b').text(tr.find('#bbb').text());
		$('#3c').text(tr.find('#ccc').text());
		$('#3d').text(tr.find('#ddd').text());
		$('#3e').text(tr.find('#eee').text());
		$('#3f').text(tr.find('#fff').text());
		$('#3g').text(tr.find('#ggg').text());
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