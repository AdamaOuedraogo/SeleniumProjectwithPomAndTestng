package smokeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class presenceOfCheckBoxTestNG {
	
	WebDriver driver;
	
	
	
	@Test
	public void presenceofelemenTest() {
		
		boolean loginEmailBox = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		boolean loginPaswordBox = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
		
		Assert.assertTrue(loginEmailBox);
		Assert.assertTrue(loginPaswordBox);
		
		
		
		
		
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		System.out.println("starting test");
		
		driver = utilities.DriverFactory.open("firefox");
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("closing test");
		driver.quit();
		
	}

}
