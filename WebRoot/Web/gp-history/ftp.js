$(function() {
	$('.download-class').on('click',function() {
		var tr = $(this).parent().parent();
		var str=tr.find('#abc').text();
		$('#a-download').attr('href', "ftpDownloadFolder.action?downloads="+str);
//		$('#downloads').val(str);
		$('#modal-download').modal('show');
	});
	$('#unZip-btn').on('click',function(){
		var _alert=$('#alert2');
		$.ajax({
			type : 'POST',
			url : '/GPSG/construct-web/unZip.action',
			data : '',
			dataType : 'JSOn',
			success : function(data) {
				_alert.removeClass('hide')
						.html(data.message);
				setTimeout(function() {
					_alert.addClass('hide').html('');
				}, 7000);
			}
		});
	});
	$('#check-all').attr('checked', true);
	var checkBoxes = $('.check-one');
	for ( var i = 0; i < checkBoxes.length; i++) {
		checkBoxes[i].checked = true;
	}
	$('#check-all').on('click', function() {
		var checkBoxes = $('.check-one');
		if ($(this).is(':checked')) {
			for ( var i = 0; i < checkBoxes.length; i++) {
				checkBoxes[i].checked = true;
			}
		} else {
			for ( var i = 0; i < checkBoxes.length; i++) {
				checkBoxes[i].checked = false;
			}
		}
	});
	$('.check-one').on('click', function() {
		if ($(this).is(':checked')) {
			var checkBoxes = $('.check-one');
			var count = 0;
			for ( var i = 0; i < checkBoxes.length; i++) {
				if (checkBoxes[i].checked == true) {
					count++;
				}
			}
			if (count == checkBoxes.length) {
				var checkAll = $('.check-all');
				for ( var i = 0; i < checkAll.length; i++) {
					checkAll[i].checked = true;
				}
			}
		} else {
			if ($('#check-all').is(':checked')) {
				$('#check-all').attr('checked', false);
			}
		}
	});

	$('#download-btn').on('click', function() {
		$('#form-download').submit();
	});

	$('#delete-btn').on('click', function() {
		var checkBoxes = $('.check-one');
		var str = "";
		for ( var i = 0; i < checkBoxes.length; i++) {
			if (checkBoxes[i].checked == true) {
				str += checkBoxes[i].value + ",";
			}
		}
		$('#delete').val(str);
		$('#form-delete').submit();
	});
});