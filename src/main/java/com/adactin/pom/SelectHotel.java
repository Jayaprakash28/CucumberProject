package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public static WebDriver driver;

	@FindBy(xpath = "(//input[@id='radiobutton_0'])")
    private WebElement click;
	
	@FindBy(xpath = "(//input[@id='continue'])")
	private WebElement Continue;
	


	public SelectHotel(WebDriver ldriver) {
		this.driver = ldriver;
		
		
     PageFactory.initElements(driver, this);
	}

	public WebElement getClick() {
		return click;
	}
	public WebElement getContinue() {
		return Continue;
	}
}
