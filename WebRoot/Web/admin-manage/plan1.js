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
	// $('#date-md').on('click',function(){
	// $
	// });

	// $('#role-name1').blur(function(){
	// var names=$('.aaa');
	// alert(names.length);
	// for(var i=0;i<names.length;i++){
	// alert($('.aaa')[i].text);
	// if(names[i]===$(this).val()){
	// bootbox.alert("抱歉，此角色已经存在＄1�7");
	// }
	// }
	// });
	var _button1 = $('#button1');
	var _form1 = $('#form-query-by-loop1');
	var _alert1 = $('#alert1');
	var form1Validator = _form1.validate({
		rules : {
			proId : {
				required : true

			},
			startTime : {
				required : true,
		
			},
			endTime : {
				required : true

			},
			startNum : {
				required : true,
			
			},
			endNum : {
				required : true,
			

			}
		},
		messages : {
			proId : {
				required : "ID不能为空"

			},
			startTime : {
				required : "开始时间不能为空",
				
			},
			endTime : {
				required : "结束时间不能为空"

			},
			startNum : {
				required : "开始环号不能为空",
				
			},
			endNum : {
				required : "结束环号不能为空",
				
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
			_form1.submit();
		}
	});

	var _exportAllBtn = $('#export-all-btn5');
	var _totalForm = $('#form-query-by-loop3');
	var totalValidator = _totalForm.validate({
		rules : {
			startTime : "required"
		},
		messages : {
			startTime : "时间不能为空"
		}
	});
	_exportAllBtn.on('click', function() {
		if (totalValidator.form()) {
			_totalForm.submit();
		}
	});

	var _button2 = $('#button2');
	var _form2 = $('#form-query-by-loop2');
	var _alert2 = $('#alert2');
	var form2Validator = _form2.validate({
		rules : {
			proId : {
				required : true

			},
			startTime : {
				required : true,
		
			},
			endTime : {
				required : true

			},
			startNum : {
				required : true,
			
			},
			endNum : {
				required : true,
			

			}
		},
		messages : {
			proId : {
				required : "ID不能为空"

			},
			startTime : {
				required : "开始时间不能为空",
				
			},
			endTime : {
				required : "结束时间不能为空"

			},
			startNum : {
				required : "开始环号不能为空",
				
			},
			endNum : {
				required : "结束环号不能为空",
			}
		}
	});
	function errorHandle(message) {
		_alert2.removeClass('hide').html(message);
		setTimeout(function() {
			_alert2.addClass('hide').html('');
		}, 5000);
	}
	_button2.on('click', function() {
		if (form2Validator.form()) {
			_form2.submit();
		}
	});

	var _exportAllBtn = $('#export-all-btn5');
	var _totalForm = $('#form-query-by-loop3');
	var totalValidator = _totalForm.validate({
		rules : {
			fullName : "required"
		},
		messages : {
			fullName : "姓名不能为空"
		}
	});
	_exportAllBtn.on('click', function() {
		if (totalValidator.form()) {
			_totalForm.submit();
		}
	});

	$('.delete').on('click', function() {
		var tr = $(this).parent().parent();
		var proId = tr.find('#aa').text().trim();
		$('#form-hide').find('#role-name88').val(proId);
		bootbox.dialog({
			message : "确定要删除吗?",
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
		// $('#modal-edit').find('#role-id').val(tr.find('#td-id').text());
		// $('#modal-edit').find('#role-name').val(tr.find('#td-name').text());
		// $('#modal-edit').find('#role-description').val(tr.find('#td-description').text());
		// $('#modal-edit').modal('show');
	});
	$('.edit').on('click',function(){
		var tr = $(this).parent().parent();
		$('#modal-edit').find('#role-proId').val(tr.find('#aa').text().trim());
		$('#modal-edit').find('#role-startTime').val(tr.find('#bb').text().trim());
		$('#modal-edit').find('#role-endTime').val(tr.find('#cc').text().trim());
		$('#modal-edit').find('#role-startNum').val(tr.find('#dd').text().trim());
		$('#modal-edit').find('#role-endNum').val(tr.find('#ee').text().trim());
		$('#modal-edit').find('#role-coverDepth').val(tr.find('#ff').text().trim());
		$('#modal-edit').find('#role-id').val(tr.find('#td-id').text().trim());
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

$('#query-date-btn').on('click', function() {
	$('#form-date-query').submit();
});
$('#query-loop-btn').on('click', function() {
	$('#form-query-by-loop').submit();
});
$('#btn-by-condition').on('click', function() {
	$('#form-loop-query').submit();
});
// _queryByDateBtn.on('click', function() {
// $('#div-query-by-date').removeClass('hide');
// });
// _queryByLoopBtn.on('click', function() {
// $('#modal-mud-loop').modal('show');
// });
// _pageInput.keyup(function(e) {
// var pageNow = _pageInput.val();
// if (e.keyCode === 13) {
// $('#form-page').submit();
// }
// });
// _detailBtn.on('click', function() {
// var tr = $(this).parent().parent();
// $('#index1').text(tr.find('#index').text());
// $('#a').text(tr.find('#aa').text());
// $('#b').text(tr.find('#bb').text());
// $('#c').text(tr.find('#cc').text());
// $('#d').text(tr.find('#dd').text());
// $('#e').text(tr.find('#ee').text());
// $('#f').text(tr.find('#ff').text());
// $('#g').text(tr.find('#gg').text());
// $('#h').text(tr.find('#hh').text());
// $('#i').text(tr.find('#ii').text());
// $('#j').text(tr.find('#jj').text());
// $('#k').text(tr.find('#kk').text());
// $('#l').text(tr.find('#ll').text());
// $('#m').text(tr.find('#mm').text());
// $('#n').text(tr.find('#nn').text());
// $('#o').text(tr.find('#oo').text());
// $('#p').text(tr.find('#pp').text());
// $('#q').text(tr.find('#qq').text());
// $('#r').text(tr.find('#rr').text());
// $('#s').text(tr.find('#ss').text());
// $('#t').text(tr.find('#tt').text());
// $('#u').text(tr.find('#uu').text());
// $('#v').text(tr.find('#vv').text());
// $('#w').text(tr.find('#ww').text());
// $('#x').text(tr.find('#xx').text());
// $('#y').text(tr.find('#yy').text());
// $('#z').text(tr.find('#zz').text());
// $('#3a').text(tr.find('#aaa').text());
// $('#3b').text(tr.find('#bbb').text());
// $('#3c').text(tr.find('#ccc').text());
// $('#3d').text(tr.find('#ddd').text());
// $('#3e').text(tr.find('#eee').text());
// $('#modal-detail').modal('show');
// });
// _startDatePicker.datetimepicker({
// pickTime: false,
// orientation: 'left',
// defaultDate: moment(),
// format: "YYYY-MM-DD",
// icons: {
// time: "fa fa-clock-o",
// date: "fa fa-calendar",
// up: "fa fa-arrow-up",
// down: "fa fa-arrow-down"
// }
// });
// _endDatePicker.datetimepicker({
// pickTime: false,
// orientation: 'left',
// defaultDate: moment(),
// format: "YYYY-MM-DD",
// icons: {
// time: "fa fa-clock-o",
// date: "fa fa-calendar",
// up: "fa fa-arrow-up",
// down: "fa fa-arrow-down"
// }
// });

