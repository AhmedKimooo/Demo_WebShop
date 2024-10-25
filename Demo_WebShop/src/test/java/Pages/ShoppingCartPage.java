package Pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Shopping cart")
    WebElement goCart;

    @FindBy(css = "[name=\"updatecart\"]")
    WebElement update;


    public ShoppingCartPage goCart() {
        goCart.click();
        return this;
    }


    public ShoppingCartPage selectItem() throws InterruptedException {
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
        return new WishListPage(driver);
    }

    public ShoppingCartPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;


    }
}
