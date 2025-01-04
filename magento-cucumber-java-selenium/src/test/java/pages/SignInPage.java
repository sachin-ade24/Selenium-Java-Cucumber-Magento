package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	private WebDriver driver;
	private String expectedURL = "https://magento.softwaretestingboard.com/";
	private By headerTextElement;
	private By id;
	private By cssSel = By.cssSelector("span");
	
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    
	public WebElement findPageElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void navigateToTheHomepage() {
		driver.get(expectedURL);
		driver.getCurrentUrl().equals(expectedURL);
	}
	
	public void clickOnTheTextLink(String text) {
		headerTextElement = By.xpath("//header//a[contains(text(),'" + text + "')]");
		findPageElement(headerTextElement).click();
	}
	
	public void typeIntoTextbox(String idValue, String text) {
		this.id = By.id(idValue);
		findPageElement(id).sendKeys(text);
	}
	
	public void clickOnTheButtonUsingText(String idValue) {
		this.id = By.id(idValue);
		findPageElement(id).click();
	}
	
	public boolean verifyTheSpanText(String expectedText) {
		String text = findPageElement(cssSel).getText();
		return text.contains(expectedText);
	}
	
}
