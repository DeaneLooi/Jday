package jday.entities;

import javax.swing.ButtonModel;

public class SpaBookingDetails {

	int day; 
	String month;
	String year;
	
	int time; 
	
	String session;
	
	
	
	public SpaBookingDetails() {
		
	}
	
	public int getDay(){
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	
    public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear(){
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}


}
