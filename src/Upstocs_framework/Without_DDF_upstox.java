package Upstocs_framework;

import static org.testng.Assert.expectThrows;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_upstox {
public static void main(String[] args) {
	
	//set the properties
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//delete all cookies
	driver.manage().deleteAllCookies();
	//maximize browser
	driver.manage().window().maximize();
	//open application
	driver.get("https://login-v2.upstox.com/");
	//enter UN
	driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2QALQX");
	//enter pswd
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pnishi@321");
	//click on login 
	driver.findElement(By.xpath("//div[test()='Sign into Upstox']")).click();
	//enter DOB
	driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1995");
	//click on NO i am good
	driver.findElement(By.xpath("//div[text()='No,I'm good']")).click();
	//verify user is on home
	String expT = "Upstox Pro";
	String actT = driver.getTitle();
	if(actT.equals(expT)) {
		System.out.println("User navigate to home page ad TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
}
}