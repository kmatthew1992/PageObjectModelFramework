package tests;

import driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page_object_for_presentation.LoginPage;

public class LoginTestBys {
    private final WebDriver driver = DriverFactory.getDriver();
    private final LoginPage loginPage = new LoginPage(driver);
    private final By UN_BY = By.xpath("//input[@data-test='username']");
    private final By PW_BY = By.xpath("//input[@data-test='password']");
    private final By LOGIN_BY = By.xpath("//input[@data-test='login-button']");


    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void invalidPasswordLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_uce");

    }

    @Test
    public void invalidUsernameLoginTest() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standardr", "secret_sauce");


    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
