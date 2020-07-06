package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage {
    @FindBy(css = "a.description")
    List<WebElement> productTitle;

    public void getProductTitle() {
        System.out.println(productTitle.size());
        for (int i = 0; i < productTitle.size(); i++) {
            String titleText = productTitle.get(i).getText(); //to get the title text
            if (titleText.contains("Table")) { //to check if the title contains the word "Table"
                System.out.println(titleText);
            } else {
                System.out.println("Every product doesn't contain the word 'Table' in it's title");
            }
        }
    }
    public void clickOnLastElement() {
        for (int i = 0; i < productTitle.size(); i++) {
            if (i == productTitle.size() - 1) { //to click on the last product of the page
                productTitle.get(i).click();
            }
        }
    }
}
