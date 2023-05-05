import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemoWebElements {

    WebDriver driver;
    WebElement loginButton = driver.findElement(By.id("login-button"));
    WebElement loginCredentials = driver.findElement(By.id("login_credentials"));
    WebElement loginButtonContainer = driver.findElement(By.id("login_button_container"));
    WebElement userNameForm = driver.findElement(By.name("user-name"));
    WebElement AddToCartBackpackButton = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
    WebElement BackToProductsButton = driver.findElement(By.name("back-to-products"));
    WebElement loginLogo = driver.findElement(By.className("login_logo"));
    WebElement loginWrapper = driver.findElement(By.className("login_wrapper"));
    WebElement bmBurgerButton = driver.findElement(By.className("bm-burger-button"));
    WebElement footer = driver.findElement(By.tagName("footer"));
    WebElement footerList = driver.findElement(By.tagName("ul"));
    WebElement backPackLink = driver.findElement(By.tagName("a"));
    WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
    WebElement bikeLightLink = driver.findElement(By.partialLinkText("Bike Light"));
    WebElement shoppingCartContainer = driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));
    WebElement headerLabel = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
    WebElement addToCartBikeButton = driver.findElement(By.xpath("//button[contains(@data-test, 'add-to-cart-sauce-labs-bike-light')]"));
    WebElement linkedInLink = driver.findElement(By.xpath("//a[contains(text(), 'LinkedIn')]"));
    WebElement itemPriceBar = driver.findElement(By.xpath("//div[@class='inventory_item_price']/ancestor::div"));
    WebElement continueShoppingButton = driver.findElement(By.xpath("//div/descendant::button[@data-test='continue-shopping']"));
    WebElement checkoutButton = driver.findElement(By.xpath("//button/following::button[@data-test='checkout']"));
    WebElement cartList = driver.findElement(By.xpath("//div[@class='cart_quantity_label']/parent::div"));
    WebElement inventoryItemPrice = driver.findElement(By.xpath("//button/preceding::div[@class='inventory_item_price']"));
    WebElement removeFromCartButton = driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-backpack' and @name ='remove-sauce-labs-backpack']"));
    WebElement logoOfApp = driver.findElement(By.cssSelector(".app_logo"));
    WebElement totalPriceInfo = driver.findElement(By.cssSelector(".summary_info_label.summary_total_label"));
    WebElement passwordForLogin = driver.findElement(By.cssSelector(".login_credentials_wrap-inner .login_password"));
    WebElement finishOrderingButton = driver.findElement(By.cssSelector("#finish"));
    WebElement errorMessageLogIn = driver.findElement(By.cssSelector("h3"));
    WebElement sortingFilters = driver.findElement(By.cssSelector("select.product_sort_container"));
    WebElement productsTitle = driver.findElement(By.cssSelector("[class=title]"));
    WebElement removeItemFromCartButton = driver.findElement(By.cssSelector("[class~='btn_small']"));
    WebElement nameAtoZsorting = driver.findElement(By.cssSelector("[value|='az']"));
    WebElement formOfLogin = driver.findElement(By.cssSelector("[class^=form]"));
    WebElement addToCartRedTShirt = driver.findElement(By.cssSelector("[data-test$='(red)']"));
    WebElement itemNames = driver.findElement(By.cssSelector("[class*='item_name']"));
    WebElement footerTwitter = driver.findElement(By.cssSelector("li:first-child"));
    WebElement footerLinkedIn = driver.findElement(By.cssSelector("li:nth-child(3)"));
}
