package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page_object.common.CommonController;

public abstract class LoginPageElements extends CommonController {
    @FindBy(xpath = "//input[@data-test='username']")
    WebElement loginField;
    @FindBy(xpath = "//input[@data-test='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@data-test='login-button']")
    WebElement loginButton;

    public LoginPageElements(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
