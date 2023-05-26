package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static constants.PageUrls.LOGIN_PAGE;

public class LogInPage extends BasePage {
    private By USER_NAME = By.id("user-name");
    private By PASSWORD = By.id("password");
    private By LOGIN_BUTTON = By.id("login-button");
    public LogInPage (WebDriver driver) {
        super(driver);
    }

    public void openLogInPage() {
        driver.get(LOGIN_PAGE);
    }

    public void logIn() {
        driver.findElement(USER_NAME).sendKeys(System.getProperty("username"));
        driver.findElement(PASSWORD).sendKeys(System.getProperty("password"));
        driver.findElement(LOGIN_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
}
