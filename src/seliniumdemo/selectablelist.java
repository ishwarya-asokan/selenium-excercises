package seliniumdemo;

import java.util.List; // avoid errror in List
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectablelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		
		
		
		
		// group o list select by findElements and add xpath  --> add /li in end o xpath , so that it list group of elements.
		
		 List <WebElement> selectable= driver.findElements(By.xpath("//*[@id=\'j_idt111\']/div/div[2]/ul/li"));
		
		 
		 // adding extra /l to the xpath for that it consider both total list and comming list
		 
		int totalList = selectable.size();
		
		System.out.println(totalList);
		
		//list of elements find ---.>use List & findElements
		
		Actions actions =new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		 // another way
		//actions.clickAndHold(selectable.get(0)).clickAndHold(selectable.get(1)).clickAndHold(selectable.get(2));
		
		
		//errror
		
		//ol meeans odered list ul unordered list
		
		// alays find xpath in selectable list
	}

}
