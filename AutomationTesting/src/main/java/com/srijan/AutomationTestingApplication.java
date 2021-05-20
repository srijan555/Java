package com.srijan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomationTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationTestingApplication.class, args);
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

		// Fetch the text "This is sample text." and print it on console
		// Use the class name of the div to locate it and then fetch text using
		// getText() method
		String sampleText = driver.findElement(By.className("col-md-12")).getText();
		System.out.println(sampleText);

		// Use the linkText locator method to find the link and perform click using
		// click() method
		driver.findElement(By.linkText("This is a link")).click();
		
		driver.navigate().back();

		// Click on the textbox and send value
		driver.findElement(By.id("fname")).sendKeys("JavaTpoint");

		// Clear the text written in the textbox
		driver.findElement(By.id("fname")).clear();

		// Click on the Submit button using click() command
		driver.findElement(By.id("idOfButton")).click();

		// Locate the radio button by id and check it using click() function
		driver.findElement(By.id("male")).click();

		// Locate the checkbooks by cssSelector and check it using click() function
		driver.findElement(By.cssSelector("input.Automation")).click();

		// Use Select class for selecting value from dropdown
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Automation Testing");

		// Close the Browser
		driver.close();

	}
}
