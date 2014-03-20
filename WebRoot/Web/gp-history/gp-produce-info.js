$(function() {
	var _button11 = $('#button11');
	var _form11 = $('#form11');
	var _alert11 = $('#alert11');
	function errorHandle11(message) {
		_alert11.removeClass('hide').html(message);
		setTimeout(function() {
			_alert11.addClass('hide').html('');
		}, 5000);
	}
	_button11.on('click', function() {
		var startDate = moment(_form11.find('#input-start-date').val());
		var endDate = moment(_form11.find('#input-end-date').val());
		if (endDate.diff(startDate) < 0) {
			errorHandle11("开始时间必须早于或者等于结束时间！");
		} else {
			_form11.submit();
		}
	});
	var _zipBtn = $('#zip-btn');
	var _alertZip = $('#alert-zip');
	_zipBtn.on('click', function() {
		bootbox.dialog({
			message : "压缩大文件需要3~4分钟时间，请耐心等待！待出现提示信息“压缩完成”后再上传，谢谢！",
			title : "注意",
			buttons : {
				success : {
					label : "确定",
					className : "btn-danger",
					callback : function() {
						$.ajax({
							type : 'POST',
							url : '/GPSG/construct-web/ftpZip.action',
							data : '',
							dataType : 'JSOn',
							success : function(data) {
								_alertZip.removeClass('hide')
										.html(data.message);
								setTimeout(function() {
									_alertZip.addClass('hide').html('');
								}, 1000 * 30);
							}
						});
					}
				},
				danger : {
					label : "取消",
					className : "bootbox-close-button close btn-success"
				}
			}
		});
	});
	var _button2 = $('#button2');
	var _form2 = $('#form2');
	var _alert2 = $('#alert2');
	function errorHandle(message) {
		_alert2.removeClass('hide').html(message);
		setTimeout(function() {
			_alert2.addClass('hide').html('');
		}, 5000);
	}
	_button2.on('click', function() {
		var startDate = moment(_form2.find('#input-start-date').val());
		var endDate = moment(_form2.find('#input-end-date').val());
		if (endDate.diff(startDate) < 0) {
			errorHandle("开始时间必须早于结束时间！");
		} else {
			_form2.submit();
		}
	});

	$('#upload-btn').on('click', function() {
		$('#form-upload').submit();
	});
	var _button1 = $('#queryLoopButton');
	var _form1 = $('#form-loop');
	var form1Validator = _form1.validate({
		rules : {
			loop : {
				required : true,
				number : true
			}
		},
		messages : {
			loop : {
				required : "环号不能为空",
				number : "环号必须是数字"
			}
		}
	});
	_button1.on('click', function() {
		if (form1Validator.form()) {
			_form1.submit();
		}
	});
	var _startDatePicker = $('.start-date');
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
	var _endDatePicker = $('.end-date');
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
	$('#input-page').keyup(function(e) {
		if (e.keyCode === 13) {
			$('#form-page').submit();
		}
	});

	$('.btn-detail').on(
			'click',
			function() {
				var path = "";
				var tr = $(this).parent().parent();
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
				$('#r').text(tr.find('#rr').text().trim());
				$('#s').text(tr.find('#ss').text().trim());
				$('#t').text(tr.find('#tt').text().trim());
				$('#u').text(tr.find('#uu').text().trim());
				$('#v').text(tr.find('#vv').text().trim());
				$('#w').text(tr.find('#ww').text().trim());
				$('#x').text(tr.find('#xx').text().trim());
				$('#y').text(tr.find('#yy').text().trim());
				$('#z').text(tr.find('#zz').text().trim());
				path = tr.find('#rr').text().trim();
				$('#r').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				path = tr.find('#ss').text().trim();
				$('#s').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#tt').text().trim();
				$('#t').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#uu').text().trim();
				$('#u').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#vv').text().trim();
				$('#v').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#ww').text().trim();
				$('#w').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#xx').text().trim();
				$('#x').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#yy').text().trim();
				$('#y').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				var path = tr.find('#zz').text().trim();
				$('#z').attr(
						'href',
						"/GPSG/Web/gp-history/image-produce.jsp?folder="
								+ path.split('/')[0] + "&fileName="
								+ path.split('/')[1]);

				$('#3a').text(tr.find('#aaa').text());
				$('#3b').text(tr.find('#bbb').text());
				$('#3c').text(tr.find('#ccc').text());
				$('#3d').text(tr.find('#ddd').text());
				$('#3e').text(tr.find('#eee').text());
				$('#modal-detail').modal('show');
			});

})