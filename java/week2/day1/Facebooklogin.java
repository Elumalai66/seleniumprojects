package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		//driver.findElement(By.id("email")).sendKeys("elumalairaina30061999@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("rio7hills");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bobby");
		driver.findElement(By.name("lastname")).sendKeys("66");
		driver.findElement(By.name("reg_email__")).sendKeys("9629189345");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rio7hills");
		
		WebElement element = driver.findElement(By.id("day"));
		Select se = new Select(element);
		se.selectByIndex(29);
		
		WebElement element1 = driver.findElement(By.id("month"));
		Select se1 = new Select(element1);
		se1.selectByValue("6");
		
		WebElement element2 = driver.findElement(By.id("year"));
		Select se2 = new Select(element2);
		se2.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
	}

}