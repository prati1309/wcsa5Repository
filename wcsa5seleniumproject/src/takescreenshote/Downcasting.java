package takescreenshote;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downcasting {
		
		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.facebook.com/");
			 
			 RemorteWebDriver

	}

}
