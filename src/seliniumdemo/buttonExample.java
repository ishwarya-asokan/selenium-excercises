package seliniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\selve\\eclipse\\chromedriver.exe");//(name ,location)
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.leafground.com/button.xhtml");                   // which url want to open
  
        //WebElement getPositionButton = driver.findElement(By.class("ui-button-text ui-c"));
// 1find position of button
       WebElement getPositionButton = driver.findElement(By.id("j_idt88:j_idt94"));
       Point pointxy = getPositionButton.getLocation();
       int xvalue=pointxy.getX();
       int yvalue=pointxy.getY();
       System.out.println("x is "+ xvalue+"Y is "+yvalue );
       System.out.println(pointxy);
       
       
     // 2colour of the button
      WebElement getcolorButton = driver.findElement(By.id("j_idt88:j_idt100"));
      String bcolor = getcolorButton.getCssValue("background-color");
      System.out.println(bcolor);

       // button color - inspect element- styling- background dropdown- background colour
       /// i got error in class instead of Xpath
       // doubt color display
       

// 3 size of button
WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt100"));     
Dimension sizedm =sizeButton.getSize();
int height=sizeButton.getSize().getHeight();
int width=sizeButton.getSize().getWidth();
System.out.println("height of button "+height+" width of button "+width);
System.out.println("Size of button is "+sizedm);


// click and confirm title 

WebElement clickconfbutton = driver.findElement(By.id("j_idt88:j_idt90"));     // doubt class - className
clickconfbutton.click();




	}

}
