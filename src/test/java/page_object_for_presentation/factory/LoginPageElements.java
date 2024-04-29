package page_object_for_presentation.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class LoginPageElements {
    @FindBy(xpath = "//input[@data-test='username']")
    protected WebElement usernameField;
    @FindBy(xpath = "//input[@data-test='password']")
    protected WebElement passwordField;
    @FindBy(xpath = "//input[@data-test='login-button']")
    protected WebElement loginButton;

    public LoginPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
