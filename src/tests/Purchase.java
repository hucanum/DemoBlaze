package tests;

import org.junit.Test;

public class Purchase extends BaseTest {
	
	@Test
	public void purchase () throws InterruptedException {
		homePage.clickProduct();
		product.clickAdd();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		header.clickCart();
		cart.clickPlaceOrder();
		cart.entername(placeOrderForm.getName());
		cart.entercard(placeOrderForm.getCard());
		Thread.sleep(1000);
		cart.clickPurchase();
		cart.alertDisplayed();
	}

}
