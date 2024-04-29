package page_object.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class CommonElements {
    @FindBy(xpath = "dummy selector")
    protected WebElement dummyElement;

    public CommonElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
