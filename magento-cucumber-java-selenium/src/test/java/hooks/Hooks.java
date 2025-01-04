package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private static WebDriver driver;
	
	@Before
	public void setUp() {
        System.out.println("Launching browser...");
        driver = new ChromeDriver(); // Initialize the WebDriver
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
    public static WebDriver getDriver() {
        return driver;
    }
	
}
