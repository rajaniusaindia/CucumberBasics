package stepdefinition;

import io.cucumber.java.en.*;

public class LoginPageSteps {

    @Given("I navigate to actimind website")
    public void i_navigate_to_actimind_website() {
        System.out.println("Given: I navigate to actimind website");
    }

    @When("I am on the login page of the application")
    public void i_am_on_the_login_page_of_the_application() {
        System.out.println("When: I am on the login page of the application");
    }

    @Then("I entered {string} username")
    public void i_entered_valid_username(String username) {
        System.out.println("Then: I entered "+username+" valid username");
    }

    @And("I entered {string} password")
    public void i_entered_valid_password(String password) {
        System.out.println("And: I entered "+password+"  password");
    }

    @And("I clicked on login button")
    public void i_clicked_login_button() {
        System.out.println("And: I clicked on login button ");
    }

    @Then("I {string} successfully logged in")
    public void i_should_be_successfully_logged_in(String status) {
        System.out.println("Then: I "+status+"  successfully logged in");
    }

}
