package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement option1 = driver.findElement(By.xpath("//ul/li[text()='Item 2']"));
		
		WebElement option2 = driver.findElement(By.xpath("//ul/li[text()='Item 6']"));
		
		Actions builder=new Actions(driver);
		
		builder.clickAndHold(option1).moveToElement(option2).perform();
		

	}

}
