package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	
	WebDriver d;
	
	@BeforeMethod
	public void  browser() {
		
        WebDriverManager.chromedriver().setup();
		
		 d = new ChromeDriver ();
		
		d.get("https://www.flipkart.com");
		
		d.manage().window().maximize();
		
		
	}
	
	@Test
	public void Login() throws InterruptedException {
		
		
		WebElement usnm = d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		usnm.sendKeys("8600353457");
		
		WebElement pwd = d.findElement(By.xpath("//input[contains(@type,'password')]"));
		pwd.sendKeys("Mayur@7663");
		
		WebElement clk = d.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clk.click();
		Thread.sleep(5000);
		
		System.out.println("test 1 passed " + " Homepage display succesfully");
		
		
		
		
		
		
	}
	
	@Test
	public void Username() {
		
		
	boolean k =	d.findElement(By.className("exehdJ")).isDisplayed();
	System.out.println("test 2 passed " + k + " username verify ");
		
		//throw  new SkipException(" forcedfully skipped");
		
		
		
		
	}
	
	
	
	

}
