package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {
    @FindBy(css = "a.emptyCartButton.btn.btn-mini.btn-ui.pull-right")
    WebElement emptyCart;
    @FindBy(xpath = "//button[contains(text(),'Empty Cart')]")
    WebElement confirmEmptyCart;

    public void clickOnEmptyCart() {
        emptyCart.click();
    }
    public void clickOnConfirmEmptyCart() {
        confirmEmptyCart.click();
    }
}
