package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement option1 = driver.findElement(By.xpath("//ol/li[text()='Item 1']"));
		
		WebElement option2 = driver.findElement(By.xpath("//ol/li[text()='Item 4']"));
		
		WebElement option3 = driver.findElement(By.xpath("//ol/li[text()='Item 7']"));
		
		Actions builder=new Actions(driver);
		
		//method1 to select from one option to 4 option select as 1,2,3,4
		//builder.clickAndHold(option1).moveToElement(option2).release().perform();
		
		//method2 to select the particular wnated options only if 1,4,6
		builder.keyDown(Keys.CONTROL).click(option1).click(option2).click(option3).release().perform();
		

	}

}
