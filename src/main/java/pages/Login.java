package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
 WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement clicklogin;
	
	//*[@id='email']"
	
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='current-password']")
	private WebElement password;
	//span[text()='Sign in']
	
	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement Signupbutton;
	
	
	public WebElement getUsername() {
		return username;
}
	public WebElement getpassword() {
		return password;
}
	public WebElement getSignupbutton() {
		return Signupbutton;
		
}
     public WebElement getClicklogin() {
		return clicklogin;
		
}

public void loginuser(String usernam,String passwod) throws InterruptedException {
		//clicklogin.click();
		
		username.sendKeys(usernam);
		password.sendKeys(passwod);
		
		Thread.sleep(2000);
		
		Signupbutton.click();
		
	}

}



