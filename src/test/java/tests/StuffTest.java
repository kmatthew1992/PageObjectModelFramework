package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object_for_presentation.LoginPage;

public class StuffTest {
    private final WebDriver driver = new ChromeDriver();
    private LoginPage loginPage = new LoginPage(driver);

    @Test
    public void testStuff() {
        loginPage.login("standard_user", "secret_sauce");
    }
}
