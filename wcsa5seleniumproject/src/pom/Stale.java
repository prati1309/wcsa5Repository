package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome/diver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
           
           driver.get(http://)
	}

}
