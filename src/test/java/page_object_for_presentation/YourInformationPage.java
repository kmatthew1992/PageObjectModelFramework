package page_object_for_presentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage {
    private final WebDriver driver;
    private final By FIRST_NAME_FIELD_SELECTOR = By.xpath("//input[@data-test='firstName']");
    private final By LAST_NAME_FIELD_SELECTOR = By.xpath("//input[@data-test='lastName']");
    private final By POSTAL_CODE_FIELD_SELECTOR = By.xpath("//input[@data-test='postalCode']");
    private final By CONTINUE_BUTTON_SELECTOR = By.xpath("//input[@data-test='continue']");

    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFirstName(String firstname) {
        driver.findElement(FIRST_NAME_FIELD_SELECTOR).sendKeys(firstname);
    }

    public void fillLastName(String lastname) {
        driver.findElement(LAST_NAME_FIELD_SELECTOR).sendKeys(lastname);
    }

    public void fillPostalCode(int postalCode) {
        driver.findElement(POSTAL_CODE_FIELD_SELECTOR).sendKeys(String.valueOf(postalCode));
    }

    public void clickContinueButton() {
        driver.findElement(CONTINUE_BUTTON_SELECTOR).click();
    }
}
