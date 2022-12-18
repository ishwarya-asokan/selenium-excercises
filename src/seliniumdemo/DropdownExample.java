package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// not open create account page 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");//(name ,location)
        WebDriver driver = new ChromeDriver();  //launch
        driver.get("https://www.facebook.com/?stype=lo&jlou=AfdmyhMaiSXYBhbFvIcEn0XkjQWbtVTUCsLEz_HkZpSc8DNCQobwYS4QlhwxRU1Y5z_sY4_wq5aWru8NYCSxCsPg&smuh=45560&lh=Ac_AsaYuBpEtKq56TuE");                   // which url want to open
     
       WebElement createAcc = driver.findElement(By.id("//*[@id=\'u_0_0_zk\']"));
       createAcc.click();
        
      WebElement month= driver.findElement(By.id("Month"));
      Select select = new Select(month);
      //select.selectByIndex(0); // usually index start from 0 to n according to dropdown list // tester maually put index
      select.selectByValue("1"); 
      
     
      //dropdown - select tag select by value, index, visible text- select object and object.
      //selectby method call
      
    WebElement day= driver.findElement(By.id("Day"));
     Select select1 = new Select(day);
      select1.selectByVisibleText("2"); 
      
      
	}

}
