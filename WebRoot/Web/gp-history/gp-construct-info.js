$(function(){
	var _button1 = $('#queryButton');
	var _form1 = $('#form-query');
	var _alert1 = _form1.find('#alert1');
	var form1Validator = _form1.validate({
		rules : {
			tunnelLoop : {
				required : true,
				number:true
			}
		},
		messages : {
			tunnelLoop : {
				required : "成环环号不能为空",
				number:"成环环号必须是数字"
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
			var tunnelLoop = _form1.find('#input-loop').val();
			$.ajax({
				type : "post",
				url : "/GPSG/construct-web/getByLoopTotal.action",
				data : {
					tunnelLoop : tunnelLoop
				},
				dataType : 'JSON',
				success : function(data) {
					if(data.message==="one"){
						window.location.href="/GPSG/Web/gp-history/gp-construct-query.jsp";						
					}else{
						errorHandle(data.message);					
					}
				},
				error:function(err){
					alert("error="+err);
				}
			});
		}
	});
});