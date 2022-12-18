package seliniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0m7h4w2wxvtwrym6iztpqlsoi374303.node0");
		//1
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		alertbox.click();
		
		Alert alert = driver.switchTo().alert(); // then need to click ok in alert box
		alert.accept();
		
		//2
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		confirmbox.click();
		Alert confirmalert = driver.switchTo().alert(); // then need to click ok in alert box
		confirmalert.dismiss();
		
		//3
		WebElement promptbox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
        promptbox.click();
        Alert promptalert = driver.switchTo().alert();
        promptalert.sendKeys("ducklings");
        promptalert.accept();  //Adding test comment
        
        



		
		

	}

}
