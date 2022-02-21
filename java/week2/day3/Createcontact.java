package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']/li)[2]/a")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("elumalai");
		driver.findElement(By.id("lastNameField")).sendKeys("N");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("elumalai");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("N");
		
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I am a Software Tester");
		driver.findElement(By.name("primaryPhoneCountryCode")).clear();
		driver.findElement(By.name("primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("primaryPhoneNumber")).sendKeys("96291893453");
		driver.findElement(By.name("primaryEmail")).sendKeys("elumalairaina30061999@gmail.com");
		driver.findElement(By.name("generalToName")).sendKeys("elumalai");
		driver.findElement(By.name("generalAddress1")).sendKeys("thirukalukundram");
		driver.findElement(By.name("generalAddress2")).sendKeys("kalpakam");
		driver.findElement(By.name("generalCity")).sendKeys("chengalpattu");
		
		WebElement dropDown2 = driver.findElement(By.name("generalCountryGeoId"));
		Select country=new Select(dropDown2);
		country.selectByValue("IND");
		
		WebElement dropDown3 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state=new Select(dropDown3);
		state.selectByValue("IN-TN");
		
		driver.findElement(By.name("generalPostalCode")).sendKeys("603109");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("birthDate")).sendKeys("06/30/99");
		
		WebElement dropDown1 = driver.findElement(By.name("preferredCurrencyUomId"));
		Select currency=new Select(dropDown1);
		
		currency.selectByValue("INR");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		if(driver.getTitle().contains("View Contact | opentaps CRM"))
		{
			System.out.println("Testcase pass the title is : "+driver.getTitle());
		}
		else
		{
			System.out
			
			
			.println("Testcse Fail");
		}

	}

}
