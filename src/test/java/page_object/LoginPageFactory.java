package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    private final WebDriver driver;

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement loginField;
    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement loginButton;

    public LoginPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillUsername(String username) {
        loginField.sendKeys(username);
    }

    public void fillPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginField.click();
    }
}
