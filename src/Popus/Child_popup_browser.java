package Popus;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup_browser {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	//open the application
	driver.get("http://www.flipkart.com/");
	
	//click on cancle button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	//search for mobile
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
	
	//click on mobile
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	
	//by default selenium control ids on main window we need take all windows
	Thread.sleep(3000);
	Set<String> allwindows=driver.getWindowHandles();
	
	//using arraylist we can store all windows sequencially
	Thread.sleep(3000);
	ArrayList<String>al=new ArrayList<String>(allwindows);
	
	//i want to print adress of main window
	String mainwin=al.get(0);
	Thread.sleep(3000);
	System.out.println(mainwin);
	
	//i want to print sessions id of child window
	String childwin=al.get(1);
	System.out.println(childwin);
	
}
}
