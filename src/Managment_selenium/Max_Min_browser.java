package Managment_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_Min_browser {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	//maximize
	driver.manage().window().maximize();
	
	//minimize
	Thread.sleep(4000);
	driver.manage().window().minimize();
	
	//setsize
	Dimension d=new Dimension(100,200);
	
	driver.manage().window().setSize(d);
	
	//setposion
	
	Point p= new Point(300,400);
	driver.manage().window().setPosition(p);
	
	
}
}
