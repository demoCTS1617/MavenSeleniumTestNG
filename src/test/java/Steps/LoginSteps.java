package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//Comments

public class LoginSteps {
	
	
	@Given("user launch login page")
	public void user_launch_login_page() {
	   System.out.println("Launch Login application");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Enter credentials username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    System.out.println("Click on Login button");
	}

	@Then("dashboard will be display")
	public void dashboard_will_be_display() {
	    System.out.println("Dashboard displays....");
	}

	


}
