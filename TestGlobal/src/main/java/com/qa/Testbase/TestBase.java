package com.qa.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.TestUtils.TestUtils;

public  class TestBase {
	public static WebDriver driver;
	public static Properties prop; //global variable 
	public static WebElement mouseHover;
	public static WebElement clickplus;
	
	 
	public TestBase() {
		
		try {
			prop = new Properties();
			
			//specify the configproperties path
			FileInputStream  ip= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestGlobal\\src\\main\\java\\com\\qa\\configuration\\config.properties");
		
			prop.load(ip);
				
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
			
		}
	}
	
		public static void initialization() {
			  
			 String browsername = prop.getProperty("browser");
			 
			 if (browsername.equals("chrome")) {
				  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\SeleniumVideo\\Driver\\chromedriver_win32\\chromedriver.exe"); 
				 
				  driver = new ChromeDriver();
			 
			 }
			 
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			 
			 driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
			 
			 
			  }
		
			
			
			
		 public static void MouseHoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
			 
			 Actions act= new Actions(driver);
			 act.moveToElement(elementToHover).click(elementToClick).build().perform();
			 
		 }
		
		
		public static void Hover(WebDriver driver,WebElement element) {
			
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
				
			
		}
		
		
}

