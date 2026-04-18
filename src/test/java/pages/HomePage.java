package pages;

import configs.WebDriverManager;
import locators.HomeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.stream.Collectors;

public class HomePage {

    WebDriver driver = WebDriverManager.getDriver();
    String url = "https://www.demoblaze.com/index.html";

    public static Map<String, By> elementos = new HashMap<>();

    static{
        elementos.put("logo_store", By.xpath("//img[@src='blazemeter-favicon-512x512.png']"));
        elementos.put("title_store", By.id("nava"));
        elementos.put("home", By.xpath("//a[@href='index.html']"));
        elementos.put("contact", By.xpath("//a[@data-target='#exampleModal']"));
        elementos.put("about_us", By.xpath("//a[@data-target='#videoModal']"));
        elementos.put("cart", By.id("cartur"));
        elementos.put("log_in", By.id("login2"));
        elementos.put("sign_up", By.id("signin2"));
    }

    public void startBrowser() {
        driver.get(url);
    }

    public void validateAllElements() {

            elementos.forEach((nombreElemento,elemento)->{
                try{
                    driver.findElement(elementos.get(nombreElemento)).isDisplayed();
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

    public void makeClick(String nombreElemento){
        driver.findElement(elementos.get(nombreElemento)).click();
    }
}
