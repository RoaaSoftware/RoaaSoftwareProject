package sakankomsofttt;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LogIn {
	String u,p;
	TenantFunction l=new TenantFunction();
	boolean result;
	SignUp s=new SignUp();
	
@Given("that the tenant {string} is not logged in")
public void that_the_tenant_is_not_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("tenant tries to login")
public void tenant_tries_to_login() {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("username is {string} and password is {string}")
public void username_is_and_password_is(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    u=string;
    p=string2;
    result=l.searchTenantforLogIn(u, p);
	
   
	
	
}

@Then("the tenent login succeeds")
public void the_tenent_login_succeeds() {
    // Write code here that turns the phrase above into concrete actions
    assert(result);
}

@Then("the tenent is logged in")
public void the_tenent_is_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	
}

@Given("that the tenent {string} is not logged in")
public void that_the_tenent_is_not_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
   result=s.search(string);
}

@When("tenent tries to log in")
public void tenent_tries_to_log_in() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("the tenent login fails")
public void the_tenent_login_fails() {
    // Write code here that turns the phrase above into concrete actions
   // assertTrue(!result);
}

@Then("the tenent is not logged in")
public void the_tenent_is_not_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	 assertTrue(result);
}

@Given("that the admin {string} is not logged in")
public void that_the_admin_is_not_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("admin tries to log in")
public void admin_tries_to_log_in() {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("the admin login succeeds")
public void the_admin_login_succeeds() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the admin is logged in")
public void the_admin_is_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the admin login fails")
public void the_admin_login_fails() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the admin is not logged in")
public void the_admin_is_not_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    
}

}
