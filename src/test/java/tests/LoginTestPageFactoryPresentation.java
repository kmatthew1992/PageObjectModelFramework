package tests;

import driver.DriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object_for_presentation.factory.LoginPageFactory;

public class LoginTestPageFactoryPresentation {
    WebDriver driver = DriverFactory.getDriver();
    LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");

        loginPageFactory.login("standard_user", "secret_sauce");
    }
}
