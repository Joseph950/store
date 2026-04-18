package pages;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class ContactPage {

    public static Map<String, By> elementos = new HashMap<>();

    static {
        elementos.put("new_message", By.id("exampleModalLabel"));
        elementos.put("close_button", By.className("close"));
    }
}
