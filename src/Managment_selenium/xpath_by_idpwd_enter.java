package Managment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_idpwd_enter {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	//enter un
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	//enter password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	
}
}
