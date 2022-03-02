package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		
	    WebElement word1 = driver.findElement(By.id("Click"));
	    word1.click();
	    String text = word1.getText();
	    System.out.println(text);
	    
	    driver.switchTo().defaultContent();
	    
	    
	    driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement word2 = driver.findElement(By.id("Click1"));
		word2.click();
		String text2 = word2.getText();
		System.out.println(text2);
	    
		
	/*	driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("text2");
		
		*/
		
		File start = driver.getScreenshotAs(OutputType.FILE);
		File close = new File("./pics./LearnFrame.png");
		FileUtils.copyFile(start, close);

	}

}
