package actionclassmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("http://www.bluestone.com/");   // launch the bluestone web Application
	      
	         driver.findElement(By.id("denybtn")).click();

	}

}
