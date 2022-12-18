package seliniumdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		
		String oldwindow=driver.getWindowHandle() ;   //will get you the current window handle
		// this is used to give control to come back/return to homepage launch  
		//used to return homepage in future after opening child find and close child window 
		
		WebElement firstButton =driver.findElement(By.xpath("//*[@id='j_idt88:new']/span"));
		firstButton.click();
		
		
		Set<String> handles=driver.getWindowHandles() ; 
			
		// this is used to store multiple windows opened
		// it stores parent and child windows
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
		// this for each loop brings driver control to only new windows
		
		}
		
		
		WebElement childButton= driver.findElement(By.xpath("//*[@id=\'menuform:j_idt38\']/a/i[1]"));
		childButton.click();
		
		driver.close();  // close the child/ new window
	    driver.switchTo().window(oldwindow);  // then again go to initial url/ parent window
		  
		
	    WebElement multipleparent=driver.findElement(By.id("j_idt88:j_idt91"));
        multipleparent.click();
        
       int totalwindows = driver.getWindowHandles().size();
        
       System.out.println("total windows opened are "+totalwindows);
       
       
      ////3

       WebElement defaultwindow= driver.findElement(By.id("j_idt88:j_idt93"));
       defaultwindow.click();
       
       Set<String> handles1=driver.getWindowHandles() ; 
       for (String allwindows : handles1) {
    	   
    	   if(!allwindows.equals(oldwindow)) {
    		   
    		   driver.switchTo().window(allwindows);
    		   driver.close();   
    	   }
		
    	 //  driver.quit();
	}
       
       
    //   focus ly close the window = close();
      //  close all the window including parent child = quit()
        
        
        
		
		
	}

}
