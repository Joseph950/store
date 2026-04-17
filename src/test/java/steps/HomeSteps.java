package steps;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
        elementsAreVisibles();
    }
}
