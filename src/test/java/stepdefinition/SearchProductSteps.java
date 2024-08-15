package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {
    @Given("I navigate to amazon website")
    public void i_navigate_to_amazon_website() {
        System.out.println("Step1: Given I navigate to actimind website");
    }
    @When("I search for a product {string} with price {int}")
    public void i_search_for_a_product_with_price(String productName, Integer price) {
        System.out.println("Step2: When I search for a product"+"productName"+ "with price "+price);
    }
    @Then("I should see the product {string} is displayed")
    public void i_should_see_the_product_is_displayed(String productName) {
        System.out.println("Step3: Then I should see the product"+ productName+ "is displayed");

    }

}
