package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.BookedItinerary;
import com.adactin.pom.LogIn;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LogIn ln;
	private SearchHotel sh;
	private SelectHotel sd;
	private BookHotel bh;
	private BookedItinerary bi;
	
	

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		  
	}
	
	public LogIn getLn() {
		return new LogIn(driver);
	}
	public SearchHotel getSh() {
		return new SearchHotel(driver);
	}

	public SelectHotel getSd() {
		return new SelectHotel(driver) ;
	}

	public BookHotel getBh() {
		return new BookHotel(driver) ;
	}

	public BookedItinerary getBi() {
		return new BookedItinerary(driver);
	}
	
	
	

}
