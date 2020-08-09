package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondSelCuMa {
		
	@Given("i am in loign page")
	public void i_am_in_loign_page() {
		System.out.println("Given Executed");		
	}

	@When("i enter username and passwore")
	public void i_enter_username_and_passwore() {
		System.out.println("When Executed");
	}

	@Then("i move to dashboard")
	public void i_move_to_dashboard() {
		System.out.println("Then Executed");
	}

}
