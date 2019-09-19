package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;
import PageObjects.SignInPageObj;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class StepDefination extends Base {

	WebDriver driver = Base.getDriver();
	SignInPageObj signObj = new SignInPageObj(driver);

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// driver=new ChromeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
		Thread.sleep(5000);
	}

	@Given("^Click on SignIn link to Open Signin Window$")
	public void click_on_signin_link_to_open_signin_window() throws Throwable {
		signObj.clickSignIn();

	}

	@Given("^Click on Google Sign Option$")
	public void click_on_Google_Sign_Option() throws Throwable {

		signObj.clickGoogle();

		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[@class='google_login']")).click();
		 * Thread.sleep(2000); System.out.println(driver.getTitle());//Print Main Title
		 * Set<String> windowIds= driver.getWindowHandles();
		 * System.out.println("Window Ids"+windowIds);//Print Window Ids
		 * Iterator<String> iter=windowIds.iterator(); String mainWindowID=iter.next();
		 * String childWindowID=iter.next(); driver.switchTo().window(childWindowID);
		 * Thread.sleep(5000); String s1=driver.getTitle();
		 * System.out.println(s1);//Print Child Title
		 * 
		 * if(s1==null) { driver.switchTo().window(mainWindowID);
		 * driver.findElement(By.xpath("//div[@class='google_login']")).click();
		 * driver.switchTo().window(childWindowID); } Thread.sleep(3000);
		 */

	}

	@When("^User enters \"([^\"]*)\" password \"([^\"]*)\" click on Login$")
	public void user_enters_something_password_something_click_on_login(String strArg1, String strArg2)
			throws Throwable {

		signObj.enterUserName(strArg1);
		signObj.clickUserNameNext();
		Thread.sleep(2000);
		signObj.enterPassword(strArg2);
		signObj.clickPassNext();
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(strArg1)
		 * ; driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(strArg2);
		 * driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 * Thread.sleep(2000);
		 */
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {

		signObj.click_HamburgerMenu();
		System.out.println("Login Successfull");
		Thread.sleep(3000);
		signObj.closeDriver();

	}

	@Then("^Verify that Login is Failed$")
	public void verify_that_Login_is_Failed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Login Failed");
		signObj.closeDriver();
	}

}
