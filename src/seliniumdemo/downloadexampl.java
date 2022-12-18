package seliniumdemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadexampl {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		
		WebElement downloadlink = driver.findElement(By.id("j_idt93:j_idt95"));
		// LINK FILE MEANS USE BY.LINKText()
		// DONT USE BY.ID OR NAME OR XPATH
		
		
		downloadlink.click();
		
		Thread.sleep(4000);
		//This PC\Downloads\TestLeaf Logo.pnp		
		File filelocation = new File("C:\\Users\\selve\\Downloads");
		
		File[] totalfiles =filelocation.listFiles();
		for (File file : totalfiles) {
			
		  if(file.getName().equals("TestLeaf Logo.png")) {
		  System.out.println("file is downloaded");
		  break;
		}
		}
		
	}
}
