package Popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//open webpage
	driver.get("https://demo.guru99.com/test/delete_customer.php");

	//maximize window
	driver.manage().window().maximize();
	
	//enetr coustmer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345",Keys.ENTER);
	
	//use alter interface
	Alert alt = driver.switchTo().alert();
	
	//i want to click on ok button
	alt.accept();
	
	//click on cancle button
	//alt.dismiss();
	
	//get text on popup
	String text = alt.getText();
	
	System.out.println(text);
}
}
