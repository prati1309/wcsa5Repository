package implicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
				  
				  driver.manage().window().maximize();
				  
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				  
				  driver.get("http://www.facebook.com/");
				  
				  Thread.sleep(2000);
				  
				 driver.findElement(By.xpath("//input[@id^='password_step_input']")).sendKeys ("pratu@13");//password
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys ("pratikshakadam5219@gmail.com"); //email/phone NO
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys ("kadam");//Last name
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys ("pratiksha"); //first name
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("13"); //birthdate
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("sep"); //birth mounth
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1999"); //year
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//label[text( )='Female']")).click(); //gender
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//button[@name='websubmit']")).click(); //signUp
				 



	}

}
