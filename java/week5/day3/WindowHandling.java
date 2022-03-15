package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		
		Set<String> old = driver.getWindowHandles();
		List<String> newOne = new ArrayList<String>(old);
		System.out.println("NewOne Tabs : " + newOne.size());
		driver.switchTo().window(newOne.get(1));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bobby");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("nothing");
		
        driver.switchTo().window(windowHandle);
		
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();	
		Set<String> c = driver.getWindowHandles();
		List<String> small1 = new ArrayList<String>(c);
		driver.switchTo().window(newOne.get(2));
		driver.manage().window().maximize();
		
		
//		 driver.switchTo().window(windowHandle);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		/*
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		String windowHandle = driver.getWindowHandle();	
		
		Set<String> oldWindow = driver.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(oldWindow);
		System.out.println(newWindow.size());
		
		
		driver.switchTo().window(newWindow.get(1));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("email")).sendKeys("bobby");
		driver.switchTo().window(windowHandle);
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	    String oldWindow1 = driver.getWindowHandle();
	    List<String> newWindow1 = new ArrayList<String>();
	    System.out.println(newWindow1.size());
		
		
		driver.quit();  */
		

	}

}
