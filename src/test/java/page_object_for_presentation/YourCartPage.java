package page_object_for_presentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {
    private final WebDriver driver;
    private By CHECKOUT_BUTTON_SELECTOR = By.xpath("//button[@data-test='checkout']");

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckoutButton() {
        driver.findElement(CHECKOUT_BUTTON_SELECTOR).click();
    }
}
