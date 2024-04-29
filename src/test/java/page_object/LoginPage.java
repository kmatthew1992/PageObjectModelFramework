package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By usernameField = By.xpath("//input[@data-test='username']");
    private final By passwordField = By.xpath("//input[@data-test='password']");
    private final By submit = By.xpath("//input[@data-test='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(submit).click();
    }
}
