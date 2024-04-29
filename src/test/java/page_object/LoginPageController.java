package page_object;

import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    public LoginPageController(WebDriver driver) {
        super(driver);
    }
    public LoginPageController fillUsername(String username) {
        loginField.sendKeys(username);
        return this;
    }

    public LoginPageController fillPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        loginField.click();
    }
}
