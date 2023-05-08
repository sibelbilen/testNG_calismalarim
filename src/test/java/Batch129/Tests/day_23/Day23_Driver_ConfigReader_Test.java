package Batch129.Tests.day_23;

import Batch129.Utilis.utilies.ConfigReader;
import Batch129.Utilis.utilies.Driver;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertTrue;

public class Day23_Driver_ConfigReader_Test {
    @Test
    public void driverTest(){

        //https://techproeducation.com/ sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("techproeducation_url"));

        //Title testi yapınız
        assertTrue(Driver.getDriver().getTitle().contains("Techpro"));

        //sayfayı kapatınız.
        Driver.closeDriver();

    }
}
