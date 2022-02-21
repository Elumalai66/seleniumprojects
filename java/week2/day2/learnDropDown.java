package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver =new ChromeDriver();
		driver.get("http://www.leafground.com./pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select se = new Select(dropdown1);
		se.selectByValue("1");
		
		Thread.sleep(2000);
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select se1 = new Select(dropdown2);
		se1.selectByValue("2");
		
		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select se2 = new Select(dropdown3);
		se2.selectByValue("3");
		
		

	}

}
