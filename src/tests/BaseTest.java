package tests;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.Cart;
import pages.Header;
import pages.Product;
import testdata.OrderForm;
import testdata.URL;
import testdata.User;


public class BaseTest {
	static WebDriver driver;
	
	public static HomePage homePage;
	public static Header header;
	public static Product product;
	public static Cart cart;
	
	public static User user = new User("user");
	public static OrderForm placeOrderForm = new OrderForm("placeOrderForm");
	
	@BeforeClass
	public static void setUp() {
	}
	@AfterClass
	public static void tearDown() {
	}
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homePage = new HomePage(driver);
		header = new Header(driver);
		product = new Product(driver);
		cart = new Cart(driver);
	
		driver.navigate().to(URL.MAIN_PAGE);
		assertEquals("PRODUCT STORE", homePage.getLogo());
	}
	@After
	public void after() {
		driver.close();
	}
}
