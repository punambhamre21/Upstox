package Popus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_popus {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	//open webpage
	driver.get("https://www.flipkart.com/");
	
	//maximize window
	driver.manage().window().maximize();
	
	//click on cancle button popup
	driver.findElement(By.xpath("//button[text()='✕']")).click();
}
}