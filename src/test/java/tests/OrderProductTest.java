package tests;

import driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object_for_presentation.*;

import java.time.Duration;

public class OrderProductTest {
    private final WebDriver driver = DriverFactory.getDriver();
    private final HeaderPage headerPage = new HeaderPage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final ProductsPage productsPage = new ProductsPage(driver);

    private final YourCartPage yourCartPage = new YourCartPage(driver);
    private final YourInformationPage yourInformationPage = new YourInformationPage(driver);
    private final OverviewPage overviewPage = new OverviewPage(driver);

    @Test
    public void testProductOrder() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        loginPage.login("standard_user", "secret_sauce");

        productsPage.clickAddBikeLightButton();

        headerPage.clickCartIcon();

        yourCartPage.clickCheckoutButton();

        yourInformationPage.fillFirstName("Elek");
        yourInformationPage.fillLastName("Teszt");
        yourInformationPage.fillPostalCode(1234);
        yourInformationPage.clickContinueButton();

        Assertions.assertEquals("Total: $32.39", overviewPage.getTotalPrice());
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }
}
