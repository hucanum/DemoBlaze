package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;
	public Cart (WebDriver driver) {
		this.driver = driver;
	}
	
	public By placeOrder = By.xpath("//button[text()=\"Place Order\"]");
	private By nameInput = By.id("name");
	private By cardInput = By.id("card");
	public By purchase = By.xpath("//button[text()=\"Purchase\"]");
	public By alert = By.xpath("//div[h2=\"Thank you for your purchase!\"]");
	public By delete = By.xpath("//tr[@class=\"success\"]/descendant::a");
	
	public void clickPlaceOrder() {
		driver.findElement(placeOrder).click();
	}
	public void entername(String name){
		driver.findElement(nameInput).sendKeys(name);
	}
	public void entercard (String card) {
		driver.findElement(cardInput).sendKeys(card);
	}
	public void clickPurchase() {
		driver.findElement(purchase).click();
	}
	public boolean alertDisplayed() {
		return driver.findElement(alert).isDisplayed();
	}
	public void clickDelete() {
		driver.findElement(delete).click();
	}
}
