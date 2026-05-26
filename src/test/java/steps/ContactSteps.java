package steps;

import Utils.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;

public class ContactSteps {

    Utility utility = new Utility();

    @Then("i must see the contact window")
    public void areVisibleAllElements() {
        utility.validateAllElements(ContactPage.contactElements);
    }

    @When("i click on {string} in contact window")
    public void clickOn(String button) {
        utility.makeClick(button, ContactPage.contactElements);
    }

}
