package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class login_Test {
	
	private WebDriver driver;
	
	@Test
	public void Logintest() {
		driver.findElement(By.name("q")).sendKeys("abdul");
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Abdul\\chromedriver_win32\\chromedriver75.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

}
