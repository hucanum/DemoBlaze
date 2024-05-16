package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {
	WebDriver driver;
	public Product(WebDriver driver) {
		this.driver = driver;
	}
	private By addCart = By.xpath("//a[@class = 'btn btn-success btn-lg']");
	
	public void clickAdd() {
		driver.findElement(addCart).click();
	}
	

}
