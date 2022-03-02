package Assignmentsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		builder.dragAndDropBy(element,10, 10).build().perform();
		builder.dragAndDropBy(element,20, 20).build().perform();
		builder.dragAndDropBy(element,30, 30).build().perform();
		builder.dragAndDropBy(element,40, 40).build().perform();
		builder.dragAndDropBy(element,50, 50).build().perform();
		builder.dragAndDropBy(element,40, 40).build().perform();
	
	}

}
