package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public static WebDriver getDriver()
	{

		String path=System.setProperty("webdriver.chrome.driver", "//Users//milan//Desktop//setup//ChromeDriver//chromedriver");

		return driver=new ChromeDriver();
	}
	

}
