package com.vaadin.demo.ma;

import com.vaadin.ui.Calendar;
import com.vaadin.ui.components.calendar.event.CalendarEventProvider;

public class HijackedCalendar extends Calendar {

	private static final long serialVersionUID = 8306460525293074378L;
	
	public HijackedCalendar() {
		initDateFormat();
	}
	
	public HijackedCalendar(CalendarEventProvider eventProvider) {
		super(eventProvider);
		initDateFormat();
	}

	private void initDateFormat() {
		setWeeklyCaptionFormat("");
	}
	
	@Override
	protected String[] getDayNamesShort() {
		return new String[] {
			"Raum 1", "Raum 2", "Raum 3", "Raum 4", "Raum 5", "Raum 6", "Raum 7"
		};
	}

}
