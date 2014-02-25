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
	// 	$
	// });
	
//		$('#role-name1').blur(function(){
//			var names=$('.aaa');
//			alert(names.length);
//			for(var i=0;i<names.length;i++){
//				alert($('.aaa')[i].text);
//				if(names[i]===$(this).val()){
//					bootbox.alert("抱歉，此角色已经存在＄1�7");
//				}
//			}
//		});
		$('.delete').on('click',function(){
			var tr = $(this).parent().parent();
			var fullName=tr.find('#td-fullName').text();
			$('#form-hide').find('#role-name88').val(fullName);
			bootbox.dialog({
				  message: "确定要删除吗?",
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
//			$('#modal-edit').find('#role-id').val(tr.find('#td-id').text());
//			$('#modal-edit').find('#role-name').val(tr.find('#td-name').text());
//			$('#modal-edit').find('#role-description').val(tr.find('#td-description').text());
//			$('#modal-edit').modal('show');
		});
		$('.edit').on('click',function(){
			$.ajax({
				type:"post",
				url:"/GPSG/admin/getAllRole.action",
				data:'',
				dataType:'JSON',
				success:function(data)
				{
					alert(data.map);
				}
			});
			var tr = $(this).parent().parent();
			$('#modal-edit').find('#role-name1').val(tr.find('#td-fullName').text());
			$('#modal-edit').find('#role-jobNumber').val(tr.find('#td-jobNumber').text());
			$('#modal-edit').find('#role-Phone').val(tr.find('#ff').text());
			$('#modal-edit').find('#role-email').val(tr.find('#gg').text());
			$('#modal-edit').modal('show');
		});
		$('#saveBtn').on('click',function(){
			var roleId=$('#roleId');
			var checkBoxes= $('#table-id').find('.subMenu');
			var count=0;
			var menuIds="";
			for(var i=0;i<checkBoxes.length;i++){
				if(checkBoxes[i].checked==true){
					menuIds+=checkBoxes[i].value+",";
				}				
			}	
			$('#menuIds').val(menuIds);	
			$('#form-authority').submit();
			
		});
		
//	    $('.assign').on('click',function(){    	
//	    	var tr = $(this).parent().parent();
//			var roleId=tr.find('#td-id');
//			$('#roleId').val(tr.find('#td-id').text());
////	    	$('#modal-right').modal('show');
////	    	window.location.reload();
//	    });
	   $('.main').on('click',function(){
		   if($(this).is(':checked')){
			   var tr = $(this).parent().parent();
				var checkBoxes=tr.find('.subMenu');
				for(var i=0;i<checkBoxes.length;i++){
					checkBoxes[i].checked = true;
				}
		   }
		   else{
			   var tr = $(this).parent().parent();
				var checkBoxes=tr.find('.subMenu');
				for(var i=0;i<checkBoxes.length;i++){
					checkBoxes[i].checked = false;
				}
		   }   	
	   });	
	   
	   
	   $('.subMenu').on('click',function(){
		   if($(this).is(':checked')){
			   var tr = $(this).parent().parent();
				var checkBoxes=tr.find('.subMenu');
				var count=0;
				for(var i=0;i<checkBoxes.length;i++){
					if(checkBoxes[i].checked==true){
						count++;
					}				
				}
				if(count==checkBoxes.length){
					tr.find('.main').attr('checked',true);
				}
		   }
	   });	
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

