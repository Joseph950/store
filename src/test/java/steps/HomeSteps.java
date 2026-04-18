package steps;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.HomeLocators;
import org.openqa.selenium.WebDriver;
import pages.ContactPage;
import pages.HomePage;

public class HomeSteps{

    HomePage homePage = new HomePage();

    @Given("start browser in home")
    public void startInHome() {
        homePage.startBrowser();
    }

    @Then("i must see the home page")
    public void homeIsVisible() {
        homePage.validateAllElements();
    }

    @When("i click on {string} in home")
    public void i_click_on_contact(String button) {
        homePage.makeClick(button);
    }

}
