package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {

	public static WebDriver driver;

	@FindBy(xpath = "(//input[@id='first_name'])")
	private WebElement FirstName;

	@FindBy(xpath = "(//input[@id='last_name'])")
	private WebElement LastName;

	@FindBy(xpath = "(//textarea[@class='txtarea'])")
	private WebElement BillingAddress;

	@FindBy(xpath = "(//input[@id='cc_num'])")
	private WebElement CreditCardNo;

	@FindBy(xpath = "(//select[@id='cc_type'])")
	private WebElement CreditCardType;

	@FindBy(xpath = "(//select[@id='cc_exp_month'])")
	private WebElement ExpiryDate;

	@FindBy(xpath = "(//select[@id='cc_exp_year'])")
	private WebElement ExpiryYear;

	@FindBy(xpath = "(//input[@id='cc_cvv'])")
	private WebElement Cvv;

	@FindBy(xpath = "(//input[@id='book_now'])")
	private WebElement BookNow;
	
	

	

	public BookHotel(WebDriver ldriver) {
		this.driver = ldriver;
		
		
		PageFactory.initElements(driver, this);

	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryDate() {
		return ExpiryDate;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
}
