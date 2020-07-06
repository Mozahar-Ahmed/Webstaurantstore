package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "searchval")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='btn btn-info banner-search-btn']")
    WebElement searchButton;

    public void clickOnSearchField() {
        searchField.click();
    }
    public void typeOnSearchField(String value) {
        searchField.sendKeys(value);
    }
    public void clickOnSearchButton() {
        searchButton.click();
    }
}
