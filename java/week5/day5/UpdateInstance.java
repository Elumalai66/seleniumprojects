package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateInstance {

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
	    driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	    Thread.sleep(3000);
	    
	    WebElement dropdown = driver.findElement(By.xpath("//select[@name='incident.urgency']"));
	    Select urgency=new Select(dropdown);
		urgency.selectByIndex(0);
		
		String text3 = dropdown.getText();
		String text2 = driver.findElement(By.xpath("(//option[@value='1'])[1]")).getText();
		System.out.println(text2);
		
		if (text3.contains(text2))
			
			System.out.println("incidents is updated");
		else 
			System.out.println("incidents is not updated");
			
		
		 WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='incident.state']"));
		 Select state=new Select(dropdown2);
		 state.selectByValue("2");
		 
		 String text4 = dropdown2.getText();
		 String text5 = driver.findElement(By.xpath("(//option[@value='2'])[2]")).getText();
		 System.out.println(text5);
		 
		 if(text4.contains(text5))
			 
			 System.out.println("incidents is updated");
		 else 
			 System.out.println("incidents is not updated");
		 
		
		 driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
	    

	    driver.close();
  

	}

}
