package Batch129.Tests.day26dataprovider;

import Batch129.Pages.pages.BlueRentalPage;
import Batch129.Utilis.utilies.ConfigReader;
import Batch129.Utilis.utilies.Driver;
import Batch129.Utilis.utilies.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_Dataprovider {
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{ConfigReader.getProperty("email")},{ConfigReader.getProperty("password01")},{ConfigReader.getProperty("email02")},{ConfigReader.getProperty("password02")}};
    }

    @Test(dataProvider = "kullanicilar")
    public void test01(String email,String password) {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}
