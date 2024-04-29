package page_object_for_presentation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    private final WebDriver driver;
    private final By TOTAL_TEXT_SELECTOR = By.xpath("//div[@data-test='total-label']");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTotalPrice() {
        return driver.findElement(TOTAL_TEXT_SELECTOR).getText();
    }
}
