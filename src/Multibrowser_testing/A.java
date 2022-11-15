package Multibrowser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A {
@Parameters("browsername")//annotation
@Test
public void TC(String browsername) { //parameterised method
	WebDriver driver=null; //runtime polymorphism
	
	if(browsername.equals("chrome")) {
		
	System.setProperty("webdriver.chrome.driver","");
	driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox")) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new FirefoxDriver();
	}
	driver.get("https://www.facebook.com/");//globally
}
}
