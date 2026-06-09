package pages;

import configs.WebDriverManager;
import locators.HomeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class HomePage {

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

}
