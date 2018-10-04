package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {



	public static WebDriver open(String browserType) {


		if(browserType.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.gecko.driver", "/Users/nehemiecreation/software-lib/chromedriver");
			return new FirefoxDriver() ;

		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/nehemiecreation/software-lib/chromedriver");
			return new ChromeDriver();


		}else {
			System.setProperty("webdriver.gecko.driverr", "/Users/nehemiecreation/software-lib/geckodriver");
			return new FirefoxDriver() ;
		}



	}

}
 