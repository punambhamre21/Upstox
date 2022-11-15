package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_of_particular_element {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//open application
	driver.get("https://www.google.com/");
	
	//find particular element and store ref variable
	WebElement paarticulr = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
	
	File src=paarticulr.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:\\Users\\Dell\\Desktop\\Sof.T screenshot\\logo.jpg");
	
	Files.copy(src, dest);
}
}
