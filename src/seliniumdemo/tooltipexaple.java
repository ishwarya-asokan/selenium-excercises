package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltipexaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// EXAMPLE IF WE HOOVER ON THE TEXT BOX, IT INDICATES TEXT"TYPE HERE"
		
		
	// MOSTLY WE IDENETIFIED IN THAT TOOL TIP TEXT IN THE TILE ATTRIBUTE, but here in data-toolTip Attribute
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml#");
		
		WebElement tooltipbuttonname= driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[2]/a"));
		String nameoftooltip =tooltipbuttonname.getAttribute("data-toolTip");
		System.out.println(nameoftooltip);
		
  	// TOOL TIP 	
				
	}

}
