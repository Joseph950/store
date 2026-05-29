package steps;

import Utils.Utility;
import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.HomeLocators;
import org.openqa.selenium.WebDriver;
import pages.ContactPage;
import pages.HomePage;

public class HomeSteps{

    Utility utility = new Utility();

    @Given("start browser in home")
    public void startInHome() {
        utility.startBrowser();
    }

    @Then("i must see the home page")
    public void homeIsVisible() {
        utility.validateAllElements(HomePage.homeElements);
    }

    @When("i click on {string} in home")
    public void i_click_on_contact(String button) {
        utility.makeClick(button,HomePage.homeElements);
    }

    @When("Encontrar elemento")
    public void find() {
        utility.encontrarElemento();
    }

}
