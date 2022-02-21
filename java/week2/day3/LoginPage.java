package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("elumalairaina30061999@gmail.com");
		driver.findElement(By.id("password")).sendKeys("rio7hills");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		System.out.println("The title of the page: "+driver.getTitle());
		
		driver.findElement(By.xpath("//li/a[text()='Log Out']")).click();
		driver.close();
		
	}

}
