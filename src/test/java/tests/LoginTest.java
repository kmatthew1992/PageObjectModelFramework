package tests;

import driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {
    WebDriver driver = DriverFactory.getDriver();
    @Test
    public void validLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@data-test='username']"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();
    }

    @Test
    public void invalidPasswordLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@data-test='username']"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordField.sendKeys("secret_sau");
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();
    }

    @Test
    public void invalidUsernameLoginTest() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@data-test='username']"));
        usernameField.sendKeys("standard");
        WebElement passwordField = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
