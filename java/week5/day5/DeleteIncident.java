package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://dev110609.service-now.com\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Bobby@66");
		driver.findElement(By.id("sysverb_login")).click();

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("filter"));
		element.sendKeys("incident");
		Thread.sleep(4000);
		element.sendKeys(Keys.ENTER);
		
	    Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		findElement.sendKeys("INC0010008");
		Thread.sleep(2000);
		findElement.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//a[text='INC0010008']")).click();
	    Thread.sleep(3000);
	    
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[@id='sysverb_delete_bottom']")).click();
	    driver.findElement(By.xpath("(//button[@id='ok_button']")).click();
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(0);
	    String s = driver.findElement(By.xpath("//td[text()='No records to display']")).getAttribute("value");
//	    String incident ="No records to display" ;
        System.out.println(s);
        
        if(s.equals("No records to display")) {
        	
        	System.out.println("No records to display");
        }

        else {
        	
        	System.out.println("incident not deleted");
        }


		
		
	}

}
