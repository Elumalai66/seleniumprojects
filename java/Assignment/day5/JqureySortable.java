package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqureySortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		//JQUREYUL SORTABLE
		driver.switchTo().frame(0);
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement ele4= driver.findElement(By.xpath("//li[text()='Item 4']"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(ele4).moveToElement(ele1).click().perform();	
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		driver.close();

	}

}
