package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LogInPage;

public class SauceDemoTest extends BaseTest {
    @Test
    public void isLogoVisible() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.openLogInPage();
        logInPage.logIn();
        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.openAndSwitchToLinkedIn());
    }
}
