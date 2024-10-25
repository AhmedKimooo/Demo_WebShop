package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends BasePage {

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Computers")
    WebElement computer;
    @FindBy(css="[alt=\"Picture for category Desktops\"]")
    WebElement desktopsIcons;
    @FindBy(css="[alt=\"Picture of Build your own cheap computer\"]")
    WebElement selectPC;


    @FindBy(css="[id=\"product_attribute_72_5_18_52\"]")
    WebElement slowProcessor;
    @FindBy(css="[id=\"product_attribute_72_5_18_53\"]")
    WebElement mediumProcessor;
    @FindBy(css="[id=\"product_attribute_72_5_18_65\"]")
    WebElement fastProcessor;


    @FindBy(css="[id=\"product_attribute_72_6_19_91\"]")
    WebElement highRam;
    @FindBy(css="[id=\"product_attribute_72_6_19_54\"]")
    WebElement lowRam;
    @FindBy(css="[id=\"product_attribute_72_6_19_55\"]")
    WebElement mediumRam;


    @FindBy(css="[id=\"product_attribute_72_3_20_57\"]")
    WebElement mediumHDD;
    @FindBy(css="[id=\"product_attribute_72_3_20_58\"]")
    WebElement highHDD;



    @FindBy(css="[id=\"product_attribute_72_8_30_93\"]")
    WebElement imageViewer;
    @FindBy(css="[id=\"product_attribute_72_8_30_94\"]")
    WebElement officeSuit;
    @FindBy(css="[id=\"product_attribute_72_8_30_95\"]")
    WebElement otherOfficeSuit;

    @FindBy(css = "[data-val-number=\"The field Qty must be a number.\"]")
    WebElement qtyPlaceHolder;
    @FindBy(css = "[class=\"button-2 add-to-compare-list-button\"]")
    WebElement addToCompareList;
    @FindBy(css = "[id=\"add-to-cart-button-72\"]")
    WebElement addToCart;
    @FindBy(css = "[class=\"button-2 remove-button\"]")
    WebElement deleteFromCompareList;




    public ComputersPage goComputer() throws InterruptedException {

        Thread.sleep(1000);
        computer.click();
        Thread.sleep(1000);
        desktopsIcons.click();
        Thread.sleep(1000);
        selectPC.click();
        return this;
    }
    public ComputersPage selectProcessor() throws InterruptedException {
        Thread.sleep(1000);
        slowProcessor.click();
        Thread.sleep(1000);
        mediumProcessor.click();
        Thread.sleep(1000);
        fastProcessor.click();
        return this;

    }

    public ComputersPage selectRam() throws InterruptedException {
        Thread.sleep(1000);
        mediumRam.click();
        Thread.sleep(1000);
        lowRam.click();
        Thread.sleep(1000);
        highRam.click();

        return this;
    }

    public ComputersPage selectHDD() throws InterruptedException {
        Thread.sleep(1000);
        highHDD.click();
        Thread.sleep(1000);
        mediumHDD.click();
        return this;

    }

    public ComputersPage addOptions() throws InterruptedException {
        Thread.sleep(1000);
        imageViewer.click();
        Thread.sleep(1000);
        officeSuit.click();
        Thread.sleep(1000);
        otherOfficeSuit.click();
        return this;
    }
    public ComputersPage addQuantity(String Quantity) {
        qtyPlaceHolder.sendKeys(Quantity);
        return this;
    }

    public ComputersPage addToCompareList() {
        addToCompareList.click();
        return this;
    }

    public ComputersPage addToCart() {
        addToCart.click();
        return this;
    }

    public ElectronicsPage deleteFromCompareList() {
        deleteFromCompareList.click();
        return new ElectronicsPage(driver);

    }


    public ComputersPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;
    }


}
