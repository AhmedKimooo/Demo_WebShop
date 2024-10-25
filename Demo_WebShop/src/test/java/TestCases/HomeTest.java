package TestCases;

import Pages.*;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {


 //-----------------------------------------------------------------------------------------------------------------------//


      @Test
    public void endToEndScript() throws InterruptedException {

          driver.get("https://demowebshop.tricentis.com/");


          BooksPage booksPage =new BooksPage(driver);
          booksPage.goToBook()
                  .selectBook().addQuantity("6")
                  .addToWishList().addToCart()
                  .addToCompareList()

                  .deleteFromCompareList()
                  .goComputer().selectProcessor().selectRam().selectHDD().addOptions().addQuantity("5")
                  .addToCart().addToCompareList()

                  .deleteFromCompareList().goAndAddElectronics().addCover().SelectCoverColour()
                  .changeColor().changeColor().changeColor()
                  .closeColourIcon()

                  .AddToCard()
                  .goAndAddApparelShoes().selectShoes().selectSize().addQuantity("6")

                  .addToCArt()
                  .sleep()
                  .goCart().selectItem().sleep()

                  .update()
                  .sleep().goWishList()
                  .selectItem().sleep().update();
          driver.quit();



    }

    @Test
    public void isPageComputers() throws InterruptedException {

        driver.get("https://demowebshop.tricentis.com/");


        ComputersPage computersPage =new ComputersPage(driver);
        computersPage.goComputer()
                .sleep()
                .selectProcessor()
                .sleep()
                .selectRam()
                .sleep()
                .selectHDD()
                .sleep()
                .addOptions()
                .addQuantity("5")
                .sleep()
                .addToCart()
                .sleep()
                .addToCompareList()
                .sleep()
                .deleteFromCompareList();



    }

    @Test
    public void isPageElectronics() throws InterruptedException {

        driver.get("https://demowebshop.tricentis.com/");


        ElectronicsPage electronicsPage =new ElectronicsPage(driver);
        electronicsPage
                .goAndAddElectronics()
                .sleep()
                .addCover()
                .sleep()
                .SelectCoverColour()
                .sleep()
                .changeColor().sleep().changeColor().sleep().changeColor()
                .sleep()
                .closeColourIcon()
                .sleep()
                .AddToCard();


    }

    @Test
    public void isPageApparelShoes() throws InterruptedException {

        driver.get("https://demowebshop.tricentis.com/");


        ApparelShoesPage apparelShoesPage =new ApparelShoesPage(driver);
        apparelShoesPage.goAndAddApparelShoes()
                .sleep()
                .selectShoes()
                .sleep()
                .selectSize()
                .sleep()
                .addQuantity("6")
                .sleep()
                .addToCArt();


    }


    @Test
    public void isCartWork() throws InterruptedException {

        driver.get("https://demowebshop.tricentis.com/");



        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage
                .goCart()
                .sleep()
                .selectItem()
                .sleep()
                .update();

        WishListPage wishListPage =new WishListPage(driver);
        wishListPage
                .goWishList()
                .sleep()
                .selectItem()
                .sleep()
                .update();


    }


    @Test
    public void isPagesTransactionWork() throws InterruptedException {


        driver.get("https://demowebshop.tricentis.com/");

        //book link
        driver.findElement(By.linkText("Books")).click();
        Thread.sleep(1000);
        //computers link
        driver.findElement(By.linkText("Computers")).click();
        Thread.sleep(1000);
        //desktops
        driver.findElement(By.linkText("Desktops")).click();
        Thread.sleep(1000);
        //notebook
        driver.findElement(By.linkText("Notebooks")).click();
        Thread.sleep(1000);
        //accessories
        driver.findElement(By.linkText("Accessories")).click();
        Thread.sleep(1000);
        //electronics link
        driver.findElement(By.linkText("Electronics")).click();
        Thread.sleep(1000);
        //camera photo
        driver.findElement(By.linkText("Camera, photo")).click();
        Thread.sleep(1000);
        //cell phones
        driver.findElement(By.linkText("Cell phones")).click();
        Thread.sleep(1000);
        //apparel &shoes
        driver.findElement(By.linkText("Apparel & Shoes")).click();
        Thread.sleep(1000);
        //digital downloads
        driver.findElement(By.linkText("Digital downloads")).click();
        Thread.sleep(1000);
        //jewelry
        driver.findElement(By.linkText("Jewelry")).click();
        Thread.sleep(1000);
        //gift cards
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(1000);

        driver.quit();


    }




}
