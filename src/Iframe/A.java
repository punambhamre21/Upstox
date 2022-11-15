package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	//open window
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	//maximize browser
	driver.manage().window().maximize();
	
	//switch to 1st frame
	driver.switchTo().frame("packageListFrame");
	
	//take any element on 1st frame and print it
	String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
	
	//to print text 1
	System.out.println(text1);
	
	//now we need to switch from 1st frame to main webpage
	driver.switchTo().defaultContent();
	
	////switch to 2nd text2
	Thread.sleep(4000);

	driver.switchTo().frame("packageFrame");
	
	//take any element on 2nd frame and print it
	Thread.sleep(5000);
	String text2 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	
	Thread.sleep(5000);
	//print text2
	System.out.println(text2);
	
	//switch to 3rd frame
driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	
	//take any element from frame 3 and print
String text3=driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
	
	//print text3
	System.out.println(text3);
	
	
}
}
