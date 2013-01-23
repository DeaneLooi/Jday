package jday.entities;

public class KaraokeBookingEntities {
	int day; 
	String month;
	String year;
	
	int time; 
	
	String rooms;
	
	public KaraokeBookingEntities() {

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
	
	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}



}
