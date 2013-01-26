package jday.entities.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import jday.entities.Member;
import jday.entities.KaraokeBookingEntities;
import jday.ui.user.KaraokeBooking;

public class KaraokeBookingEntitiesDao {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs1 = null;
	static PreparedStatement pstmt1 = null;
	


	// added in another comment
	// added in another comment to test conflict2
	public static KaraokeBookingEntities spaBooking(KaraokeBookingEntities kBooking, Member m) {
		DBController db = new DBController();
		Connection currentCon = db.getConnection();
		Statement stmt = null;
		
		// get the last member ID 
		try {
	
            // query for inserting into the table
            String query = "insert into spakaraoke(bookingno, memberid, time, date, session) values(?,?,?,?,?)";
            pstmt = currentCon.prepareStatement(query);
            // inserting values
            pstmt.setInt(1, kBooking.getBookingNo());
            pstmt.setString(2, m.getMemberid());
            pstmt.setString(3, kBooking.getTime());  
            pstmt.setString(4, kBooking.getDate());
            pstmt.setString(5, kBooking.getRooms());

            
            pstmt.executeUpdate();
            
		} catch (Exception ex) {

			System.out.println("Registration failed: An Exception has occurred! "+ ex);
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
		return kBooking;

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
	
}


