package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath(null))
		driver.findElement(By.xpath("(//input[@class='inputLogin'])")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
        driver.findElement(By.xpath("(//input[@class= 'decorativeSubmit'])")).click();
        driver.findElement(By.xpath("//a[contains(text()=('CRM/SFA')]")).click();
        
        
        
	}

}