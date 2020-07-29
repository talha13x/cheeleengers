package com.careerhack.stepdef;

import com.careerhack.common.FlightsBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Userregister extends FlightsBase{
	@Given("^i am on the flights homepage$")
	public void i_am_on_the_flights_homepage()  {
		launchbrowser();
	}

	 {
		
	}

	@When("^i nenter \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_nenter(String arg1, String arg2)  {
	    
	}

	@When("^i click sign in button$")
	public void i_click_sign_in_button() {
	    
	}

	@Then("^i am on the flight reservation page$")
	public void i_am_on_the_flight_reservation_page()  {
	    
	}



}
