package tests;

import org.junit.Test;

public class Login extends BaseTest {
	
	@Test
	public void login() {
		homePage.clickLogin();
		
		header.enterUsername("Ica");
		header.enterPassword("test");
		header.clickLogin();
		
		
	}

}
