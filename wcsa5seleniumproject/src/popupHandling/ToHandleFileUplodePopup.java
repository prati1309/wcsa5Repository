package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUplodePopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrom.driver","./drivers/chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
           
           driver.get("http://omayo.blogspot.com/");
             Actions act=new Actions(driver);
            WebElement UploadButton =driver.findElement(By.id("uplodfile"));
            act.doubleClick(UploadButton).perform();
            
         Runtime.getRuntime().exec("./autoitprograms/OmayofileUpload.exe");
            
             
	}

}
