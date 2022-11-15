package Managment_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxmin {
 public static void main(String[] args) throws Throwable{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.amazon.com/");
	 //pagescore
	 
	 String allelements = driver.getPageSource();
	 
	 System.out.println(allelements);
	String title = driver.getTitle();
	
System.out.println(title);
}
}
