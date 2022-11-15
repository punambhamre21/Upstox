package Managment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute_1 {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	
	//enter username(use formula xpath by attribute)
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	//enter password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

	Thread.sleep(3000);
	//click on login button (use fomula xpath by text())
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
	


}
}