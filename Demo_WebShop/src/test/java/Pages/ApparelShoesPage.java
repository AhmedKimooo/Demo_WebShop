package Pages;

import base.BasePage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelShoesPage extends BasePage {
    public ApparelShoesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apparel & Shoes")
    WebElement apparelShoes;


    @FindBy(css="[title=\"Show details for Blue and green Sneaker\"]")
    WebElement selectShoes;

    /*********************************************items**************************/
    @FindBy(css="[id=\"product_attribute_28_7_10\"]")
    WebElement selectSize;

    @FindBy(css ="[value=\"25\"]")
    WebElement selectSpecificSize;

    @FindBy(css="[name=\"addtocart_28.EnteredQuantity\"]")
    WebElement addQuantity;
    @FindBy(css="[class=\"button-1 add-to-cart-button\"]")
    WebElement addToCart;

    public ApparelShoesPage goAndAddApparelShoes(){
        apparelShoes.click();
        return this;

    }
    public ApparelShoesPage selectShoes(){
        selectShoes.click();
        return this;
    }
    public ApparelShoesPage selectSize(){
        selectSize.click();
        selectSpecificSize.click();
        return this;
    }
    public ApparelShoesPage addQuantity(String quantity){
        addQuantity.sendKeys(quantity);
        return this;
    }
    public ShoppingCartPage addToCArt(){
        addToCart.click();
        return new ShoppingCartPage(driver);
    }
    public ApparelShoesPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;
    }

}


