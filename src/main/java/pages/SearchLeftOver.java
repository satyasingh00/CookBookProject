package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchLeftOver {
WebDriver driver;
 
 public SearchLeftOver(WebDriver driver) {
	 this.driver = driver;
		PageFactory.initElements(driver, this);
}
 
 @FindBy(xpath = "//*[@class='menu_icon ons-icon fa-refrigerator fa']")
 private WebElement searchleft;
 
 @FindBy(xpath = "//ons-col[contains(text(),'Lunch')]")
 private WebElement SelectAppetizer;
 
// @FindBy(xpath = "//*[@id=\"app.search171846683948264933menu\"]/ons-page/div[2]/div/div[7]/ons-list/ons-list-item[2]/div/ons-row/ons-col[2]/ons-row/ons-col[1]")
// private WebElement SelectBreakfast;
// 
// @FindBy(xpath = "//*[@id=\"app.search171846683948264933menu\"]/ons-page/div[2]/div/div[7]/ons-list/ons-list-item[3]/div/ons-row/ons-col[2]/ons-row/ons-col[1]")
// private WebElement SelectDinner;
 
 @FindBy(xpath = "//i[@class='fa fa-check theme-action-text']")
 private WebElement SelectTick;

public WebElement getSearchleft() {
	return searchleft;
}

public WebElement getSelectAppetizer() {
	return SelectAppetizer;
}

//public WebElement getSelectBreakfast() {
//	return SelectBreakfast;
//}
//
//public WebElement getSelectDinner() {
//	return SelectDinner;
//}

public WebElement getSelectTick() {
	return SelectTick;
}
 
 public void SearchLeftOver() {
	 searchleft.click();
	 SelectAppetizer.click();
//	 SelectBreakfast.click();
//	 SelectDinner.click();
	 SelectTick.click();
	 
 }
 
 
 
 

}
