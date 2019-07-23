package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import com.qa.Testbase.TestBase;

public class VideoClickObjects extends TestBase {

	// pageFactory -OR

	@FindBy(xpath = "//*[@class='o-Header__a-NavLink'][1]")
	 WebElement showClick;

	// A[@class='o-Header__a-NavLink'][text()=' Shows ']

	@FindBy(xpath = "//A[contains(text(),'Deadliest Catch')]")
	 WebElement clickvideo;
	
	

	public static void MouseHoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {

		Actions act = new Actions(driver);
		act.moveToElement(elementToHover).click(elementToClick).build().perform();

		//driver.switchTo().defaultContent();

	}

	public static void Hover(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}
}