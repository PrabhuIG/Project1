 package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver ChromeDriver() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    return driver;
	}
	
	public static WebDriver fireFox()  {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		return driver;
		
	}
	public static WebDriver browserLaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			}
			
	
		
else if (browsername.equalsIgnoreCase("Edge")) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
}
		return driver;
		
	}
	public static void browseName(String browsername) {
		switch(browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		default:
			System.err.println("Invalid browser name");
		}
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
		public static void implicitWait(int seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
		public static void sendKeys(WebElement e, String value) {
			e.sendKeys(value);
			
		}
		public static void click(WebElement e) {
			e.click();
		}
		public static String getCurrenturl() {
			return driver.getCurrentUrl();
		}
		public static String getTitle() {
			return driver.getTitle();
		}
		public static String getText(WebElement e) {
			return e.getText();
		}
		public static String getAttribute(WebElement e) {
			return e.getAttribute("value");
		}
		public static void moveToElement(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
		}
		public static void dragAndDrop(WebElement source,WebElement target) {
			Actions a=new Actions(driver);
			a.dragAndDrop(source, target).perform();
		}
		public static void doubleClick(WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
		}
		public static void doubleClick() {
			Actions a=new Actions(driver);
			a.contextClick().perform();
		}
		public static void contextClick(WebElement target ) {
			Actions a=new Actions(driver);
			a.contextClick(target).perform();
			
		}
		public static void contextClick() {
			Actions a=new Actions(driver);
			a.contextClick().perform();
		}
		public static void release() {
			Actions a=new Actions(driver);
			a.release().perform();
		}
		public static void release(WebElement target) {
		Actions a=new Actions(driver);
		a.release(target).perform();
		}
		public static void clickAndHold() {
			Actions a=new Actions(driver);
			a.clickAndHold().perform();
		}
		public static void clickAndHold(WebElement target) {
			Actions a=new Actions(driver);
			a.click(target).perform();
		}
		
		
		public static void quit() {
			driver.quit();
		}
		public static void keypress(int keycode) throws AWTException {
			Robot r=new Robot();
			r.keyPress(keycode);
		}
		public static void keyrelease(int keycode) throws AWTException {
			Robot r=new Robot();
			r.keyRelease(keycode);

		}
		public static void selectByIndex(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);
			
		}
		public static void selectByValue(WebElement e,String value) {
			Select s=new Select(e);
			s.selectByValue(value);
			
			
		}
		
		public static void findelements(char i, String path) {
		List<WebElement> findElements = driver.findElements(By.xpath(path));
		WebElement webElement = findElements.get(i);
		String text = webElement.getText();
		System.out.println(text);
		}
		
		
	
	
		
			
		}
		
		
		
		
		

		
		
		
	
	
	
	


