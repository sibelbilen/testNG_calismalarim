package Batch129.Tests.day24_Properties_Pages;

import Batch129.Pages.pages.OpenSourcePage;
import Batch129.Utilis.utilies.ConfigReader;
import Batch129.Utilis.utilies.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageKullanimi {
    //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim

    //kullaniciAdi, kullaniciSifre, submitButton elementlerini bul

    OpenSourcePage openSourcePage=new OpenSourcePage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("openSource_Url"));
        //        Yukardaki adres icin 20 adet test methodu olusturursak sonrasinda yukardaki url'de bir
//        degisiklik oldugunda butun test methodlarindan tek tek url duzeltmek yerine bir kere .properties
//        dosyamdan url'i duzeltirim ve bu bizim icin daha hizli daha duzenli ve daha kolay olur.
     openSourcePage.username.sendKeys(ConfigReader.getProperty("username"));
     openSourcePage.password.sendKeys(ConfigReader.getProperty("password"));
        openSourcePage.login.click();
        //Login Testini basarili oldugunu test et
        Assert.assertTrue(openSourcePage.dashboard.isDisplayed());
        Driver.closeDriver();
    }
}
