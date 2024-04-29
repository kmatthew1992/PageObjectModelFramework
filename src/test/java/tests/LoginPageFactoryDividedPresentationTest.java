package tests;

import driver.DriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object_for_presentation.factory.LoginPageController;
import page_object_for_presentation.factory.LoginPageElements;
import page_object_for_presentation.factory.LoginPageFactory;

public class LoginPageFactoryDividedPresentationTest {
    WebDriver driver = DriverFactory.getDriver();
    LoginPageController loginPageController = new LoginPageController(driver);
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");

        loginPageController.login("standard_user", "secret_sauce");
    }
}
