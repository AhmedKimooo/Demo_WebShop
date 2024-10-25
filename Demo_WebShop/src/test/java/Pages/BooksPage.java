package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage extends BasePage {

    public BooksPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(linkText = "Books")
    WebElement gotoBook;

    @FindBy(css = "[alt=\"Picture of Health Book\"]")
    WebElement healthBook;

    @FindBy(css = "[id=\"addtocart_22_EnteredQuantity\"]")
    WebElement qtyPlaceHolder;
    @FindBy(css = "[id=\"add-to-wishlist-button-22\"]")
    WebElement addToWishList;

    @FindBy(css = "[class=\"button-2 add-to-compare-list-button\"]")
    WebElement addToCompareList;

    @FindBy(css = "[id=\"add-to-cart-button-22\"]")
    WebElement addToCart;

    @FindBy(css = "[class=\"button-2 remove-button\"]")
    WebElement deleteFromCompareList;


    public BooksPage goToBook() throws InterruptedException {
        gotoBook.click();
        return this;
    }

    public BooksPage selectBook() {
        healthBook.click();
        return this;
    }

    public BooksPage addQuantity(String Quantity) {
        qtyPlaceHolder.sendKeys(Quantity);
        return this;
    }

    public BooksPage addToWishList() {
        addToWishList.click();
        return this;
    }

    public BooksPage addToCompareList() {
        addToCompareList.click();
        return this;
    }

    public BooksPage addToCart() {
        addToCart.click();
        return this;
    }

    public ComputersPage deleteFromCompareList() {
        deleteFromCompareList.click();
        return new ComputersPage(driver);
    }

    public BooksPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;
    }

}
