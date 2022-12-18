package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		//1
		//WebElement basic=driver.findElement(By.class("ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover ui-state-active"));
	    WebElement basic=driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[1]"));
		basic.click();

		//*[@id=\'j_idt87:j_idt89\']/div[2]
	}

}
