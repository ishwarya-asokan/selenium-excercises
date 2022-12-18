package seliniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownexample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		//1
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown);
		select.selectByIndex(3);
		//Thread.sleep(3000);
		//select.selectByValue("3");	// quotation is important
		Thread.sleep(3000);
		select.selectByVisibleText("Selenium"); /// case sensitive in text
//2
		// index and values are not availale. but index works
		List<WebElement> listOfOption=select.getOptions();
		int number=listOfOption.size();
		System.out.println("number of elements "+number);
		
		dropdown.sendKeys("Cypress");
		
	   //3 combination of //1 in multiple select
	}

}
