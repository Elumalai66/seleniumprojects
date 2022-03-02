package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("WIPRO MANAGEMENT");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavinraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source=new Select(dropDown1);
		source.selectByVisibleText("Employee");
			
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/20/99");
		
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry=new Select(dropDown2);
		industry.selectByIndex(2);
		
		WebElement dropDown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership=new Select(dropDown3);
		ownership.selectByValue("OWN_SCORP");
		
		WebElement dropDown4 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaign=new Select(dropDown4);
		campaign.selectByVisibleText("Automobile");
		
		WebElement dropDown5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currency=new Select(dropDown5);
		currency.selectByValue("INR");
		
		//contact information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9080829503");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavinraj89444@gmail.com");
		
		//primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Kavinraj");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Thokkavadi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Tiruchengode");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Namakkal");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("637215");
		
		WebElement dropDown6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country=new Select(dropDown6);
		country.selectByValue("IND");
		
		WebElement dropDown7 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(dropDown7);
		state.selectByValue("IN-TN");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		if(driver.getTitle().contains("View Lead | opentaps CRM"))
		{
			System.out.println("Testcase Pass");
		}
		else
		{
		System.err.println("Testcase Fail");
		}
		
		driver.findElement(By.linkText("opentaps")).click();
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.close();
	}

	}


