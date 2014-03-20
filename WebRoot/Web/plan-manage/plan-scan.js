$(function() {
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
});