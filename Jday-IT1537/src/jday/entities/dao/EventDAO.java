package jday.entities.dao;

import java.util.Date;

import jday.entities.Event;

public class EventDAO {

	public static Event getEventByDate(Date date) {
		// do the coding to connect to actual db;
		
		
		Event event = new Event();
		event.setInfo("This is an info test. You may or may not discard this information. It's up to you. Decide.");
		event.setTitle("Info test 01");
		event.setVenue("Some venue in the club");
		String date2 = date.toGMTString();
		date2 = date2.substring(0, 11);
		event.setDate(date2);
		return event;
	}
}
