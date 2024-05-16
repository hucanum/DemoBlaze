package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void login() {
		homePage.clickLogin();
		
		header.enterUsername(user.getUsername());
		header.enterPassword(user.getPassword());
		header.clickLogin();
		//assertEquals(user.getUsername(), header.getLoggedUser());
		
	}

}
;