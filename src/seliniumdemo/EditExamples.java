package seliniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");//(name ,location)
        WebDriver driver = new ChromeDriver();
        
        // i  order to readable and understandable to convert using return type with name by hoovering in last method
        
        
        driver.get("https://www.leafground.com/input.xhtml");                   // which url want to open
        
        
        //driver.findElement(By.id("j_idt88:name")).sendKeys("demo@gmail.com");  // texbox
        
       WebElement emailbox= driver.findElement(By.id("j_idt88:name"));
       emailbox.sendKeys("demo@gmail.com");
       
        //driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("india");  // texbox append
       
       WebElement apendBox=driver.findElement(By.id("j_idt88:j_idt91"));
       apendBox.sendKeys("india");  // texbox append

        
       // String value= driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value"); // print /retrieve/ get value 
       
        WebElement retreivebox= driver.findElement(By.id("j_idt88:j_idt97"));
        String value =retreivebox.getAttribute("value");
          
        
        /// inspect element in value = "want to get/print in text box text"
        
        // ATTRIBUTES ARE IN VALUE
        
		System.out.println(value);
		
		
		//SELINIUM DOES NOT kNOW DUPLICATE,  FIRST DUPLICATE ONLY PERORM, CANT PERORM ANOTHER ON
		
        driver.findElement(By.id("j_idt88:j_idt95")).clear();  // texbox
        
        
        // avoid duplication in name , use xpath

		WebElement disablebox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']")); // remove double quotation in insoect element
        boolean enabled= disablebox.isEnabled();
        System.out.println(enabled);
	}

}
