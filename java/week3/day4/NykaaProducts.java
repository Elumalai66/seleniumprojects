package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions builder=new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli']/li/a[text()='brands']"));
		builder.moveToElement(brand).perform();
		
		driver.findElement(By.xpath("//div[@class='brandSearchMain']/input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//div[@id='scroller-container']//a[1]")).click();
		
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Testcase Pass, The Title is: "+title);
		}
		else
		{
			System.err.println("TestCase Fail");
		}

	}

}
