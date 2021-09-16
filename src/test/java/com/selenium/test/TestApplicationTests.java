package com.selenium.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.Assertions;


@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vamsi Krishna Yepuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.stealmylogin.com/demo.html");
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		//WebElement login=driver.findElement(By.name("commit"));
		username.sendKeys("admin");
		password.sendKeys("password");
		//login.click();
		//String actualUrl="https://example.com/";
		//String expectedUrl= driver.getCurrentUrl();
		//Assertions.assertEquals(expectedUrl,actualUrl);
	}


}
