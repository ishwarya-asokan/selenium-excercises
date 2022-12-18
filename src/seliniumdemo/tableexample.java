package seliniumdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		
		List<WebElement> columns= driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("total column "+ columncount);
		
		List<WebElement> rows= driver.findElements(By.tagName("tr"));
		int rowcount = rows.size();
		System.out.println("total rows "+ rowcount);
		
		WebElement getpercent= driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));		
		
		String percentage=getpercent.getText();
		
		System.out.println("percentage is "+ percentage);
		
		
		// td[normalizespace='Learn to interact with Elements]//following::td[1];
		
		//HERE  td[1] indicate first next of 'Learn to interact with Elements'
		
	// lowest of third column
		
		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		
		
		List<Integer> numberlist= new ArrayList<Integer>();
		
		for (WebElement webElement : allprogress) {
			String individual=webElement.getText().replace("%","");
			numberlist.add(Integer.parseInt(individual));/// in order to store the datas in list 
			// without list we cannot store all the data
		}
        System.out.println("final list"+numberlist);
        
        int smallvalue= Collections.min(numberlist); // here collections is a classs
        
        System.out.println("smallest value "+smallvalue);  // OUTPUT 20
        
        String smalleststring= Integer.toString(smallvalue)+"%";
        
      
        
        String finalxpath= "//td[normalize-space()="+"\""+smalleststring+"\""+"]"+"//following::td[1]";
		
		System.out.println(finalxpath);
		
		//"td[normalize-space()='20%']//following::td[1]"
		
		WebElement smallestcheck = driver.findElement(By.xpath(finalxpath));	
		smallestcheck.click();
		

		
		
		
		
		
		
		
		

	}

}
