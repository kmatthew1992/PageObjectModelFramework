package tests;

import driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestStrings {
    public static final String USERNAME_SELECTOR = "//input[@data-test='username']";
    public static final String PASSWORD_SELECTOR = "//input[@data-test='password']";
    public static final String LOGIN_BUTTON_SELECTOR = "//input[@data-test='login-button']";
    WebDriver driver = DriverFactory.getDriver();
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath(USERNAME_SELECTOR));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_SELECTOR));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON_SELECTOR));
        loginButton.click();
    }

    @Test
    public void invalidPasswordLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath(USERNAME_SELECTOR));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_SELECTOR));
        passwordField.sendKeys("secret_sau");
        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON_SELECTOR));
        loginButton.click();
    }

    @Test
    public void invalidUsernameLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath(USERNAME_SELECTOR));
        usernameField.sendKeys("standard");
        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_SELECTOR));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON_SELECTOR));
        loginButton.click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
