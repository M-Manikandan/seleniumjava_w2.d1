package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) {
		// download and attaching driver
		WebDriverManager.chromedriver().setup();
		// launch  chrome
		ChromeDriver driver = new ChromeDriver();
		// Navigating to URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximizing window
		driver.manage().window().maximize();
		// entering username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// pswd
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// click CRMFSA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click contact
		driver.findElement(By.linkText("Contacts")).click();
		// click Find contact
		driver.findElement(By.linkText("Find Contacts")).click();
		//xpath to click on email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//type mail id to search
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		//click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();

	}

}
