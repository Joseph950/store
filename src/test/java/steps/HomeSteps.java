package steps;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.HomeLocators;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomeSteps extends HomePage {

    @Given("start browser in home")
    public void startInHome() {
        startBrowser();
    }

    @Then("i must see the home page")
    public void homeIsVisible() {
        validateAllElements();
    }

    @When("i click on {string}")
    public void i_click_on_contact(String locator ) {
        makeClick(locator);
    }
    @Then("i must see the contact window")
    public void i_must_see_the_contact_window() {

    }
}
