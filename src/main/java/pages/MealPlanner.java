package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MealPlanner {
	WebDriver driver;
	
	public MealPlanner(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
//	@FindBy(xpath ="//body[1]/ons-navigator[1]/ons-page[1]/div[2]/ons-splitter[1]/ons-splitter-side[1]/ons-page[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ons-row[1]/ons-col[2]/div[1]/ons-icon[1]")
//	private WebElement homePage;
	
	@FindBy(xpath = "//div/ons-icon[@class='menu_icon ons-icon fa-home fa']")
	private WebElement homepage;
	
	@FindBy(xpath = "//body/ons-dialog[1]/div[2]/div[1]/div[1]/ons-row[1]/ons-col[2]/ons-button[1]")
	private WebElement nextButton;
	
	

	@FindBy(xpath = "(//*[@class='dash_menu_button'])[7]")
	private WebElement mealplanner;
	
	@FindBy(xpath = "//*[text()='Add']")
	private WebElement addthedate;
	
	@FindBy(xpath = "//*[text()='Select recipe']")
	private WebElement selectrecipe;
	
	@FindBy(xpath = "//body/ons-navigator[@id='masternavigator']/ons-page[1]/div[2]/ons-splitter[1]/ons-splitter-content[1]/ons-page[1]/div[2]/ons-navigator[1]/ons-page[2]/div[2]/rs-swiper-container[1]/div[1]/div[7]/div[1]/div[2]/ons-splitter[1]/ons-splitter-content[1]/ons-page[1]/div[2]/div[3]/div[1]/ons-list[2]/ons-list-item[2]/div[1]/ons-row[1]/ons-col[3]/span[2]")
	private WebElement BerryAcaiBowl; 
	
	@FindBy(xpath = "(//*[@class='ng-binding'])[2]")
	private WebElement selectdate;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[7]/div[1]/div[1]")
	private WebElement dateSelected;
	
	@FindBy(xpath = "//button[@class='mbsc-popup-button mbsc-popup-button-center mbsc-ltr mbsc-popup-button-flex mbsc-popup-button-close mbsc-reset mbsc-font mbsc-button mbsc-cb-material-dark mbsc-material mbsc-ltr mbsc-button-flat']")
	private WebElement clickSet;
	
	
	@FindBy(xpath = "//body/ons-dialog[@id='DiaryDayControllerScope']/div[2]/div[1]/div[2]/div[1]/ons-button[3]")
	private WebElement selectbreakfast;
	
	@FindBy(xpath = "//span[contains(text(),'Lunch')]")
	private WebElement breakfastSelected;
	
//	@FindBy(xpath = "//*[@id=\"select-serving-171843232204828677\"]")
//	private WebElement selectserving;
//	
//	@FindBy(xpath = "//*[@id=\"mobiscroll1718437341536\"]/div[3]/div[2]/div/div[41]")
//	private WebElement servingSelected;
//	
//	@FindBy(xpath = "//div[@class='mbsc-fr-btn1 mbsc-fr-btn-e mbsc-fr-btn']")
//	private WebElement clickset2;
//	
	

	@FindBy(xpath = "//*[@ng-click='saveDiaryDay();']")
	private WebElement savebutton;
	
	
	
	

	public WebElement getHomePage() {
		return homepage;
	}
	
	public WebElement getNextButton() {
		return nextButton;
	}
	
	public WebElement getMealplanner() {
		return mealplanner;
	}

	public WebElement getAddthedate() {
		return addthedate;
	}

	public WebElement getSelectrecipe() {
		return selectrecipe;
	}
	
	public WebElement getBerryAcaiBowl() {
		return BerryAcaiBowl;
	}


	public WebElement getSelectdate() {
		return selectdate;
	}
	
	public WebElement getDateSelected() {
		return dateSelected;
	}
	
	public WebElement getClickSet() {
		return clickSet;
	}

	public WebElement getSelectbreakfast() {
		return selectbreakfast;
	}
	
	public WebElement getBreakfastSelected() {
		return breakfastSelected;
	}

//	public WebElement getSelectserving() {
//		return selectserving;
//	}
//	
//	public WebElement getServingSelected() {
//		return servingSelected;
//	}
//	
//	public WebElement getClickset2() {
//		return clickset2;
	//}
		
	public WebElement getSavebutton() {
		return savebutton;
	}
	
	
	Select s;
	public void MealPlanner() {
		homepage.click();
		nextButton.click();
		mealplanner.click();
		addthedate.click();
		selectrecipe.click();
		BerryAcaiBowl.click();
		selectdate.click();
		dateSelected.click();
		clickSet.click();
		selectbreakfast.click();
		breakfastSelected.click();
//		selectserving.click();
//		servingSelected.click();
//		clickset2.click();
		savebutton.click();
		
	
		}
	}
	

	
    
	


