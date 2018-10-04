package smokeTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
	
	WebDriver driver;
	boolean createAccountNumber = false;
	
	
	
	@Test
	public void presenceofelemenTest() {
	// we want to test the presence of the A tag elements
		
		List<WebElement> aTagElements = driver.findElements(By.tagName("a"));
		
		int numberOfElement = aTagElements.size();
		System.out.println("there are " + numberOfElement + " a tags on the page");
		
		for (WebElement aTagElement : aTagElements) {
			if (aTagElement.getText().equals("CREATE ACCOUNT")) {
				createAccountNumber = true;
				break;
			}
			
		}
		 Assert.assertTrue(createAccountNumber);
			
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
