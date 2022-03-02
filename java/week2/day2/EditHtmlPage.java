package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtmlPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//enter email id
		driver.findElement(By.id("email")).sendKeys("elumalairaina30061999@gmail.com");
		
		//Get the default text
		System.out.println("The default text is:"+driver.findElement(By.name("username")).getAttribute("value"));
		//Append  a text and press keys.TAB
		driver.findElement(By.xpath("//input[@value='Append ']")).clear();
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Elumalai",Keys.TAB);
		
		//Get the default text
		System.out.println("The default text is:"+driver.findElement(By.name("username")).getAttribute("value"));
			
		//clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
			
		//check the input field is disabled or not
		System.out.println("Print false if the textbox is disabled:"+driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
			
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//position of button(x,y)
		System.out.println("The Position of the button:"+driver.findElement(By.id("position")).getLocation());
		
		//Find the color of the button
		System.out.println("The color of the button:"+driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Find the width and height of the button
		System.out.println("The width and height of the button:"+driver.findElement(By.id("size")).getSize());
		
		
	}

	}


