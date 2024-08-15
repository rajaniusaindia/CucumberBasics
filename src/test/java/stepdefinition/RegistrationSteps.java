package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.nio.file.FileSystemNotFoundException;
import java.util.List;
import java.util.Map;

public class RegistrationSteps {
    @Given("I am on the registration page of the application")
    public void i_am_on_the_registration_page_of_the_application() {
        System.out.println("Given: I am on the registration page of the application");
    }

    @Then("I enter data into the fields and click on submit button")
    public void i_enter_data_into_the_fields_and_click_on_submit_button(DataTable dataTable) {
        // For other transformations you can register a DataTableType.
        // Important - do not use asLIst() - will Fail
        List<List<String>> registrationData = dataTable.asLists();
        System.out.println("List: " + registrationData);

    }
    @When("I enter data into the field and click on submit")
    public void i_enter_data_into_the_field_and_click_on_submit(DataTable dataTable) {
        // Change argument => DataTable and add asMaps()
        // note it is mapping name valuse pair in output
        List<Map<String, String>> registrationData = dataTable.asMaps(String.class, String.class);
        System.out.println("Map: " + registrationData);

    }

    @Then("I should see the success message")
    public void i_should_see_the_success_message() {
        System.out.println("Then: I should see the success message");

    }

}
