package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//to create account
		driver.findElement(By.linkText("Leads")).click();
		
		//driver.findElement(By.linkText("Create Lead")).click();
		//or using partial link text
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini MANAGEMENT");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Elumalai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source=new Select(dropDown);
		source.selectByIndex(4);
		
		//to create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		String text1=driver.getTitle();
		String text2="View Lead | opentaps CRM";
		
		if(text1.equals(text2))
		{
			System.out.println("TestCase Pass");
		}
		else
		{
			System.err.println("TestCase Fail");
		}
		
		String text3=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name:"+text3);
		//to click opentaps
		driver.findElement(By.linkText("opentaps")).click();
		//for logout
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.close();
	}

	
		

	}

	




