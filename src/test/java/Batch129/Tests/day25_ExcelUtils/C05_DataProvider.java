package Batch129.Tests.day25_ExcelUtils;

import Batch129.Pages.pages.BlueRentalPage;
import Batch129.Utilis.utilies.ConfigReader;
import Batch129.Utilis.utilies.Driver;
import Batch129.Utilis.utilies.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class C05_DataProvider {


    /*
            sam.walker@bluerentalcars.com   c!fas_art
            kate.brown@bluerentalcars.com   tad1$Fas
            raj.khan@bluerentalcars.com v7Hg_va^
            pam.raymond@bluerentalcars.com  Nga^g6!
            Verileri kullanarak bluerentalcar sayfasına login olalim
             */
    @DataProvider
    public static Object[][] blueRental() {
        return new Object[][]{{"sam.walker@bluerentalcars.com", "c!fas_art"},
                {"kate.brown@bluerentalcars.com", "tad1$Fas"}};
    }

    @Test(dataProvider = "blueRental")
    public void testdataprovider(String email, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }
     /*
        C05 class'ındaki task için her kullanıcı için doğrulama yapalım
        En son sayfayı kapalım
         */
}