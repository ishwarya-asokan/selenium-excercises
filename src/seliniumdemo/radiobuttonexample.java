package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		
		// 1 
		WebElement uncheck=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]"));
        WebElement check=driver.findElement(By.id("j_idt87:console2:2"));
       //WebElement check=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));

  boolean status1=  uncheck.isSelected();
  boolean status2=  check.isSelected();
  System.out.println("status of uncheck "+ status1);
  System.out.println("status of check "+ status2);
  
	WebElement below20=driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]"));
       below20.click();
       
      
	}

}
