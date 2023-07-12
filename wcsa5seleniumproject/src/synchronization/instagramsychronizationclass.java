package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramsychronizationclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver(); 
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.instagram.com/");
		 
		 String actualTitleofLoginPage=driver.getTitle();
		 if(actualTitleofLoginPage.equals("instagram-Login"));
		 {
			 System.out.println("Title is matched,Test Case Passed ||");
			 driver.findElement(By.name("username")).sendKeys("admin");
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 driver.findElement(By.name("loginButton")).click();
		 }
		 
		 
			 
		 {
			 System.out.println("We will get Exception||");
		 }
		 String actualTitleofHomePage =driver.getTitle();
		 if(actualTitleofHomePage.equals("instagram-Enter Time-Track"));
		 
		 {
			 System.out.println("Title is matched Test Case Passed||");
		 }	
	
	}

}
