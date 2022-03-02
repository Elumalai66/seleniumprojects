package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.name("username")).sendKeys("elumalai");
		driver.findElement(By.name("firstname")).sendKeys("elumalai");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.name("email")).sendKeys("elumalairaina30061999@gmail.com");
		WebElement element = driver.findElement(By.id("input-country"));
		Select se = new Select(element);
		se.selectByVisibleText("India");
		
		driver.findElement(By.name("password")).sendKeys("pass");
		
	

}
}