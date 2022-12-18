package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropexample {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		
		
		WebElement from = driver.findElement(By.id("form:drag_content"));		
		WebElement to = driver.findElement(By.id("form:drop_content"));
		

		Actions actions= new Actions(driver);    // simmilar to select in drop down
		//actions.clickAndHold(from).moveToElement(to)actions.release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();
		
		
		//.build().perform(); must give for output
		
	}
}
