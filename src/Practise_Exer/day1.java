package Practise_Exer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
@Test
public void dataProvider() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	WebElement move=driver.findElement(By.xpath("//input[@type='text']"));
	a.moveToElement(move).sendKeys("testing").doubleClick().build().perform();
	Thread.sleep(3000);
	String s=driver.findElement(By.xpath("(//span[text()='testing'])[1]")).getText();
	
	driver.close();
}



}
