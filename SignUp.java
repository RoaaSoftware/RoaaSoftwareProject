package sakankomsofttt;
import static org.junit.Assert.assertTrue;
import java.io.*;
import java.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SignUp {
static TenantFunction t=new TenantFunction(); 
static Boolean found=false;

public static Boolean search(String u) {
	//Scanner id=new Scanner(System.in);
	//u=id.nextLine();
	if (t.addTenant(u)==false)
		return true;
	else 
		return false;
	
	
}

@Given("that the user {string} is  not logged in")
public void that_the_user_is_not_logged_in(String string) {
    // Write code here that turns the phrase above into concrete actions
   found=search(string);
}

@Given("they do not have an account in the system")
public void they_do_not_have_an_account_in_the_system() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the sign up succeeds")
public void the_sign_up_succeeds() {
    // Write code here that turns the phrase above into concrete actions
    assert(found);
}

@Then("the user is redirected to the login page")
public void the_user_is_redirected_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    
}


@Given("they have an account in the system")
public void they_have_an_account_in_the_system() {
    // Write code here that turns the phrase above into concrete actions
	
}

@Then("the sign up fails")
public void the_sign_up_fails() {
    // Write code here that turns the phrase above into concrete actions
	
	assertTrue(found);
}

@Given("they do have an account in the system")
public void they_do_have_an_account_in_the_system() {
    // Write code here that turns the phrase above into concrete actions
    
}



}
