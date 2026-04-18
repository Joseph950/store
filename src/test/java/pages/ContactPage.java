package pages;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class ContactPage{

    public static Map<String, By> contactElements = new HashMap<>();

    static {
        contactElements.put("new_message", By.id("exampleModalLabel"));
        contactElements.put("close_button", By.xpath("//span[@aria-hidden='true']"));
    }
}
