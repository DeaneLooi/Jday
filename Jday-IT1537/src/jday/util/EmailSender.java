package jday.util;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.PasswordAuthentication;


public class EmailSender {
	
	public static void main(String[] args){
		
		//testing to yuwen account.
		String JdayTo ="yuwen_di@yahoo.com.sg";
		String JdayFrom = "d.yuwen.yw@gmail.com";
		String subject ="JDay Booking Number";
		
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "ture");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.debug", "true");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator()
				{protected javax.mail.PasswordAuthentication
					getPassswordAuthentication()
				{return new javax.mail.PasswordAuthentication("d.yuwen.yw@gmail.com", "password");
		}}
		);
		
		try {
            // Instantiate a message
            Message msg = new MimeMessage(session);
 
            //Set message attributes
            msg.setFrom(new InternetAddress(JdayFrom));
            InternetAddress[] address = {new InternetAddress(JdayTo)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
 
            // Set message content
            msg.setText("Dear member, your booking number is 123456");
 
            //Send the message
            Transport.send(msg);
        }
        catch (MessagingException mex) {
            // Prints all nested (chained) exceptions as well
            mex.printStackTrace();
        }
	} 

}
