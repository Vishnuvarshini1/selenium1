package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();       
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("varshini");
		Select drop = new Select(driver.findElement(By.name("dataSourceId")));
		drop.selectByVisibleText("Employee");
		Select s = new Select(driver.findElement(By.name("marketingCampaignId")));
		s.selectByValue("9001");
		Select o = new Select(driver.findElement(By.name("ownershipEnumId")));
		o.selectByIndex(4);
		Select c = new Select(driver.findElement(By.name("generalCountryGeoId")));
		c.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
