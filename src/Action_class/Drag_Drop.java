package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	//inspect forst element
	WebElement element1=driver.findElement(By.xpath("//div[@id='draggable']"));
	
	//inspect second element
WebElement element2=driver.findElement(By.xpath("//div[@id='droppable']"));

//create action class
Actions act=new Actions(driver);

act.dragAndDrop(element1, element2).perform();
}
}
