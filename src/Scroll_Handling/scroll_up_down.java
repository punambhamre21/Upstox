package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_down {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//open the application
	driver.get("https://www.amazon.com/");
	
	//typecast
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	//scroll down
	jse.executeScript("window.scrollBy(0,5000);");
	
	Thread.sleep(5000);
	
	//scroll up
	jse.executeScript("window.scrollBy(0,-1000);");
	
	
}
}
