package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {


    @FindBy(css="[class=\"ico-register\"]")
    WebElement registerIcon ;
   @FindBy(css = "[id=\"gender-male\"]")
    WebElement maleGender ;
    @FindBy(css = "[id=\"gender-female\"]")
    WebElement femaleGender ;
    @FindBy(css = "[id=\"FirstName\"]")
    WebElement firstName ;
    @FindBy(css = "[id=\"LastName\"]")
    WebElement lastName ;
    @FindBy(css = "[id=\"Email\"]")
    WebElement Email ;
    @FindBy(css = "[name=\"Password\"]")
    WebElement Password ;
    @FindBy(css = "[name=\"ConfirmPassword\"]")
    WebElement confirmPassword ;
    @FindBy(css="[name=\"register-button\"]")
    WebElement registerBtn;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage setRegisterIcon() {
        registerIcon.click();
        return this;
    }

    public RegisterPage setMaleGender() {
        maleGender.click();
        return this;
    }
    public RegisterPage setFemaleGender() {
        this.femaleGender.click();
        return this;
    }
    public RegisterPage setFirstName(String firstNamee) {
        firstName.sendKeys(firstNamee);
        return this;
    }
    public RegisterPage setLastName(String lastNamee) {
        lastName.sendKeys(lastNamee);
        return this;
    }
    public RegisterPage setEmail(String emaill) {
        Email.sendKeys(emaill);
        return this;
    }
    public RegisterPage setPassword(String passwordd) {
        Password.sendKeys(passwordd);
        return this;
    }
    public RegisterPage setConfirmPassword(String confirmPasswordd) {
        confirmPassword.sendKeys(confirmPasswordd);
        return this;
    }

    public RegisterPage sleep() throws InterruptedException {
        Thread.sleep(1000);
        return this;
    }
    public void setRegisterBtn(){
        registerBtn.click();
    }
}
