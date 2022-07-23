package week2.day2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	/*
	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Female" 
	            ( A normal click will do for this step)
	 */	             


	public static void main(String[] args) {
		//Call WebDriverManager for the brower driver
		WebDriverManager.chromedriver().setup();
		//Lauch the brower Chrome
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add Implicity Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("KANNAN");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("K.V.");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9788288922");
		// Step 10: Enter the password
		driver.findElement(By.xpath("(//div[@class='placeholder']/following::div/input)[4]")).sendKeys("OmSairam");
		// Step 11: Handle all the three drop downs
		WebElement findElement = driver.findElement(By.name("birthday_day"));
		Select select = new Select(findElement);
		select.selectByValue("21");
		WebElement findElement2 = driver.findElement(By.name("birthday_month"));
		Select month = new Select(findElement2);
		month.selectByVisibleText("Jun");
		WebElement year = driver.findElement(By.id("year"));
		Select selectyear = new Select(year);
		selectyear.selectByValue("1905");				
		// Step 12: Select the radio button "Female" 
		            //( A normal click will do for this step)
		WebElement femaleradio = driver.findElement(By.xpath("//label[text()='Female']"));
		femaleradio.click();
		
			}

}
