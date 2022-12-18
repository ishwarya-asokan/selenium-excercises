package seliniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocmplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement inputbox = driver.findElement(By.name("j_idt87:auto-complete_input"));// 
		// ul input box
		
		inputbox.sendKeys("P");
		
		Thread.sleep(4000);// explicit wait
		
		//to check the delay by using size print statement that displayed 0, it indicates so the driver doesnt take the list 
		//by using Thread sleep, is used to avoid delay open auto dropdown viewed on text box when we put p  

		
		List<WebElement> optionlist  = driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));

		//add ul/li
		
		System.out.println(optionlist.size());
		//*[@id="j_idt87:auto-complete_panel"]/ul
		//(ul) xpath --> must take from span or other way which have number of list (li) with elements
		//*[@id="j_idt87:auto-complete"]/ul dont take ul xpath  from div
		
		
		for (WebElement webElement : optionlist) {
			
			if(webElement.getText().equals("PostMan"))
			{
			webElement.click();
			System.out.println("selecting "+ webElement.getText());
			break;
		}
		}
	
	}
}
