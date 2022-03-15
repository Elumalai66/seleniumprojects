package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http:/dev98106.service-now.com");
		driver.manage().window().maximize();
		
		
		
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("loginPage"));
		driver.findElement(By.xpath("//div/input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//div/input[@id='user_password']")).sendKeys("vOIqreWIwH47");
		driver.findElement(By.id("sysverb_login")).click();
		
	}

}
