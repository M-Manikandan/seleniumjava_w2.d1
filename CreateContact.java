package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// download and attaching driver
		WebDriverManager.chromedriver().setup();
		// launchine chrome
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
		// click create contact
		driver.findElement(By.linkText("Create Contact")).click();
		// type first name
		driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");
		// type surname
		driver.findElement(By.id("lastNameField")).sendKeys("Mohan");
		// click create contact button
		driver.findElement(By.name("submitButton")).click();
		// check title
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		// print first name
		// verify through company name
		String firstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First Name is " + firstName);
		//close the browser
		driver.close();

	}

}
