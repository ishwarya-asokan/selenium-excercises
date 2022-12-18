package seliniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinkexamle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		
		WebElement homepage = driver.findElement(By.linkText("Go to Dashboard"));
		
		homepage.click();
		
		driver.navigate().back();
		
	//	get - url provide
	//	navigate - back , refresh, forward
		
		
		WebElement wherego = driver.findElement(By.partialLinkText("Find the URL"));
		String where = wherego.getAttribute("href");
		System.out.println("where it go"+ where);
		
		
		WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		
		
	    //Thread.sleep(4000);
		
		String brokentitle=driver.getTitle();
		
		if(brokentitle.contains("404")) {
	    System.out.println("broken link");
	   
		}
		else
			System.out.println("It is not a broken link");
		 driver.navigate().back();
		
		List<WebElement> totallink= driver.findElements(By.tagName("a"));	
		
		int totalcount=totallink.size();
		
		System.out.println("total links"+totalcount);
		
		/*stale element reference error , we cannot use homepage.click() in another place for same purpose, 
		 because this link is already performed with back or refresh or  forward so solenium got error,
		 we must use as fresh element */
		
		
		
		
		
		//always string/int gives with + 
	//	dont give with comma
		
		
		
		
		

	}

}
