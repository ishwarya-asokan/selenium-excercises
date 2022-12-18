package seliniumdemo;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/list.xhtml");
		
		//unordered list underla list ayirukum
		// it is similat selectable list
		// need to find xpath
		// after the xpath put /li
		
		List<WebElement> sortingelement= driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		
		WebElement fromElement=sortingelement.get(6);
		 
		WebElement toElement=sortingelement.get(0);
		Actions actions= new Actions(driver);    // simmilar to select in drop down
		//actions.clickAndHold(from).moveToElement(to)actions.release(to).build().perform();
		actions.dragAndDrop(fromElement, toElement).build().perform();
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
