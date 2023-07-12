package javasciptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //launch the webapplication
		 driver.get("http://www.selenium.dev/");
		 // To perform the scrolling operation
		 JavascriptExecutor jse=( JavascriptExecutor) driver;
		 Thread.sleep(2000);
		 
		 jse.executeScript("window.scrollBy(0,500"));
		 
		 

	}

}
