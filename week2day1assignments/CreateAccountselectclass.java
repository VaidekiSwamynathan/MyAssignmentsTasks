package week2day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountselectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("crmsfa")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.id("accountName")).sendKeys("ABC123");
		//option1 declaration(industry software)
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select option1 = new Select(dropdown);
		option1.selectByValue("IND_SOFTWARE");
		//option 2 declaration(S-Corporation)
		WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(dropdown2);
		option2.selectByVisibleText("S-Corporation");
		//option3 declaration(employee)
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select option3 = new Select(dropdown3);
		option3.selectByValue("LEAD_EMPLOYEE");
		//option 4 declaration e-commerce
		WebElement dropdown4 = driver.findElement(By.id("marketingCampaignId"));
		Select option4 = new Select(dropdown4);
		option4.selectByIndex(6);
		//option 5 declaration Texas
		WebElement dropdown5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option5 = new Select(dropdown5);
		option5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		  System.out.println("Account created successfully");
		driver.findElement(By.xpath("//div[contains(text(),'Account Details')]")).click();
		System.out.println("title verified successfully");
		String accountname = driver.findElement(By.xpath("//span[contains(text(),'Account Name')]")).getText();
		System.out.println("the account name is " +accountname);
		if (accountname.contains("ABC123")) {
			System.out.println("the Account name is correct");
		}
	   
		else {
			System.out.println("the Account name is incorrect");
		}
	  
			
		String title = driver.getTitle();
        if (title.equals(title)) {
        	System.out.println("title verified successfully");}
        	
        	else
        	{
        		System.out.println("Title verified unsuccessfully");
        }
	}
}


