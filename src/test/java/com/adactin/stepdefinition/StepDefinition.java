package com.adactin.stepdefinition;



import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LogIn;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName: " + name );
		
	}
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("    ScenarioStatus: " + status );
		if (scenario.isFailed()) {
			getScreenshot(scenario.getName());
			
		}
		

	}
	
	@Given("^user launches the application$")
	public void user_launches_the_application() throws Throwable {
		String url = FileReaderManager.getInstance().getCortInstance().getUrl();
		getUrl(url);
		
		// driver = getBrowser("chrome");
		 //getUrl("http://adactinhotelapp.com/");
	    
	}

	@When("^user enters the valid \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_in_the_username_field(String username) throws Throwable {
		
		InputValuetoElement(pom.getLn().getUsername(), username);
		
	    
	}

	@When("^user enters valid \"([^\"]*)\" in the password field$")
	public void user_enters_valid_in_the_password_field(String password) throws Throwable {
		
		InputValuetoElement(pom.getLn().getPassword(), password);
	
	    
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		
		clickOnElement(pom.getLn().getLogin());
		
	    
	}

	@Then("^user verfies loginpage navigates to search hotel page$")
	public void user_verfies_loginpage_navigates_to_search_hotel_page() throws Throwable {
	    
	    
	}
	@When("^User select the location \"([^\"]*)\" as \"([^\"]*)\" in the select location field$")
	public void user_select_the_location_as_in_the_select_location_field(String location , String value) throws Throwable {
	   selectDropDown(pom.getSh().getLocation(), location , value );
	   
	}

	@When("^User select the Hotel \"([^\"]*)\" as \"([^\"]*)\" in the select hotel field$")
	public void user_select_the_Hotel_as_in_the_select_hotel_field(String hotel, String value) throws Throwable {
	   selectDropDown(pom.getSh().getHotels(), hotel , value);
	   
	}

	@When("^User select the room type \"([^\"]*)\" as \"([^\"]*)\" in the select room type field$")
	public void user_select_the_room_type_as_in_the_select_room_type_field(String roomtype, String value) throws Throwable {
	   selectDropDown(pom.getSh().getRoomtype(), roomtype , value);
	   
	}

	@When("^User select the number of room \"([^\"]*)\" as \"([^\"]*)\" in the select number of room field$")
	public void user_select_the_number_of_room_as_in_the_select_number_of_room_field(String numberofroom, String value) throws Throwable {
	   selectDropDown(pom.getSh().getNumberOfRoom(), numberofroom , value);
	   
	}

	@When("^User enter the check in date \"([^\"]*)\" in the select check in date$")
	public void user_enter_the_check_in_date_in_the_select_check_in_date(String checkindate) throws Throwable {
		InputValuetoElement(pom.getSh().getCheckInDate(), checkindate);
	   
	   
	}

	@When("^User enter the check out date \"([^\"]*)\" in the select check out date$")
	public void user_enter_the_check_out_date_in_the_select_check_out_date(String checkoutdate) throws Throwable {
	   InputValuetoElement(pom.getSh().getCheckOutDate(), checkoutdate);
	   
	}

	@When("^User select the adult per room \"([^\"]*)\" as \"([^\"]*)\" in the select adult per room$")
	public void user_select_the_adult_per_room_as_in_the_select_adult_per_room(String adultsperroom, String value) throws Throwable {
	   selectDropDown(pom.getSh().getAdultsPerRoom(), adultsperroom, value);
	   
	}

	@When("^User select the children per room \"([^\"]*)\" as \"([^\"]*)\" in the select children$")
	public void user_select_the_children_per_room_as_in_the_select_children(String childerperroom, String value) throws Throwable {
	   selectDropDown(pom.getSh().getChildrenPerRoom(), childerperroom, value);
	   
	}
	@When("^User click search button$")
	public void user_click_search_button() throws Throwable {
	    clickOnElement(pom.getSh().getSearch());
	}
	    
	@Then("^User verifies Search Hotel navigates page to Search Hotel page$")
	public void user_verifies_Search_Hotel_navigates_page_to_Search_Hotel_page() throws Throwable {
		
	   
	   }

	@When("^User makes hotel selection$")
	public void user_makes_hotel_selection() throws Throwable {
	   clickOnElement(pom.getSd().getClick());
	   
	}

	@When("^User click continue button$")
	public void user_click_continue_button() throws Throwable {
	   clickOnElement(pom.getSd().getContinue());
	   
	}

	@Then("^User verifies Select Hotel navigates page to Select Hotel page$")
	public void user_verifies_Select_Hotel_navigates_page_to_Select_Hotel_page() throws Throwable {
	   
	   
	}

	@When("^User enter the first name \"([^\"]*)\" in the first name field$")
	public void user_enter_the_first_name_in_the_first_name_field(String value) throws Throwable {
	   InputValuetoElement(pom.getBh().getFirstName(), value);
	   
	}

	@When("^User enter the last name \"([^\"]*)\" in the last name field$")
	public void user_enter_the_last_name_in_the_last_name_field(String value) throws Throwable {
	   InputValuetoElement(pom.getBh().getLastName(), value);
	   
	}

	@When("^User enter the billing address \"([^\"]*)\" in the billing address field$")
	public void user_enter_the_billing_address_in_the_billing_address_field(String value) throws Throwable {
	   InputValuetoElement(pom.getBh().getBillingAddress(), value);
	   
	}

	@When("^User enter the credit card no \"([^\"]*)\" in the credit card field$")
	public void user_enter_the_credit_card_no_in_the_credit_card_field(String value) throws Throwable {
	   InputValuetoElement(pom.getBh().getCreditCardNo(), value);
	   
	}

	@When("^User select the credit card type \"([^\"]*)\" as \"([^\"]*)\" in the credit card type field$")
	public void user_select_the_credit_card_type_as_in_the_credit_card_type_field(String creditcardtype, String value) throws Throwable {
	   selectDropDown(pom.getBh().getCreditCardType(), creditcardtype, value);
	   
	}

	@When("^User select the Expiry date \"([^\"]*)\" as \"([^\"]*)\" in the Expiry date field$")
	public void user_select_the_Expiry_date_as_in_the_Expiry_date_field(String expirydate, String value) throws Throwable {
	   selectDropDown(pom.getBh().getExpiryDate(), expirydate , value);
	   
	}

	@When("^User select the Expiry year \"([^\"]*)\" as \"([^\"]*)\"  in the Expiry year$")
	public void user_select_the_Expiry_year_as_in_the_Expiry_year(String expiryyear, String value) throws Throwable {
	   selectDropDown(pom.getBh().getExpiryYear(), expiryyear, value);
	   
	}

	@When("^User enter the cvv \"([^\"]*)\"  in the cvv field$")
	public void user_enter_the_cvv_in_the_cvv_field(String value) throws Throwable {
	   InputValuetoElement(pom.getBh().getCvv(), value);
	   
	}

	@When("^User clicks in the Booknow button$")
	public void user_clicks_in_the_Booknow_button() throws Throwable {
	   clickOnElement(pom.getBh().getBookNow());
	   
	}

	@Then("^User verifies Book Hotel navigates to Book Hotel page$")
	public void user_verifies_Book_Hotel_navigates_to_Book_Hotel_page() throws Throwable {
	   
	   
	}

	@When("^User click my itinerary button$")
	public void user_click_my_itinerary_button() throws Throwable {
	   clickOnElement(pom.getBi().getMyItinerary());
	   
	}

	@When("^User click logout button$")
	public void user_click_logout_button() throws Throwable {
	   clickOnElement(pom.getBi().getLogout());
	   
	}

	@Then("^User verifies Book Itinerary page navigates to Book Itinerary$")
	public void user_verifies_Book_Itinerary_page_navigates_to_Book_Itinerary() throws Throwable {
	   
	    
	}



	

}
