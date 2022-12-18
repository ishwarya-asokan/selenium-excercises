package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
				System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");//(name ,location)
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.leafground.com/link.xhtml"); // which url want to open
		        
		        
		        
		        
		       // driver.findElement(By.linkText("Go to Dashboard")).click();
		        
		        driver.findElement(By.partialLinkText("Dashboard")).click();

		        
		        // partialLinkText is used in the flexible changing link name situations
		        
		        
		
	}

}
