package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;

	@FindBy(xpath = "(//select[@id='location'])")
	private WebElement Location;

	@FindBy(xpath = "(//select[@id='hotels'])")
	private WebElement hotels;

	@FindBy(xpath = "(//select[@id='room_type'])")
	private WebElement Roomtype;
	
	@FindBy(xpath ="(//select[@id='room_nos'])")
	private WebElement NumberOfRoom;

	
	@FindBy(xpath = "(//input[@id='datepick_in'])")
	private WebElement CheckInDate;

	@FindBy(xpath = "(//input[@id='datepick_out'])")
	private WebElement CheckOutDate;

	@FindBy(xpath = "(//select[@id='adult_room'])")
	private WebElement AdultsPerRoom;
	
	@FindBy(xpath = "(//select[@id='child_room'])")
	private WebElement ChildrenPerRoom;
	
	@FindBy(xpath = "(//input[@value='Search'])")
	private WebElement Search;

	public SearchHotel(WebDriver ldriver) {
		this.driver = ldriver;
		
		
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	public WebElement getNumberOfRoom() {
		return NumberOfRoom;
	}


	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getLocation() {
		return Location;
	}

}
