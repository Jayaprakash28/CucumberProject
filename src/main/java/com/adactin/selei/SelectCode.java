 package com.adactin.selei;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.BookHotel;
import com.adactin.pom.BookedItinerary;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.LogIn;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

import okhttp3.internal.connection.RouteSelector.Selection;

/*public class SelectCode extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		 driver = getBrowser("chrome");
		 getUrl("http://adactinhotelapp.com/");
		
		 
		 LogIn ln = new LogIn(driver);
		 InputValuetoElement(ln.getUsername(), "prakashr");
		 InputValuetoElement(ln.getPassword(), "673743");
		 clickOnElement(ln.getLogin());
		 
		 SearchHotel sh = new SearchHotel(driver);
		 selectDropDown(sh.getLocation(), "Brisbane", "value");
		 selectDropDown(sh.getHotels(), "Hotel Hervey", "value");
		 selectDropDown(sh.getRoomtype(),"Standard", "value");
		 selectDropDown(sh.getNumberOfRoom(), "2", "value");
		 InputValuetoElement(sh.getCheckInDate(), "21/12/2020");
		 InputValuetoElement(sh.getCheckOutDate(), "22/12/2020");
		 selectDropDown(sh.getAdultsPerRoom(), "3", "value");
		 selectDropDown(sh.getChildrenPerRoom(), "4", "value");
		 clickOnElement(sh.getSearch());
		 
		 SelectHotel sd = new SelectHotel(driver);
		 clickOnElement(sd.getClick());
	     clickOnElement(sd.getContinue());
	     
	     BookHotel bh = new BookHotel(driver);
	     InputValuetoElement(bh.getFirstName(), "Jaya");
	     InputValuetoElement(bh.getLastName(), "Prakash");
	     InputValuetoElement(bh.getBillingAddress(), "No:12th Block, Selva Nagar, Chennai");
	     InputValuetoElement(bh.getCreditCardNo(), "3216549873216549");
	     selectDropDown(bh.getCreditCardType(), "VISA", "value");
	     selectDropDown(bh.getExpiryDate(), "4", "value");
	     selectDropDown(bh.getExpiryYear(), "2013", "value");
	     InputValuetoElement(bh.getCvv(), "275");
	     clickOnElement(bh.getBookNow());
	     
	     BookedItinerary bi = new BookedItinerary(driver);
	     clickOnElement(bi.getMyItinerary());	 
	     clickOnElement(bi.getLogout());
	     
	        BookHotel bh = new BookHotel(driver);
	        InputValuetoElement(bh.getFirstName(), "Jaya");
	        InputValuetoElement(bh.getLastName(), "Prakash");
	        InputValuetoElement(bh.getBillingAddress(), "No:12th Block, Selva Nagar, Chennai");
	        InputValuetoElement(bh.getCreditCardNo(), "3216549873216549");
	        clickOnElement(bh.getCreditCardType());
	        selectDropDown(bh.getCreditCardType(), "VISA");
	        clickOnElement(bh.getExpiryDate());
	        selectDropDown(bh.getExpiryDate(), "4");
	        clickOnElement(bh.getExpiryYear());
	        selectDropDown(bh.getExpiryYear(), "2013");
	        InputValuetoElement(bh.getCvv(), "275");
	        clickOnElement(bh.getBookNow());
		
		SearchHotel sh = new SearchHotel(driver);
		clickOnElement(sh.getLocation());
	    selectDropDown(sh.getLocation(), "Brisbane");
		clickOnElement(sh.getHotels());
		selectDropDown(sh.getHotels(), "Hotel Hervey");
		clickOnElement(sh.getRoomtype());
		selectDropDown(sh.getRoomtype(), "Standard");
		clickOnElement(sh.getNumberOfRoom());
		selectDropDown(sh.getNumberOfRoom(), "2");
	    InputValuetoElement(sh.getCheckInDate(), "21/12/2020");
		InputValuetoElement(sh.getCheckOutDate(), "22/12/2020");
		clickOnElement(sh.getAdultsPerRoom());
		selectDropDown(sh.getAdultsPerRoom(), "3");
		clickOnElement(sh.getChildrenPerRoom());
		selectDropDown(sh.getChildrenPerRoom(), "4");
		clickOnElement(sh.getSearch());
	
	    SelectHotel sd = new SelectHotel(driver);
        clickOnElement(sd.getClick());
        clickOnElement(sd.getContinue());
        
        
       BookingConfirmation c= new BookingConfirmation(driver);
       selectDropDown(c.getOut(), "Logout");*/
        
	}
	
	
	

}
