package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toyWithTable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// count column
		
		
	    List<WebElement> columnCount = driver.findElements(By.tagName("th"));
		int size = columnCount.size();
		System.out.println("columnCount :" + size);
		
		//count row
		
		List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
		int size2 = rowCount.size();
		System.out.println("rowCount :" + size2);
		
		// text
		
		String text = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td")).getText();	
		System.out.println("Learn to interact with Elements : " + text);
		
		
		List<Integer> value=new ArrayList<Integer>();
		
		for (int i = 2; i <=size2; i++) {
		
		String word = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td[2]")).getText();
		
		//System.out.println(text);
		
		String replaceAll = text.replaceAll("%", "");
		//System.out.println(replaceAll);
		
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println(parseInt);
		
		
		value.add(parseInt);
		}
			
		System.out.println(value);
		Integer min = Collections.min(value);
		
		System.out.println("minimumValue: "+min);
		
		driver.findElement(By.xpath("//td[contains(text(),'"+min+"')]/following-sibling::td[1]/input")).click();
		                          
	   
	   
	
}

	
	}
	
	

