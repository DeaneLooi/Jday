package jday.entities;

import jday.entities.dao.DBController;
import java.util.ArrayList;
import java.sql.ResultSet;

public class GolfingE {
	
	private int bookingNo;
	private String memberId;
	private String time;
	private String date;
	private String greenFees;
	private double price;
	
	public int getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGreenFees() {
		return greenFees;
	}
	public void setGreenFees(String greenFees) {
		this.greenFees = greenFees;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
