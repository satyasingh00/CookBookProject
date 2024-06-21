package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	protected String uname;
	protected String pname;
	
	@BeforeClass
    public void setUp() throws IOException {
		driver = new ChromeDriver();
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\CookBookProject\\src\\test\\resources\\config.properties");
		pr.load(fis);
		String url = pr.getProperty("url");
		uname =pr.getProperty("user");
		pname =pr.getProperty("pass");
		
		
        driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
    }
	
	@AfterClass
	public void teardown() {
		//if(driver != null) {
		driver.quit();
		

}
}
