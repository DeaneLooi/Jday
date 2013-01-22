package jday.entities;

import javax.swing.ButtonModel;

public class SpaBookingDetails {

	int day; 
	String month;
	int year;
	
	String time; 
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

	public int getYear(){
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public void setTime(ButtonModel time) {
		
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}


}
