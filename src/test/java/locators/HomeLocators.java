package locators;

import org.openqa.selenium.By;

public enum HomeLocators {
    LOGO_STORE(By.xpath("//img[@src='blazemeter-favicon-512x512.png']")),
    TITLE_STORE(By.id("nava")),
    HOME(By.xpath("//a[@href='index.html']")),
    CONTACT(By.xpath("//a[@data-target='#exampleModal']")),
    ABOUT_US(By.xpath("//a[@data-target='#videoModal']")),
    CART(By.id("cartur")),
    LOG_IN(By.id("login")),
    SIGN_UP(By.id("signin2"));

    private By locator;

    HomeLocators(By locator) {
        this.locator = locator;
    }

    public By get() {
        return locator;
    }
}
