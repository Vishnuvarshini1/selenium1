package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select to = new Select(tool);
		to.selectByVisibleText("Puppeteer");
		
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		
	
		
		driver.findElement(By.id("j_idt87:city_label")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		
		driver.findElement(By.id("j_idt87:auto-complete")).click();
		
		
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.id("j_idt87:lang_1")).click();
		
		driver.findElement(By.id("j_idt87:value_label")).click();
		driver.findElement(By.id("j_idt87:value_3")).click();
		}

}
