package javasciptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandeldisablewebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		  //launch blue stone
		 driver.get("file:///c:/Users/Qspider.Waked/Desktop/Disabled.html");
		 //identify webElement
		 driver.findElement(By.id("i1")).sendKeys("admin");
		 Thread.sleep(2000);
		 

	}

}