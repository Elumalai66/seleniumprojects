package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesCherCherPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
     	//frame with nested frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[1]")).sendKeys("FRAMES");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@ id='a']")).click();
		driver.switchTo().defaultContent();
		
		//seperate Frame
		driver.switchTo().frame(1);
		WebElement drop = driver.findElement(By.xpath("//select"));
		Select dropDown = new Select(drop);
		dropDown.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();   

	}

}
