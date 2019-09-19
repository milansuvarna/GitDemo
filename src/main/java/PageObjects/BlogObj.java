package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogObj {
	
	WebDriver driver=null;
	
	By explore_title=By.xpath("//h2[@class='blog_title']");
	By click_blog=By.xpath("//div[@class='menu_text menu-1']");
	By searchbox=By.xpath("//input[@id='blog-title-search']");	
	By gmail_username=By.xpath("//div[@class='row']//div[1]//a[1]//div[1]//div[1]//img[1]");
	By hamburger_menu=By.xpath("//span[@class='menu-img-header']");
	
	public BlogObj(WebDriver driver)
	{
	this.driver=driver;
	}

	public void click_HamburgerMenu() throws InterruptedException
	{
		System.out.println("Blog Driver"+driver);
		WebElement waitForResult=(new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(hamburger_menu));
		System.out.println("click Hamburger Menu");
		driver.findElement(hamburger_menu).click();
		System.out.println("click Hamburger Menu");
		
	}
	
	public void click_Blog_Menu()
	{
		driver.findElement(click_blog).click();
	}
	
	public void refresh_page()
	{
		driver.navigate().refresh();
	}
	public String get_title()
	{
		return driver.getTitle();
		
	}
	public boolean verify_searchbox()
	{
		boolean search_value=driver.findElement(searchbox).isDisplayed();
		return search_value;
	}
	public boolean verify_explore()
	{
		boolean explore_value=driver.findElement(explore_title).isDisplayed();
		return explore_value;
	}

}
