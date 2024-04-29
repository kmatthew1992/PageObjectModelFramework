package page_object_for_presentation.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement usernameField;
    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement loginButton;

    public LoginPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
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
