package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquraySelectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.switchTo().frame(0);
		
		
		
		
		driver.findElement(By.xpath("//ol/li[text()='Item 1']")).click();
		driver.findElement(By.xpath("//ol/li[text()='Item 2']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		//JQERYULSELECTABLE
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement target = driver.findElement(By.xpath("//li[text()='Item 5']"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(source).moveToElement(target).release().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		driver.close();   */

	}

}
