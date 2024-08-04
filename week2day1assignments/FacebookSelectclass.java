package week2day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("ABCD");//Firstname
		driver.findElement(By.name("lastname")).sendKeys("EFGH"); //Surname
driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("abc@gmail.com"); // email input
    driver.findElement(By.xpath("//input[@aria-label=\'Re-enter email address\']")).sendKeys("abc@gmail.com");    
driver.findElement(By.id("password_step_input")).sendKeys("xyzabc@");
         WebElement daydd = driver.findElement(By.name("birthday_day")); //dropdown1 for date selection
         Select date = new Select(daydd);
         date.selectByValue("12");
         WebElement monthdd = driver.findElement(By.id("month")); //dropdown2 for month selection
         Select month = new Select(monthdd);
         month.selectByVisibleText("Dec");
         WebElement yeardd = driver.findElement(By.id("year")); // dropdown3 for year selection
         Select year = new Select(yeardd);
         year.selectByValue("2000");
         driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
         driver.findElement(By.xpath("(//button[contains(text(),'Sign Up')])[1]")).click();
         System.out.println("We require everyone to use the name that they use in everyday life – what their friends call them");
         
        
         
        
         
         
		
		
	}

}
