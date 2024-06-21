package Tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import generics.BaseTest;
import generics.Screenshots;
import pages.Login;
import pages.MealPlanner;
import pages.SearchLeftOver;
public class logintest extends BaseTest{
	
	
	
	Properties pr;
	Login lg;
	MealPlanner mp;
	SearchLeftOver slo;
	
	

	
	@Test (priority = 1, enabled = true)
	public void logintest() throws InterruptedException, IOException {
		pr = new Properties();
		lg = new Login(driver);
		Thread.sleep(3000);
		String mainWindowHandle = driver.getWindowHandle();
		lg.getClicklogin().click();
		Thread.sleep(3000);
		// Get all window handles
		Set<String> allWindowHandles = driver.getWindowHandles(); //list of all the windows
		Thread.sleep(3000);
		// Switch to the new window handle
		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		Thread.sleep(3000);
		lg = new Login(driver);
		Thread.sleep(3000);
		
		Screenshots screenshot = new Screenshots(driver); // DRIVER CLASS PASS KAR RHE screenshot ka object bana rhe hai aur ushme driver class object pass kar rhe hai
		screenshot.capture();
		
		lg.loginuser(uname,pname);
		Thread.sleep(5000);
		
	    driver.switchTo().window(mainWindowHandle);
	}
	
	@Test (priority = 2, enabled = true)
	public void MealPlanner() throws InterruptedException {
		pr = new Properties();
		mp = new MealPlanner(driver);
		Thread.sleep(3000);
		mp.getHomePage().click();
		Thread.sleep(2000);
		//clicking in next-button-1
		mp.getNextButton().click();
		Thread.sleep(2000);
		//clicking in next-button-2
		mp.getNextButton().click();
		Thread.sleep(2000);
		//clicking in next-button-3
		mp.getNextButton().click();
		Thread.sleep(2000);
		//4
		mp.getNextButton().click();
		Thread.sleep(2000);

		//5
		mp.getNextButton().click();
		Thread.sleep(2000);

		//6
		mp.getNextButton().click();
		Thread.sleep(2000);

		//7
		mp.getNextButton().click();
		Thread.sleep(2000);

		//8
		mp.getNextButton().click();
		Thread.sleep(2000);

		//9
		mp.getNextButton().click();
		Thread.sleep(2000);

		//10
		mp.getNextButton().click();
		Thread.sleep(2000);


		mp.getMealplanner().click();
		Thread.sleep(2000);
		mp.getAddthedate().click();
		Thread.sleep(2000);
		mp.getSelectrecipe().click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait 

	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Homemade Lemonade'])[1]")));
	       
		mp.getBerryAcaiBowl().click();
		Thread.sleep(2000);
		mp.getSelectdate().click();
		Thread.sleep(2000);
		mp.getDateSelected().click();
		Thread.sleep(2000);
		mp.getClickSet().click();
		Thread.sleep(2000);
		mp.getSelectbreakfast().click();
		Thread.sleep(2000);
		mp.getBreakfastSelected().click();
		Thread.sleep(2000);
		mp.getSavebutton().click();
	}
	
	@Test (priority = 3 ,enabled = true)
	public void SearchLeftOver() throws InterruptedException, IOException {
		Properties pr;
		slo = new SearchLeftOver(driver);
		
		
		
		Thread.sleep(3000);
		slo.getSearchleft().click();
		Thread.sleep(3000);
		slo.getSelectAppetizer().click();
		Thread.sleep(3000);
		
		Screenshots screenshot = new Screenshots(driver); //Object banaya 
		screenshot.capture();
		
		slo.getSelectTick().click();
		
		
		
		
	}
}






