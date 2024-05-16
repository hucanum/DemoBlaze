package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
	WebDriver driver;
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	private By cart = By.id("cartur");
	private By usernameInput = By.id("loginusername");
	private By passwordInput = By.id("loginpassword");
	private By loginButton = By.xpath("//div[@id=\"logInModal\"]//button[text()=\"Log in\"]");
	private By loggedUser = By.xpath("//a[@id=\"nameofuser\"]");
	
	public void clickCart() {
		driver.findElement(cart).click();
	}
	public void enterUsername(String name){
		driver.findElement(usernameInput).sendKeys(name);
	}
	public void enterPassword(String password){
		driver.findElement(passwordInput).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	public String getLoggedUser() {
		return driver.findElement(loggedUser).getText();
	}

}
