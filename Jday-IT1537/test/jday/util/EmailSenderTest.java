package jday.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailSenderTest {

	@Test
	public void testSendMessage() {
		EmailSender sender = new EmailSender();
		sender.sendMessage("Hello this is me");
	}

}
