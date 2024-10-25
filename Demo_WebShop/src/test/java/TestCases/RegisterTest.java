package TestCases;

import Pages.RegisterPage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void loginSuccessfully() throws InterruptedException {
        //register
        driver.get("https://demowebshop.tricentis.com/");

        RegisterPage registerPage =new RegisterPage(driver);
        registerPage
                .setRegisterIcon()
                .sleep()
                .setMaleGender()
                .sleep()
                .setFirstName("ahmed")
                .sleep()
                .setLastName("ahmed")
                .sleep()
                .setEmail("guasion123@gmail.com")
                .sleep()
                .setPassword("1234512")
                .sleep()
                .setConfirmPassword("1234512")
                .sleep()
                .setRegisterBtn();

        boolean isDisplayed =driver.findElement(By.cssSelector("[class=\"result\"]")).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.findElement(By.cssSelector("[value=\"Continue\"]")).click();

        driver.quit();
    }

    @Test
    public void loginWithNoGenderBug() throws InterruptedException {
        //register
        driver.get("https://demowebshop.tricentis.com/");

        RegisterPage registerPage =new RegisterPage(driver);
        registerPage
                .setRegisterIcon()
                .sleep()
                .setFirstName("ahmed")
                .sleep()
                .setLastName("ahmed")
                .sleep()
                .setEmail("ling123@gmail.com")
                .sleep()
                .setPassword("1234512")
                .sleep()
                .setConfirmPassword("1234512")
                .sleep()
                .setRegisterBtn();

        boolean isDisplayed =driver.findElement(By.cssSelector("[class=\"result\"]")).isDisplayed();
        Assert.assertTrue(isDisplayed);
        driver.findElement(By.cssSelector("[value=\"Continue\"]")).click();

        driver.quit();
    }

    @Test
    public void loginWithNoInfo() throws InterruptedException {
        //register
        driver.get("https://demowebshop.tricentis.com/");

        RegisterPage registerPage =new RegisterPage(driver);
        registerPage
                .setRegisterIcon()
                .sleep()
                .setFemaleGender()
                .sleep()
                .setFirstName("")
                .sleep()
                .setLastName("")
                .sleep()
                .setEmail("")
                .sleep()
                .setPassword("")
                .sleep()
                .setConfirmPassword("")
                .sleep()
                .setRegisterBtn();

/******************************************************************************************************
 * *****************************************************************************************************
 */
        //first name error msg
        boolean name =driver.findElement(By.cssSelector("[for=\"FirstName\"]")).isDisplayed();
        Assert.assertTrue(name);
        //first last error msg
        boolean last =driver.findElement(By.cssSelector("[for=\"LastName\"]")).isDisplayed();
        Assert.assertTrue(last);

        //first mail error msg
        boolean mail =driver.findElement(By.cssSelector("[for=\"Email\"]")).isDisplayed();
        Assert.assertTrue(mail);
        //first pass error msg
        boolean pass =driver.findElement(By.cssSelector("[for=\"Password\"]")).isDisplayed();
        Assert.assertTrue(pass);
        //first confirmPass error msg
        boolean confirmPass =driver.findElement(By.cssSelector("[for=\"ConfirmPassword\"]")).isDisplayed();
        Assert.assertTrue(confirmPass);

        driver.quit();



    }





}
