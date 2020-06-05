package TestCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class functions  {
	

	public static void alertMethod(WebDriver driver) throws InterruptedException {


		Actions action2=new Actions(driver);

		action2.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"))).build().perform();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

		Thread.sleep(1500);
		//		Alert alt=driver.switchTo().alert();
		//		alt.accept();

		//capturing alert message
		String actual_msg=driver.switchTo().alert().getText();
		Thread.sleep(1500);
		System.out.println("Alert msg is "+actual_msg);

		driver.switchTo().alert().accept();

	}
	

	public static void mouseHover_DragandDrop(WebDriver driver) throws InterruptedException {


		//mouse hover and click link and drag and drop
		Actions action=new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[text()=\"Interactions \"]"))).build().perform();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[text()=\"Drag and Drop \"]")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[text()=\"Static \"]")).click();



		//drag and drop
		//		driver.switchTo().frame(0);		
		//		
		//		Thread.sleep(1500);
		//		
		//		WebElement targetElement = driver.findElement(By.id("droparea"));
		//		Thread.sleep(1500);
		//		
		//	
		//		Actions action1=new Actions(driver);
		//		
		//		
		//		action1.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();		



		//drag and drop method 2
		//	public void action_1(WebDriver driver) {
		//		
		//		driver.findElement(By.xpath("//*[@id=\"mongo\"]")).click();
		//		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"mongo\"]"));
		//		WebElement dropme=driver.findElement(By.xpath("//*[@id=\"droparea\"]"));
		//		
		//		Actions builder=new Actions(driver);
		//		builder.dragAndDrop(dragme, dropme).perform();
		//		
		//	}

		//integration test=new integration();
		//test.action_1(driver);

		//		WebElement sourceElement = driver.findElement(By.id("angular"));
		//		Thread.sleep(1500);
		//		
		//		WebElement targetElement = driver.findElement(By.id("droparea"));
		//		Thread.sleep(1500);
		//		
		//		System.out.print("hi im printed ");
		//		Actions action1=new Actions(driver);
		//		
		//		//action1.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		//		action1.dragAndDrop(sourceElement, targetElement).build().perform();		
		//		System.out.print("hi im printed after clicked  ");


	}





}
