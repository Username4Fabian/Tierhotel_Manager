document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
        initialView: 'timeGridWeek',
        headerToolbar: {
            left: 'prev,next today',
            center: 'title',
            right: 'timeGridWeek,timeGridDay'
        },
        events: [
            {
                title: 'Zimmer 1 - Hund 1',
                start: '2023-10-01T10:00:00',
                end: '2023-10-01T12:00:00'
            },
            {
                title: 'Zimmer 2 - Hund 2',
                start: '2023-10-02T14:00:00',
                end: '2023-10-02T16:00:00'
            }
            // Weitere Events hier hinzufügen
        ]
    });

    calendar.render();
});