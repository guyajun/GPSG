$(function() {
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
})