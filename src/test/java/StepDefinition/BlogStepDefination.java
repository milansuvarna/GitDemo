package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base.Base;
import PageObjects.BlogObj;
import PageObjects.SignInPageObj;

@RunWith(Cucumber.class)

public class BlogStepDefination extends Base {

	WebDriver driver = Base.getDriver();
	SignInPageObj signObj = new SignInPageObj(driver);
	BlogObj blog = new BlogObj(driver);

	@Given("^Navigate to \"([^\"]*)\" login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void navigate_to_something_login_with_username_something_and_password_something(String strArg1,
			String strArg2, String strArg3) throws Throwable {

		driver.get(strArg1);
		signObj.clickSignIn();
		signObj.clickGoogle();
		signObj.enterUserName(strArg2);
		signObj.clickUserNameNext();
		signObj.enterPassword(strArg3);
		signObj.clickPassNext();
		signObj.click_HamburgerMenu();
	}

	@When("^User click on Blog Link$")
	public void user_click_on_Blog_Link() throws Throwable {
		blog.click_Blog_Menu();
		blog.refresh_page();

	}

	@Then("^Open Blog Page$")
	public void open_blog_page() throws Throwable {
		String BlogTitle = blog.get_title();
		Assert.assertEquals("Burrp!", BlogTitle);
		System.out.println("Blog Title: "+BlogTitle);
		signObj.closeDriver();

	}

}
