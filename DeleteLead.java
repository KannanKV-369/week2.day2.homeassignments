package week2.day2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	/*http://leaftaps.com/opentaps/control/main

	Delete Lead:
	1	Launch the browser
	2	Enter the username
	3	Enter the password
	4	Click Login
	5	Click crm/sfa link
	6	Click Leads link
	7	Click Find leads
	8	Click on Phone
	9	Enter phone number
	10	Click find leads button
	11	Capture lead ID of First Resulting lead
	12	Click First Resulting lead
	13	Click Delete
	14	Click Find leads
	15	Enter captured lead ID
	16	Click find leads button
	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	18	Close the browser (Do not log out)
	 */


	public static void main(String[] args) throws InterruptedException {
		//1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter First Name
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//Enter Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on Login Button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
				// 7	Click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				//8	Click on Phone
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				//9	Enter phone number
			//	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
			//	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("+91");
			//	driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("044");
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1");				
				//10	Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//11	Capture lead ID of First Resulting lead
				Thread.sleep(3000);
				String text = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a")).getText();
				System.out.println(text);
				//12	Click First Resulting lead
				WebElement findElement = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a"));
				findElement.click();

				//13	Click Delete
				driver.findElement(By.xpath("//a[text()='Delete']")).click();				
				//14	Click Find leads
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				Thread.sleep(3000);
				//15	Enter captured lead ID
				driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).click();				
				driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(text);
				//16	Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				//18	Close the browser (Do not log out)

//				driver.quit();

		
		
				 


	}

}
