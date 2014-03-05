$(function() {
	$('.dd').on('click', function() {
		var tr = $(this).parent().parent();
		$('#downloads').val(tr.find('#aa').text());
		$('#modal-download').modal('show');
	});
});