package Batch129.Tests.day24_Properties_Pages;

import Batch129.Utilis.utilies.ConfigReader;
import Batch129.Utilis.utilies.Driver;
import org.testng.annotations.Test;

public class C01_ClassWord {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Driver.closeDriver();
        Driver.getDriver().get(ConfigReader.getProperty("techproed_url"));

    }
}
