package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ContactUsSteps {
    @Given("I am on the complain page of the web-shop application")
    public void i_am_on_the_complain_page_of_the_web_shop_application() {
        System.out.println("Step 1: Given I am on the complain page of the web-shop application");
    }
    // docString - no need to send multiple sendKeys
    @When("I enter the following details on the inquiry box")
    public void i_enter_the_following_details_on_the_inquiry_box(String docString) {
        System.out.println("Step 2: I enter the following details on the inquiry box");
        System.out.println(docString);
    }
}
