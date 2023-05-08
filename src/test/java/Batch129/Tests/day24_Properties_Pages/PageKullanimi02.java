package Batch129.Tests.day24_Properties_Pages;

import Batch129.Pages.pages.TestCenterTechproPage;
import Batch129.Utilis.utilies.ConfigReader;
import Batch129.Utilis.utilies.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageKullanimi02 {
    @Test
    public void test01() {
        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenterUrl"));
        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterTechproPage testCenterTechproPage = new TestCenterTechproPage();
        testCenterTechproPage.userName.sendKeys(ConfigReader.getProperty("kullaniciAdi"), Keys.TAB,
                ConfigReader.getProperty("kullaniciPassword"), Keys.ENTER);
        Assert.assertTrue(testCenterTechproPage.text.isDisplayed());
        //Sayfadan cikis yap ve cikis yapildigini test et
        testCenterTechproPage.logout.click();
        Assert.assertTrue(testCenterTechproPage.giris.isDisplayed());
    }
}