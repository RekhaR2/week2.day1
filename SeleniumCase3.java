package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCase3 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RRR");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rekha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/25/85");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677201040");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rekha2ramesh@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("J2-206 SS");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Guduvancherry");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603202");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	
	}

}
