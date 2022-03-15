package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstanceCreate {

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
	
		
		//Click on Create new option and fill the manadatory fields
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.switchTo().defaultContent();
		
		//to get the inccident number and verify for future
		driver.switchTo().frame(0);
		WebElement getInciNo = driver.findElement(By.xpath("//input[@class='form-control'])[1]"));
		String attribute = getInciNo.getAttribute("value");
		System.out.println(attribute);
		
		//fill the manadatory fields
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("vanakam");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		driver.switchTo().defaultContent();
		
		/*copy the incident number and paste it in search field and enter then verify the
		instance number created or not)*/
		driver.switchTo().frame(0);
		WebElement searchInciNo = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		searchInciNo.sendKeys(attribute);
		Thread.sleep(2000);
		searchInciNo.sendKeys(Keys.ENTER);
		
		//to get the inccident number for verification
		WebElement verifyNo = driver.findElement(By.xpath("//td[@class='vt']//a"));
		String iccNo = verifyNo.getText();
		System.out.println(iccNo);
		driver.switchTo().defaultContent();
		
		// verify the instance number created or not)
		if(attribute.equals(iccNo)) {
			System.out.println("The Instance Is Created");
		}else {
			System.out.println("The Instance Is Not Created");
		}
		
		//To close the window
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
