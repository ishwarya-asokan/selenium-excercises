package seliniumdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadexample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		try
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		
		Actions builder = new Actions(driver);

		builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
		
		//WebElement uploadbutton = driver.findElement(By.name("j_idt88:j_idt89_input"));
		//uploadbutton.click();
		
		
		Thread.sleep(3000);
		
		
        String filename = "C:\\Users\\selve\\Downloads\\TestLeaf Logo.png"; 
        // -->upload window box la podrathuku
        // 1)copy process
        //file name string store
        StringSelection selection=new StringSelection(filename);
        // string transfer into plain text
//        Toolkit.getDefaultToolkit().getSystemSelection().setContents(selection,null);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        //2) then copied plaintext stored in clipboard getSystemClipboard
	     
        Robot robot=new Robot(); // paste operation // robort - keyboard class used for window application
		robot.keyPress(KeyEvent.VK_CONTROL); // VK VIRTUAL KEYBOARD
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
		}
		
	}

}
