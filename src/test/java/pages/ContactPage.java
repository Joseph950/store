package pages;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static configs.WebDriverManager.driver;

public class ContactPage implements MainPage{

    private static Map<String, By> contactElements = new HashMap<>();

    static {
        contactElements.put("new_message", By.id("exampleModalLabel"));
        contactElements.put("close_button", By.className("close"));
        contactElements.put("contact_email", By.xpath("//label[@textContent='Contact Email:']"));
    }

    @Override
    public void startBrowser() {

    }

    public void validateAllElements() {

        contactElements.forEach((nombreElemento, elemento)->{
            try{
                driver.findElement(contactElements.get(nombreElemento)).isDisplayed();
                System.out.println("Elemento " + nombreElemento + " es visible");
            } catch (RuntimeException e) {
                throw new RuntimeException("El elemento '" + nombreElemento + "' no es visible");
            }
        });
    }

    @Override
    public void makeClick(String elementName) {
        driver.findElement(contactElements.get(elementName)).click();
    }

}
