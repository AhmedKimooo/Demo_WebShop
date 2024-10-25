package Pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends BasePage {


    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Wishlist")
    WebElement goWishList;

    @FindBy(css = "[value=\"Update wishlist\"]")
    WebElement update;


    public WishListPage goWishList() {
        goWishList.click();
        return this;
    }


    public WishListPage selectItem() throws InterruptedException {
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));


        for (WebElement checkbox : checkBoxes) {

            if (checkbox.isDisplayed() && checkbox.isEnabled() && !checkbox.isSelected()) {
                checkbox.click(); // Click the checkbox
            }
            Thread.sleep(1000);
        }

        return this;
    }

    public WishListPage update(){
        update.click();
        return this;
    }

    public WishListPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;


    }
}

