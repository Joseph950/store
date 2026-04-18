package pages;

import configs.WebDriverManager;
import locators.HomeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class HomePage implements MainPage{

    WebDriver driver = WebDriverManager.getDriver();
    String url = "https://www.demoblaze.com/index.html";

    public static Map<String, By> homeElements = new HashMap<>();

    static{
        homeElements.put("logo_store", By.xpath("//img[@src='blazemeter-favicon-512x512.png']"));
        homeElements.put("title_store", By.id("nava"));
        homeElements.put("home", By.xpath("//a[@href='index.html']"));
        homeElements.put("contact", By.xpath("//a[@data-target='#exampleModal']"));
        homeElements.put("about_us", By.xpath("//a[@data-target='#videoModal']"));
        homeElements.put("cart", By.id("cartur"));
        homeElements.put("log_in", By.id("login2"));
        homeElements.put("sign_up", By.id("signin2"));
    }

    @Override
    public void startBrowser() {
        driver.get(url);
    }

    @Override
    public void validateAllElements() {

        homeElements.forEach((nombreElemento,elemento)->{
                try{
                    driver.findElement(homeElements.get(nombreElemento)).isDisplayed();
                    System.out.println("Elemento "+nombreElemento+" es visible");
                } catch (RuntimeException e) {
                    throw new RuntimeException("El elemento '" + nombreElemento + "' no es visible");
                }
            });
    }

    public void elementsAreVisiblesByEnum() {
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

    @Override
    public void makeClick(String elementName){
        driver.findElement(homeElements.get(elementName)).click();
    }
}
