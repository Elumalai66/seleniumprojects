package week3.day5;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	private static final String WindowHandels = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement brand = driver.findElement(By.xpath("//li/a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();

		driver.findElement(By.xpath("//div/input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
				
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
        String title1 = ("Buy L'Oreal Paris products online at best price on Nykaa | Nykaa");

		if (title1.equals(title1)) {

			System.out.println("The title correct");
		} else {
			System.out.println("The title is wrong");
		}
	
        driver.findElement(By.xpath("//span[@class='sort-name']")).click();
        driver.findElement(By.xpath("(//label[@class='control control-radio'])[4]")).click();
        driver.findElement(By.xpath("(//div/div[@class='filter-open css-nbw8dp'])")).click();
        driver.findElement(By.xpath("//div/span[text()='Hair']")).click();
        driver.findElement(By.xpath("//div/span[text()='Hair Care']")).click();
        driver.findElement(By.xpath("//div/label[@class='control control-checkbox'][1]")).click();
        
        driver.findElement(By.xpath("//div/span[text()='Concern']")).click();
        driver.findElement(By.xpath("//div/span[text()='Color Protection']")).click();
        
        
        WebElement Filter = driver.findElement(By.xpath("//div/span[text()='Filters Applied']"));
        String f = Filter.getText();
        System.out.println(f);
        
        
        driver.findElement(By.xpath("(//img[@class='css-11gn9r6'])[2]")).click();
        
        Thread.sleep(2000);
        
       /* Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
      
        ArrayList<String> value = new ArrayList<String>(WindowHandels);
        driver.switchTo().activeElement()).window(value.get(1));  */
        
        Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		ArrayList<String> value =new ArrayList<String>(windowHandles);
		driver.switchTo().window(value.get(1));
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	    //select size as 175ml
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("(//select[@title='SIZE'])"));
		Select drop =new Select(dropdown);
		drop.selectByVisibleText("175ml");
		
		//Print MRP and Click On Add To Bags
		WebElement getMrp = driver.findElement(By.xpath("(//div[@class='css-k400rm']//span)[3]"));
		String Mrp = getMrp.getText();
		System.out.println("MRP :"+Mrp);
		
		//Click on ADD to BAG &  Go to Shopping Bag &  Print the Grand Total amount 
		WebElement addToBags = driver.findElement(By.xpath("//span[text()='ADD TO BAG']/.."));
		addToBags.click();
		driver.findElement(By.xpath("//span[@class='cart-count']//..")).click();
		Thread.sleep(2000);
		
		//Click Proceed
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("(//div[@class='first-col'])")).getText();
		System.out.println(grandTotal);
		driver.findElement(By.xpath("//span[text()='PROCEED']//..//..")).click();
		
		// Click Continue As Guest	& Check The grand Total
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		if(Mrp.equals(grandTotal)) {
			System.out.println("The Grand Total Is Same");
		}else {
			System.out.println("The Grand Total Is Not Same");
		}
		driver.quit();
		//driver.close();
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        
//        WebElement category = driver.findElement(By.xpath("//li/a[@id='category']"));
//        Actions builder1 = new Actions(driver);
//        builder1.moveToElement(category);
//        
//        WebElement Hair = driver.findElement(By.xpath("//li/a[text()='hair']"));
//        Actions builder2 = new Actions(driver);
//        builder2.moveToElement(Hair)
//        

	}

}
