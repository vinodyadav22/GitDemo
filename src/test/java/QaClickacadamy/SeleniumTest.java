package QaClickacadamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	WebDriver driver = null;
	
	@Test
	public void BrowserSelenium() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");

		System.out.println("BrowserSelenium");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\dell pc\\MavenJava\\Data");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		//String URL = prop.getProperty("URL");
		if(browser.contains("chrome")){
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
		}
	}
	
	@Test
	public void ElementSelenium(){
		System.out.println("ElementSelenium");
	}
	
}
