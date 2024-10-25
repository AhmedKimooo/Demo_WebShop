package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends BasePage {
    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(linkText = "Electronics")
    WebElement electronics;


    @FindBy(css="[title=\"Show products in category Cell phones\"]")
    WebElement cellPhone;

    /*********************************************      items     **************************/

    @FindBy(css="[title=\"Show details for Phone Cover\"]")
    WebElement addCover;


    @FindBy(xpath="//img[@src=\"https://demowebshop.tricentis.com/content/images/thumbs/0000212_phone-cover_70.png\"]")
    WebElement selectCoverColour;

    @FindBy(css="[title=\"Next (Right arrow key)\"]")
    WebElement changeColor;

    @FindBy(css="[class=\"mfp-close\"]")
    WebElement closeColourIcons;

    @FindBy(css = "[id=\"add-to-cart-button-80\"]")
    WebElement addToCard;


    public ElectronicsPage goAndAddElectronics() throws InterruptedException {
        electronics.click();
        cellPhone.click();
        return this;
    }

    public ElectronicsPage addCover(){
        addCover.click();
        return this;
    }
    public ElectronicsPage SelectCoverColour(){
        selectCoverColour.click();
        return this;
    }

    public ElectronicsPage changeColor(){
        changeColor.click();
        return this;
    }
    public ElectronicsPage closeColourIcon(){
        closeColourIcons.click();
        return this;
    }

    public ApparelShoesPage AddToCard(){
        addToCard.click();
        return new ApparelShoesPage(driver);
    }
    public ElectronicsPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;
    }

}
