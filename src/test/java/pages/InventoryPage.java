package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.stream.Collectors;

public class InventoryPage extends BasePage {
    private By LINKEDIN = By.linkText("LinkedIn");
    private By LINKEDIN_LOGO = By.cssSelector("[data-test-id='nav-logo']");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean openAndSwitchToLinkedIn() {
        driver.findElement(LINKEDIN).click();
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(windows.stream().collect(Collectors.toList()).get(1));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LINKEDIN_LOGO));
        boolean isElementVisible = driver.findElement(LINKEDIN_LOGO).isDisplayed();
        return isElementVisible;
    }
}
