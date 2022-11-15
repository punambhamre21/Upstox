package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
//open application
	driver.get("https://www.amazon.com/");
	
//how to take screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;  //tyepcast here
	
	//use getscreenshot method and store in src
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	//create folder where we need to store srcsot and give the path of folder with proper name and extension
	File dest=new File("C:\\Users\\Dell\\Desktop\\Sof.T screenshot\\amazon.jpg");
	
	//copy screenshot src to dest
	Files.copy(src,dest);
}
}
