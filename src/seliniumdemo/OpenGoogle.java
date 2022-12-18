package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.open chrome browser
		// 2.google home page
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");//(name ,location)
        WebDriver driver = new ChromeDriver();
        driver.get("httpS://www.google.co.in"); // which url want to open
        
        //driver.quit();    // close the opened browser
        
        // 3.enter a search term in google & clic enter and click the wekipedia link
        
        driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
        
        // how to find text box name in google using right click inspect element 'id=input'
        
        // send key input from our keyboad
        
        
        
        
}

}	
	
	
	
	
	
	