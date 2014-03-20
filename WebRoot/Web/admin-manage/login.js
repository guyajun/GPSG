$(function() {
	 $('#input-pass').on('keyup', function(e) {
	        if (e.keyCode === 13) {
	    		if (form1Validator.form()) {
	    			var loginName = _form1.find('#input-name').val();
	    			var password = _form1.find('#input-pass').val();
	    			$.ajax({
	    				type : "post",
	    				url : "/GPSG/login.action",
	    				data : {
	    					loginName : loginName,
	    					password : password
	    				},
	    				dataType : 'JSON',
	    				success : function(data) {
	    					if(data.message==="ok"){
	    						window.location.href="/GPSG/Web/index.jsp";						
	    					}else{
	    						errorHandle(data.message);					
	    					}
	    				},
	    				error:function(err){
	    					alert("error="+err);
	    				}
	    			});
	    		}
	        }
	    });
	var _button1 = $('#button1');
	var _form1 = $('#form1');
	var _alert1 = _form1.find('#alert1');
	var form1Validator = _form1.validate({
		rules : {
			loginName : {
				required : true
			},
			password : {
				required : true
			}
		},
		messages : {
			loginName : {
				required : "登录名不能为空!"
			},
			password : {
				required : "密码不能为空!"
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
			var loginName = _form1.find('#input-name').val();
			var password = _form1.find('#input-pass').val();
			$.ajax({
				type : "post",
				url : "/GPSG/login.action",
				data : {
					loginName : loginName,
					password : password
				},
				dataType : 'JSON',
				success : function(data) {
					if(data.message==="ok"){
						window.location.href="/GPSG/Web/index.jsp";						
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
