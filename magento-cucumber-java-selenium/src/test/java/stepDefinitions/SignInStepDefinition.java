package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SignInPage;
import hooks.Hooks;

public class SignInStepDefinition {

	private WebDriver driver;
	
	private SignInPage signIn;
	
	public void firstStep() {
		this.driver = Hooks.getDriver();
		this.signIn = new SignInPage(driver);
	}
	
	@Given("browser is opened")
	public void openTheBrowser() {
		firstStep();
        driver.manage().window().maximize();
	}
	
	@And("user navigates to homepage")
	public void signIn() {
		signIn.navigateToTheHomepage();
	}
	
	@When("user clicks on sign in")
	public void clickOnSignInText() {
		signIn.verifyTheSpanText("Sign In");
		signIn.clickOnTheTextLink("Sign In");
	}
	
	@Then("user is on login page")
	public void verifyThatTheUserIsOnLoginPage() {
		driver.getCurrentUrl().contains("/customer/account/login/");
	}
	
	@When("^user enters valid username (.*) and password (.*)$")
	public void enterUsernameAndPassword(String username, String password) {
		signIn.typeIntoTextbox("email", username);
		signIn.typeIntoTextbox("pass", password);
	}
	
	@Then("user is navigated to homepage")
	public void navigateToHomePage() {
		signIn.clickOnTheButtonUsingText("send2");
		signIn.verifyTheSpanText("welcome");
	}		
}
