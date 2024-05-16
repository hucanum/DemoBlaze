package tests;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Purchase extends BaseTest {
	
	@Test
	public void purchase () throws InterruptedException {
		homePage.clickProduct();
		product.clickAdd();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		header.clickCart();
	}

}
