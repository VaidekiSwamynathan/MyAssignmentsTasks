package week2day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("crmsfa")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.id("accountName")).sendKeys("xyz123");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("90");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Account created successfully");
		Thread.sleep(2000);
		//driver.close();
        String title = driver.getTitle();
        if (title.equals(title)) {
        	System.out.println("title verified successfully");}
        	
        	else
        	{
        		System.out.println("Title verified unsuccessfully");
        }
        Thread.sleep(3000);
       
         driver.close();
         
         
		
		
		
		
		
		
		
		

	}

}
