/**
 * 
 */
package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author AGL
 *
 */
public class ActionKeywords {
	public static WebDriver driver;
	static String driverPath= "D:/Selenium/Drivers/geckodriver-v0.23.0-win64/geckodriver.exe";
	static String url="https://www.marutisuzuki.com";
	
	public static void initBrowser(){
		System.setProperty("webdriver.gecko.driver", driverPath);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Driver initalized");
	}
	
	public static void openBrowser(){
		driver= new FirefoxDriver();
	}
	
	public static void navigate() throws InterruptedException{
		driver.get(url);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icon-floating-menu")));
		driver.findElement(By.cssSelector(".icon-floating-menu")).click();
		Thread.sleep(20000);
		
	}
	public static void clickProfile() throws InterruptedException{
		driver.findElement(By.cssSelector(".utilityItems > li:nth-child(4) > a:nth-child(1) > span:nth-child(1)")).click();
	
	}
	public static void closeBrowser(){
		driver.quit();
	}
	

}
