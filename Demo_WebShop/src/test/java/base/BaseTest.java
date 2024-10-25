package base;

import Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public  void  setup() {
        driver =  new DriverFactory().driverInitialize();

    }



//    @AfterMethod
//    public  void tearDown(){
//        driver.quit();
//    }


}
