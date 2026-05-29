package Utils;

import configs.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;


public class Utility {

    WebDriver driver = WebDriverManager.getDriver();
    String url = "https://www.demoblaze.com/index.html";

    public void makeClick(String elementName, Map<String, By> pageElement) {
        try {
            Thread.sleep(1000);
            driver.findElement(pageElement.get(elementName)).click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void startBrowser() {
        driver.get(url);
    }

    public void validateAllElements(Map<String, By> pageElement) {

        pageElement.forEach((nombreElemento,elemento)->{
            try{
                Thread.sleep(500);
                driver.findElement(pageElement.get(nombreElemento)).isDisplayed();
                System.out.println("Elemento "+nombreElemento+" es visible");
            } catch (InterruptedException e) {
                throw new RuntimeException("El elemento '" + nombreElemento + "' no es visible");
            }
        });
    }

    public void encontrarElemento() {
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[@for='recipient-name']"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
