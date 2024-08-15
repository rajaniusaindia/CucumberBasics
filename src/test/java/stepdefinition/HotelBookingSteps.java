package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelBookingSteps {
    @Given("I navigate to booking website")
    public void i_navigate_to_booking_website() {
    System.out.println("Given: I navigate to booking website");
    }

    @When("I select the room type as {string}")
    public void i_select_the_room_type_as(String roomType) {
    System.out.println("When: I select the room type as: "+ roomType);
    }

    @When("I select the check-in date as {string} and check-out date as {string}")
    public void i_select_the_check_in_date_as_and_check_out_date_as(String checkIn, String checkOut) {
        System.out.println("When: I select the check-in date as " +  checkIn + "and check-out date as " + checkOut);
    }

    @When("I choose no of guests as {int}")
    public void i_choose_no_of_guests_as(Integer noGuests) {
        System.out.println("When: I choose no of guests as " +  noGuests);
    }

    @Then("I should see {string} message with {int} as booking id")
    public void i_should_see_confirmed_message_with_as_booking_id(String status, Integer bookingID) {
        System.out.println("Then: I should see " + status + " message with " +  bookingID + "as booking id");

    }

}
