package TestPages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.HomePage;
import pages.OrderPage;
import pages.ProductPage;

public class TestShop extends CommonAPI {
    HomePage homePage;
    ProductPage productPage;
    OrderPage orderPage;
    CheckOutPage checkOutPage;

    @BeforeMethod
    public void setPages() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        productPage = PageFactory.initElements(driver, ProductPage.class);
        orderPage = PageFactory.initElements(driver, OrderPage.class);
        checkOutPage = PageFactory.initElements(driver, CheckOutPage.class);
    }

    @Test
    public void validateShopFunctionality() {
        homePage.clickOnSearchField();
        homePage.typeOnSearchField("stainless work table");
        homePage.clickOnSearchButton();
        productPage.getProductTitle();
        productPage.clickOnLastElement();
        orderPage.clickOnAddToCart();
        orderPage.waitUntilClickable(5);
        checkOutPage.clickOnEmptyCart();
        checkOutPage.clickOnConfirmEmptyCart();
    }

}
