package seliniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		
		// jquery calender
		//WebElement calander= driver.findElement(By.id("datepicker")); // through sendkeys
		//calander.sendKeys("01/10/2023"+Keys.ENTER);
		
		
		WebElement calander= driver.findElement(By.id("datepicker")); // through input-->next-->10
		calander.click();
		
		//---//*[@id="ui-datepicker-div"]/div/a[2]    ORDINARY XPATHPOSITION MAY CHANGE IN FUTURE
		// ---//a[@title='Next']                       OUR XPATH --- CONCRETE LOCTION
		// here // indicate doent know correct location
		
		
		WebElement datepick= driver.findElement(By.xpath("//a[@title='Next'] "));
		datepick.click();
		
		WebElement datepick1= driver.findElement(By.xpath("//a[contains(text(),'10')] "));
		datepick1.click();
		
	}

}
