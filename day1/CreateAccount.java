package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();       
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//*[@id=\"groupNameLocal\"]")).sendKeys("varshini");
		driver.findElement(By.xpath("//*[@id=\"officeSiteName\"]")).sendKeys("DemoTest");
		driver.findElement(By.xpath("//*[@id=\"annualRevenue\"]")).sendKeys("high");
		Select I = new Select(driver.findElement(By.name("industryEnumId")));
		I.selectByValue("IND_SOFTWARE");
		Select o = new Select(driver.findElement(By.name("ownershipEnumId")));
		o.selectByVisibleText("S-Corporation");
		Select drop = new Select(driver.findElement(By.id("dataSourceId")));
		drop.selectByValue("LEAD_EMPLOYEE");
		Select c = new Select(driver.findElement(By.id("marketingCampaignId")));
		c.selectByIndex(5);
		Select S = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		S.selectByValue("TX");
		driver.findElement(By.xpath("//*[@id=\"ext-gen644\"]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
