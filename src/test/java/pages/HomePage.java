package pages;

import configs.WebDriverManager;
import locators.HomeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    WebDriver driver = WebDriverManager.getDriver();
    String url = "https://www.demoblaze.com/index.html";

    public void startBrowser() {
        driver.get(url);
    }

    public void elementsAreVisibles() {

        List<HomeLocators> elementos = new ArrayList<>(Arrays.asList(HomeLocators.values()));

        for (HomeLocators element : elementos) {

            try{
                driver.findElement(element.get()).isDisplayed();
                System.out.println(element.name() + " es visible");
            }catch (Exception e){
                throw new RuntimeException(
                        "El elemento '" + element + "' no es visible"
                );
            }

        }
    }

    public void makeClick(HomeLocators locator) {
        driver.findElement(locator.get()).click();
    }
}
