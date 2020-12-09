package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static	WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Employee\\Dirvers\\chromedriver.exe");
				driver = new ChromeDriver(); 
			}else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\JAYAPRAKASH\\eclipse-workspace\\Employee\\Dirvers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}else {
				System.out.println("invalid browser name");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception	 e) {
			e.printStackTrace();
		} 
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void InputValuetoElement(WebElement element, String value) {
		       
		    try {
						
				element.sendKeys(value);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		    
			
	
		}
		public static void clickOnElement(WebElement element) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	
	

	public static void moveToElement(WebElement element) throws InterruptedException {
		Thread.sleep(1000);
		
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void selectDropDown(WebElement element, String value, String option){
	    
 		try {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			}else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
 
	}

	
	public static void getScreenshot(String filename) throws IOException {
		TakesScreenshot ts  = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);	
        File desFile = new File(System.getProperty("user.dir")+ "\\Screenshot\\" + filename +".png");
        FileUtils.copyFile(srcFile, desFile);
}
	
	public static void clickonElementUsingJs(WebElement element ) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element );
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
}
