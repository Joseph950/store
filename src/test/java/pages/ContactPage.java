package pages;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class ContactPage{

    public static Map<String, By> contactElements = new HashMap<>();

    static {
        contactElements.put("new_message", By.id("exampleModalLabel"));
        contactElements.put("close_button", By.xpath("//span[@aria-hidden='true']"));
        contactElements.put("contact_email", By.xpath("//label[@for='recipient-name']"));
        contactElements.put("textbox_email", By.id("recipient-email"));
        contactElements.put("contact_name", By.xpath("//label[@for='recipient-name'][1]"));
        contactElements.put("textbox_name", By.id("recipient-name"));
        contactElements.put("label_message", By.xpath("//label[@for='message-text']"));
        contactElements.put("textbox_message", By.id("message-text"));
        contactElements.put("close_button2", By.xpath("//button[@data-dismiss='modal']"));
        contactElements.put("send_button", By.xpath("//button[@onclick='send()']"));
    }
}
