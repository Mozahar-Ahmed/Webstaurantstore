package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OrderPage extends CommonAPI {
    @FindBy(id = "buyButton")
    WebElement addToCart;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/button[1]")
    WebElement viewCart;

    public void clickOnAddToCart() {
        addToCart.click();
        Assert.assertEquals(viewCart.isDisplayed(), true, "Product didn't add to cart");
    }
    /*As the element is not interacted with, it throws ElementNotInteractableException.
    That's why Explicit wait is needed here*/
    public void waitUntilClickable(int seconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, seconds);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
    }

}
