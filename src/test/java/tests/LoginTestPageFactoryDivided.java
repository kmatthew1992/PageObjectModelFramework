package tests;


import driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.LoginPageController;
import page_object.LoginPageFactory;

public class LoginTestPageFactoryDivided {
    private final WebDriver driver = DriverFactory.getDriver();
    private final LoginPageController loginPage = new LoginPageController(driver);

    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage
                .fillUsername("standard_user")
                .fillPassword("secret_sauce")
                .clickLogin();
    }

    @Test
    public void invalidPasswordLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.fillUsername("standard_user");
        loginPage.fillPassword("secret");
        loginPage.clickLogin();
    }

    @Test
    public void invalidUsernameLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.fillUsername("standard");
        loginPage.fillPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

