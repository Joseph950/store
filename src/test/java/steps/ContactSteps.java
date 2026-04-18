package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;

public class ContactSteps {

    ContactPage contactPage = new ContactPage();

    @Then("i must see the contact window")
    public void areVisibleAllElements() {
        contactPage.validateAllElements();
    }

    @When("i click on {string} in contact window")
    public void clickOn(String button) {
        contactPage.makeClick(button);
    }
}
