package Practise_Exer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import dev.failsafe.internal.util.Assert;

public class Lanch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_JavaPrograms\\Selenium-Server_Jar\\chromedriver.exe");

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
