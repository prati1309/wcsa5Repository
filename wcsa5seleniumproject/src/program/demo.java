package program;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo {

	public static void main(String[] args) throws InterruptedException {
		
		// Relative path of Driver Executable file
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//Upcast into WebDriver (I
       WebDriver driver=new ChromeDriver();     //Launch Chrome Browser
         
         //maximize the browser
       driver.manage().window().maximize();
         
         //provide the dealy of 2 sec
         Thread.sleep(2000);
         
         //To close browser
         driver.close();
         
         
         
           
	}

}
