package scenario1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.Testbase.TestBase;

public class videoClick extends TestBase {
	
	public static SoftAssert assertion;

	public videoClick() {
		super();
	}

	@BeforeTest

	public void Setup() {

		initialization();

	}

	@Test(priority = 1)
	public static void NavigateBrowser()  {

		// //A[@class='o-Header__a-NavLink'][text()=' Shows ']
		

		WebElement showClick = driver.findElement(By.xpath("//*[@class='o-Header__a-NavLink'][1]"));
		WebElement clickvideo = driver.findElement(By.xpath("//A[contains(text(),'Deadliest Catch')]"));

		Hover(driver, showClick);
		Hover(driver, clickvideo);
		
		//MouseHoverAndClick(driver, showClick, clickvideo);

		String str = driver.findElement(By.xpath("//IMG[@class='o-ShowLead__a-Logo a-Logo']")).getAttribute("alt");
		 String txt1= driver.findElement(By.xpath("//IMG[@class='o-ShowLead__a-Logo a-Logo']")).getText();
		
		 assertion.assertEquals("Deadliest Catch", txt1, "matched");
		 System.out.println(txt1);
			
		assertion = new SoftAssert();
		
		assertion.assertEquals("Deadliest Catch", str, "Did not capture the title of video");
		System.out.println("The Video title is:" + str);
		assertion.assertAll();

		// Click on WatchNow button
		driver.findElement(By.xpath("//A[@href='https://go.discovery.com/tv-shows/deadliest-catch/']")).click();

		mouseHover = driver.findElement(By.xpath("//I[@class='flipIconCore__icon icon-plus flipIconCore__flip '][1]"));
		clickplus = driver.findElement(By.xpath("//I[@class='flipIconCore__icon icon-plus flipIconCore__flip '][1]"));

		MouseHoverAndClick(driver, mouseHover, clickplus);
		

		// navigate to myvideo and verify the video being added to my favourite list

	}


	@Test(priority = 2)
	public static void SecondVideo()  {

		driver.navigate().to("https://www.discovery.com/");

		WebElement showClick = driver.findElement(By.xpath("//*[@class='o-Header__a-NavLink'][1]"));
		WebElement clickvideo1 = driver.findElement(By.xpath(("//A[contains(text(),'Gold Rush')]")));

		Hover(driver, showClick);
		// Hover(driver, showClick);
		Hover(driver, clickvideo1);
		MouseHoverAndClick(driver, showClick, clickvideo1);
		
		String secondVideoTitle =driver.findElement(By.xpath("//IMG[@class='o-ShowLead__a-Logo a-Logo']")).getAttribute("alt");
		
		assertion.assertEquals("Deadliest Catch", secondVideoTitle, "Did not capture the title of video");
		System.out.println("The Second Video title is:" + secondVideoTitle);
		assertion.assertAll();

		// Click on WatchNow button
		driver.findElement(By.xpath("//A[@class='o-ShowLead__a-Button a-Button'][1]")).click();

		 mouseHover = driver.findElement(By.xpath("//I[@class='flipIconCore__icon icon-plus flipIconCore__flip '][1]"));
		 clickplus = driver.findElement(By.xpath("//I[@class='flipIconCore__icon icon-plus flipIconCore__flip '][1]"));

		MouseHoverAndClick(driver, mouseHover, clickplus);

	
	}

}
