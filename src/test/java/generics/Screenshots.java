package generics;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	//created driver instance inside Screenshot class
	private WebDriver driver;
	
	
	//constructor for Screeshot class
	public Screenshots(WebDriver driver) {
		this.driver = driver;
	} 
	

	//method to take screenshot
	public void capture() throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File file1 = ts.getScreenshotAs(OutputType.FILE);
        File file2 = new File("C:\\Users\\LENOVO\\Documents\\Screenshot selenium1\\screenshot\\"+UUID.randomUUID().toString()+".png"); //uuid random number convert it into string
        FileUtils.copyFile(file1, file2);
    }
}


