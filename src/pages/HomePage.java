package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	//locator
	private By login = By.id("login2");
	private By logo = By.id("nava");
	private By product = By.xpath("//a[contains(text(), \"Samsung galaxy s6\")]");
	
	//action
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public String getLogo() {
		return driver.findElement(logo).getText();
	}
	public void clickProduct() {
		driver.findElement(product).click();
	}
 
}
