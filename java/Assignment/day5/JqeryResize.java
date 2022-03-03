package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqeryResize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.switchTo().frame(0);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions bulider = new Actions(driver);
		bulider.dragAndDropBy(element, 60,90).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		//JQERYULRESIZABLE
		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(resize, 100, 50).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		driver.close();
		
		*/

	}

}
