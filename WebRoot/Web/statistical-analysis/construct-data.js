$(function() {
	var selectInput = $('#select');
	var mud = $('#div-mud');
	var facility = $('#div-facility');
	var measure = $('#div-measure');
	var advance = $('#div-advance');
	var gpPose = $('#div-gp-pose');
	var syn = $('#div-syn');
	var bigThing = $('#div-thing');

	var detailShieldAdvanceModal = $('#modal-shield-advance');
	var detailBtn = $('#btn-detail-info');

	var _startDatePicker = $('.start-date');
	var _endDatePicker = $('.end-date');
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
	detailBtn.on('click', function() {
		detailShieldAdvanceModal.modal('show');
	});
	var gpPoseModal = $('#modal-gp-pose');
	var detailGpPoseBtn = $('#btn-detail-gp-pose');
	detailGpPoseBtn.on('click', function() {
		gpPoseModal.modal('show');
	});
	selectInput.on('change', function() {
		if (selectInput.val() === 'mud') {
			mud.removeClass('hide');
			facility.addClass('hide');
			measure.addClass('hide');
			advance.addClass('hide');
			gpPose.addClass('hide');
			syn.addClass('hide');
			bigThing.addClass('hide');
		}
		if (selectInput.val() === 'facility') {
			facility.removeClass('hide');
			mud.addClass('hide');
			measure.addClass('hide');
			advance.addClass('hide');
			gpPose.addClass('hide');
			syn.addClass('hide');
			bigThing.addClass('hide');
		}
		if (selectInput.val() === 'measure') {
			measure.removeClass('hide');
			mud.addClass('hide');
			facility.addClass('hide');
			advance.addClass('hide');
			gpPose.addClass('hide');
			syn.addClass('hide');
			bigThing.addClass('hide');
		}
		if (selectInput.val() === 'advance') {
			advance.removeClass('hide');
			mud.addClass('hide');
			facility.addClass('hide');
			measure.addClass('hide');
			gpPose.addClass('hide');
			syn.addClass('hide');
			bigThing.addClass('hide');
		}
		if (selectInput.val() === 'pose') {
			gpPose.removeClass('hide');
			mud.addClass('hide');
			facility.addClass('hide');
			measure.addClass('hide');
			advance.addClass('hide');
			syn.addClass('hide');
			bigThing.addClass('hide');
		}
		if (selectInput.val() === 'syn') {
			syn.removeClass('hide');
			mud.addClass('hide');
			facility.addClass('hide');
			measure.addClass('hide');
			advance.addClass('hide');
			gpPose.addClass('hide');
			bigThing.addClass('hide');
		}
		if (selectInput.val() === 'big-thing') {
			bigThing.removeClass('hide');
			mud.addClass('hide');
			facility.addClass('hide');
			measure.addClass('hide');
			advance.addClass('hide');
			syn.addClass('hide');
			gpPose.addClass('hide');
		}
	});



})