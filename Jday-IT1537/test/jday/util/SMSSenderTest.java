package jday.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SMSSenderTest {

	@Test
	public void testSendMessage() {
		EmailSender sender = new EmailSender();
		sender.sendMessage("Hello this is me");
	}

}
