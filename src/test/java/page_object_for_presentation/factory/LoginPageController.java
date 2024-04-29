package page_object_for_presentation.factory;

import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {
    public LoginPageController(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        fillUsernameField(username);
        fillPasswordField(password);
        clickLoginButton();
    }

    private void fillUsernameField(String input) {
        usernameField.sendKeys(input);
    }

    private void fillPasswordField(String input) {
        passwordField.sendKeys(input);
    }

    private void clickLoginButton() {
        loginButton.click();
    }
}
