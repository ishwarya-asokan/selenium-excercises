package seliniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// website are in html format where as ad are in another html format
	//	both are diferent
		
	// using driver.switchTo.frame(0) required html address panum,here zero indicates no frame name  
    // even in correct url for both type of htmls, without using driver.switchTo.frame(0) cant address correct webelement
	
	// default content is used in frame , back to original	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		
		
		//right clic inspect--> frame source in dropdown indicates frame
		

		// get attribute particular parameter/value = text return
		// get text tag ulla irrukura <     >text return pannum
		
		driver.switchTo().frame(0);  // 0 indicates whereas no frame name means put 0, next would be 1
		WebElement framebutton1=driver.findElement(By.id("Click"));
		framebutton1.click();
		
		String text= driver.findElement(By.id("Click")).getText();
		
		System.out.println(text);
		
		// we instruct the driver to don't see the default html content, please consider the iframe html

		// get attribute particular parameter/value = text return
		// get text tag ulla irrukura <     >text return pannum
		//*[@id="frame2"]
		
		// in order to come back to default window, we use defaultcontent frame to original content-(frames)
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement frame2button= driver.findElement(By.xpath("//*[@id=\'Click\']"));
		frame2button.click();
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> totalframes= driver.findElements(By.tagName("iframe"));
		int size=totalframes.size();
		
		System.out.println(size);
		
	//	List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		///findElements used to put for list
		// findelement also used in search ,location of button, and find number of tags
	//	int size = totalframes.size();
	//	System.out.println("size");
		
		
		/*Exception in thread "main" org.openqa.selenium.NoSuchFrameException: No frame element found by name or id frame2
Build info: version: '4.5.0', revision: 'fe167b119a'
System info: os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '17.0.2'
Driver info: driver.version: unknown
	at org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:1019)
	at seliniumdemo.frameexample.main(frameexample.java:53)/*/
		
//doubt
		
		//http://testleaf.herokuapp.com/
		
		
		
		
		
		
		
		
		
		
	}

}
