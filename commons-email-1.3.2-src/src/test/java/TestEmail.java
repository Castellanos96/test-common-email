package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import java.nio.charset.UnsupportedCharsetException;
import java.sql.Date;
import java.util.Properties;

import javax.mail.Session;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestEmail {

	private static final String[] TEST_EMAILS = {"e@gm.com", "hg_ch@j.co", "web@bh", "abcd@efg"};
	
	private EmailConcrete email;
	
	@Before
	public void setUp() throws Exception {
		
		email = new EmailConcrete();
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	
	// testing addBcc function with TEST_EMAILS
	@Test
	public void addBcctest() throws Exception {
		
		email.addBcc(TEST_EMAILS); // add bcc emails
		int numberOfEmails = TEST_EMAILS.length;
		
		assertEquals(numberOfEmails, email.getBccAddresses().size());
	}