package jday.entities.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import jday.entities.Member;
import jday.entities.SpaBookingDetails;
import jday.ui.user.SpaBooking;

public class SpaBookingDetailsDao {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs1 = null;
	static PreparedStatement pstmt1 = null;
	


	// added in another comment
	// added in another comment to test conflict2
	public static SpaBookingDetails spaBooking(SpaBookingDetails sBooking, Member m) {
		DBController db = new DBController();
		Connection currentCon = db.getConnection();
		Statement stmt = null;
		
		// get the last member ID 
		try {
	
            // query for inserting into the table
            String query = "insert into spakaraoke(bookingno, memberid, time, date, session/roomtype) values(?,?,?,?,?)";
            pstmt = currentCon.prepareStatement(query);
            // inserting values
            pstmt.setInt(1, sBooking.getBookingNo());
            pstmt.setString(2, m.getMemberid());
            pstmt.setString(3, sBooking.getTime());  
            pstmt.setString(4, sBooking.getDate());
            pstmt.setString(5, sBooking.getSession());

            
            pstmt.executeUpdate();
            
		} catch (Exception ex) {

			System.out.println("Registration failed: An Exception has occurred! "
					+ ex);
		}

		// exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return sBooking;

	}
	
/*	public static ArrayList<SpaBookingDetails> retrieveAll() {
		SpaBookingDetails spaBookings = null;
		Statement stmt = null;
        String searchQuery = "select * from member";
        ArrayList<SpaBookingDetails> spaBookingDetailsList = new ArrayList<SpaBookingDetails>();
        try {
            // connect to DB
            currentCon = DBController.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            while (rs.next()) {
            
                String memberId = rs.getString("member_id");
                String memberName = rs.getString("name");
                String memberTel = rs.getString("tel");
                String username = rs.getString("username");
                String password = rs.getString("password");
                spaBookings = new SpaBookingDetails();
                spaBookings.setMemberId(memberId);
                spaBookings.setTime(memberName);
                spaBookings.setTel(memberTel);
                spaBookings.setUsername(username);
                spaBookings.setPassword(password);
                spaBookingDetailsList.add(spaBookings);
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }

		return  spaBookingDetailsList;
	}
	*/
	
	public static void main (String [] args){
		SpaBookingDetails s = new SpaBookingDetails();
		s.setBookingNo(18731);
		s.setDate("12.12.12");
		s.setSession("JDAY");
		s.setTime("12");
		Member m = new Member("123123A");
		SpaBookingDetailsDao.spaBooking(s, m);
		
	}
}


