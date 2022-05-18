package automationflipkart_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class flipkart_Register
{
	WebDriver driver;
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\samee\\OneDrive\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
		 driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
  }
  
  @Test(priority=1)
  public void flipkart_register() throws InterruptedException 
  {
	  //URL
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[2]/div/form/div[1]/input")).sendKeys("ramagirineeharika@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[2]/div/form/div[2]/input")).sendKeys("Sri@1234");
	 Thread.sleep(10000);
	 
	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[4]/div/div[2]/div/form/div[2]/input")).click();
	 Thread.sleep(2000);
  }
  
	 
	 @Test(priority=2)
		public void smokeTesting() throws Exception 
		{
			//Create object of action class
			Actions a=new Actions(driver);
			
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div"));		
			
			int listsize=ls.size();
			System.out.println("No. of Modules:"+listsize);
			
			//for loop
			for(int i=1;i<=listsize;i++)
			{
				//wait
				Thread.sleep(2000);
				
				//Display modulename
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div["+i+"]")).getText());
				
				//perform MouseHover
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div["+i+"]"))).click().perform();
				
			}
		}
	 @Test(priority=3)
		public void product_Mobile() throws Exception 
		{
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Mobiles");
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
		}
				
	 
	
	
	 
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	  
  }

}
