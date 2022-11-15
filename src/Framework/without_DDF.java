package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_DDF {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//delete all cookies
	driver.manage().deleteAllCookies();
	
	//maximize
	driver.manage().window().maximize();
	
	//open the application
	driver.get("https://demo.actitime.com/login.do");
	
	//enter password
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	
	//enter password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	//click on login btn
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	//add something on home page
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("Ankush");
	
	//actual title
	String act = driver.getTitle();
	
	//exp title
	String exp = "actiTIME-Enter Time-Track";
	
	//compare both
	if(exp.equals(act)) {
		System.out.println("Tc is pass");
	}
	else {
		System.out.println("Tc is fail");
	}
}
}
 