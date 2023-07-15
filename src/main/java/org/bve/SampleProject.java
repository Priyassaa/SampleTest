package org.bve;

import java.util.Date;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

public class SampleProject extends BaseClass {
	@Test
	public void tc1() {
		System.out.println("Test case 1");
		launchUrl("https://mail.google.com/mail/u/0/#inbox");
		String titl = pageTitle();
		System.out.println(titl);
		String purl = pageUrl();
		System.out.println(purl);
		Pojo f = new Pojo();
		passText("Inmakes@gmail.com", f.getEmail());
		Assert.assertTrue("Check the page title", titl.contains("Gmail"));
		clickbtn(f.getForgotEmail());
	}

	
	@Test
	public void tc3() {
		System.out.println("Test case 3");
		launchUrl("https://en-gb.facebook.com/");
		String title = pageTitle();
		System.out.println(title);
		String url = pageUrl();
		System.out.println( url);
		FbloginPojo fb = new FbloginPojo();
		passText("Inmakes@gmail.com", fb.getEmail());
		passText("selenium", fb.getPassword());
		Assert.assertTrue("Check the page title", title.contains("Facebook"));
		clickbtn(fb.getLogin());
	
	}

	@Test
	public void tc0() {
		System.out.println("Test case 0");

	}
@Ignore
	@Test
	public void tc10() {
		System.out.println("Test case 10");
		launchUrl("https://twitter.com/i/flow/login");
	}
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	public static void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@AfterClass
	public static void closeTheBrowser() {
		closeEntireBrowser();
	}


}
