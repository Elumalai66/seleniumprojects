package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Kavinraj");
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9080829503");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Kavinraj@1234");
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select day=new Select(dropDown1);
		day.selectByVisibleText("20");
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select month=new Select(dropDown2);
		month.selectByIndex(9);
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select year=new Select(dropDown3);
		year.selectByValue("1999");
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		
		//driver.findElement(By.linkText("Sign Up")).click();
		driver.close();
		
		
		

	}

}
