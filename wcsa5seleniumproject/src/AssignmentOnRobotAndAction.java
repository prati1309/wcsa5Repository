import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		  //launch blue stone
		 driver.get("https://www.bluestone.com/");
		 
		 //handle hidden division pop up
		 driver.findElement(By.id("denyBtn")).click();
		 
		 //move to watch jewelleryyyhj
		Actions act=new Actions(driver);
     	
	}

}
