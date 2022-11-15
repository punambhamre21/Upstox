package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//open application
	driver.get("http://www.facebook.com/");
	
	//click on create new account button
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	//select the add which we need handle
	Thread.sleep(3000);
	
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	
	//create the object of select class
	Select s=new Select(day);
	
	Thread.sleep(3000);
	
	//use select class methods (select button text)
	//s.selectByVisibleText("26");
	
	//by using value
	//s.selectByValue("31");
	
	//by index
	s.selectByIndex(3);
	
	
}
}
