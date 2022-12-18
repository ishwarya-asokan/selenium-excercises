package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		WebElement broken = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		broken.click();
		
	if(broken.getAttribute("naturalWidth").equals("0")) {
		
		System.out.println("It is broken image");
	}
		else {
			
			System.out.println("It is notbroken image");
			
		}
		
		
	}
		
}
		
		
		
		
	