package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Year {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//open 
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(4000);
	//select create new account
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	Thread.sleep(4000);
	//store box referance variable
	WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
	
	
	//create object of select class
	Select s=new Select(year);
	
	//select by value
	s.selectByValue("2010");
	
	//select by index
	//s.selectByIndex(2013);
	
	
}
}
