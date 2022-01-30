package week2.day1;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.close();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//WebElement ElementUsername = driver.findElement(By.id("username"));
		//ElementUsername.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.id("password")).
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		
		driver.close();
		
		
				
	}
	

}
