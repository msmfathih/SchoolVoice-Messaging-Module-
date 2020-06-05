package TestCI;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class integration extends functions  implements boostrapDropDownMenu {

	private static final String Alerts = null;
	private static final String Windows = null;
	private static Actions action;
	private static WebElement sourceElement;




	public static void main(String[] args) throws InterruptedException {


		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://demo.automationtesting.in");

		driver.manage().window().maximize(); //maximize browser

		integration.loginModule(driver);

		integration.radioBtnMethod(driver);
		integration.checkBoxesMethod(driver);

		integration obj=new integration(); //create class for interface
		obj.languageSelection(driver);  //call interface method

		integration.skill_Country_DropdownMenu(driver);
		//integration.alertMethod(driver);

		//integration.mouseHover_DragandDrop(driver);

		//driver.quit();

	}


	//interface method
	public void languageSelection(WebDriver driver) {

		driver.findElement(By.id("msdd")).click();

		List<WebElement> list=(List<WebElement>) driver.findElements(By.xpath("//ul[contains(@class,'ui-corner-all')]//li//a"));

		System.out.println(list.size());

		//select only one language 
		for(int i=0; i<list.size(); i++){

			System.out.println(list.get(i).getText());  //print all elements

			if(list.get(i).getText().contains("English")) {

				list.get(i).click();

				driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
				break;
			}

		}
	}


	//click all the languages
	//	for(int i=0; i<list.size(); i++){
	//
	//		System.out.println(list.get(i).getText());  
	//
	//		list.get(i).click();
	//}

	public static void loginModule(WebDriver driver) throws InterruptedException {

		String filePath="C:\\Users\\fathih\\eclipse-workspace\\RentVehicals\\images\\licenece copy.jpeg";

		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("fathih");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("mohamed");
		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("jbfsdfkdrgdrgtdgtdfgtdrhsdkf");
		Thread.sleep(1500);

		WebElement uploadButton=driver.findElement(By.id("imagesrc"));
		uploadButton.sendKeys(filePath);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("test@gmail.com");
		Thread.sleep(1500);


		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("0777989387");

		Thread.sleep(1500);  


	}

	public static void skill_Country_DropdownMenu(WebDriver driver) throws InterruptedException {

		driver.findElement(By.id("Skills")).click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[5]")).click();
		System.out.println("Android is  selected");
		//countries dropdown

		driver.findElement(By.id("countries")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"countries\"]/option[15]")).click();
		System.out.println("Australia is  selected");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("India");
		System.out.println("India is  selected");

		//DOB Y:M:D
		driver.findElement(By.id("yearbox")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[77]")).click();

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[12]")).click();

		driver.findElement(By.id("daybox")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[15]")).click();


		driver.findElement(By.id("firstpassword")).sendKeys("12345");
		driver.findElement(By.id("secondpassword")).sendKeys("35235");

		driver.findElement(By.id("submitbtn")).click();
		//DOB Y:M:D method-2
		//		WebElement element = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		//		Select sel=new Select(element);
		//		
		//		sel.selectByVisibleText("Android");
		//		
		//		WebElement firstEle = sel.getFirstSelectedOption();
		//		System.out.println("first element = "+firstEle.getText());
		//		
		//		
		//		List<WebElement>listOption = sel.getOptions();
		//		for(WebElement webElement : listOption)  {
		//			
		//			System.out.println("option -"+webElement.getText());
		//			
		//		}
		//		
	}


	public static void radioBtnMethod(WebDriver driver) {

		//gender male radio btn method1
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();


		if(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).isSelected()==true) {

			System.out.println("First option is selected");
		}
	}



	public static void checkBoxesMethod(WebDriver driver) {

		//Clicking on check boxes
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();


		// and condition is true , when all are true, if not false 
		if(driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).isSelected()==true &&  driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).isSelected()==true){

			System.out.println("Hockey and Movie hobby selected");
		}

		// if any of them is true, whole statement become true 

		if(driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).isSelected()==true || driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).isSelected()==true){

			System.out.println("Hockey or   movie  hobby selected");

		} 

	}

	//DOB
	//		Select sel1 =new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
	//		sel1.selectByValue("2002");
	//		Thread.sleep(3000);
	//
	//		Select sel2 =new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
	//		sel2.selectByVisibleText("February");
	//		Thread.sleep(3000);
	//
	//
	//		Select sel3 =new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
	//		sel3.selectByValue("5");
	//		Thread.sleep(3000);

	//		WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
	//		WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	//		WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));

	//		
	//		Select select1=new Select(year);
	//		select1.selectByIndex(2010);

}


