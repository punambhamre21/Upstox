package Roboat_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//open the application
	driver.get("https://www.amazon.com/");
	
	//create object of robot class
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(5000);
	
r.keyPress(KeyEvent.VK_PAGE_DOWN);

r.keyRelease(KeyEvent.VK_PAGE_DOWN);
}
}
