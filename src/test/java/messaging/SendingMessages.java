package messaging;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class SendingMessages {
	
	private static WebElement driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
				
		//1.create new object
		WebDriver driver = new ChromeDriver();
				
	    driver.manage().deleteAllCookies();
	    
	    //implicitlyWait
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	
	    SendingMessages.Login(driver);
	    
	    SendingMessages.createMessage(driver);
	    
	    SendingMessages.createMessage(driver);
	    
	    
//	    Thread.sleep(1500);
	    driver.quit();
		
	
	}


	public static void Login(WebDriver driver) throws InterruptedException {  //pass object veriable in every method
		
		driver.get("https://staging.schoolvoice.com/");
		
		driver.findElement(By.xpath("//*[@id=\"appHeader\"]/div/nav/a[3]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.name("username")).sendKeys("branchadmin");
		Thread.sleep(1500);
		
		driver.findElement(By.id("ms-form-pass")).sendKeys("abc123");
		Thread.sleep(1500);
		
		  try {
			  
			  driver.findElement(By.xpath("//*[@id=\\\"loginForm\\\"]/fieldset/div[3]/div[2]/button")).click();
			  System.out.println("Display try");
			  
		  }catch(Exception e) 
		  {
			  System.out.println("Display error");
			  System.out.println(e);
		  }
		  
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset/div[3]/div[2]/button")).click();

	    
		
	}
	
	
	public static void createMessage(WebDriver driver) throws InterruptedException {
		
		String filePath="C:\\Users\\fathih\\eclipse-workspace\\SV_Messaging_Module\\images\\licenece copy"; 
		
		driver.findElement(By.xpath("/html/body/div[3]/a/i")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"2\"]/i")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div[1]/div/div/div[4]/div[1]/div/div[1]/button/span[1]")).click();
		Thread.sleep(1500);
				
		driver.findElement(By.xpath("/html/body/div[3]/form/div[1]/div/div/div[4]/div[1]/div/div[1]/div/ul/li[2]/a/span[1]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div[1]/div/div/div[4]/div[2]/div[1]")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("milhan");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//ul[@id='select2-target-results']/li/div/div/div")).click();
		Thread.sleep(1500);
		
		System.out.println("paas");
		driver.findElement(By.xpath("//div[@id='richtext']/div/div[2]/div/p")).click();
		System.out.println("paas1");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='richtext']/div/div[3]/div")).sendKeys("Test Message2");
		
		//System.out.println("paas2");
		Thread.sleep(5000);
		WebElement uploadButton=driver.findElement(By.xpath("/html/body/div[3]/form/div[1]"));
		Thread.sleep(3500);
		uploadButton.sendKeys(filePath);
		
		System.out.println("paas4");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"messageComposeModal\"]/div/div/div[5]/div[1]/button[1]")).click();
		
	}
	
	
}
