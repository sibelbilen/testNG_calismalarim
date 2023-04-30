package Batch129.Utilis;

import org.openqa.selenium.WebDriver;

public class Driver {
    //Driver classindaki temel mantik extends yontemiyle degil yani test base classina extents etmek yerine
    //Driver classimdam static methodlar kullanarak driver olustuurnuz.static oldugu icin class ismi ile her yerden methoda ulasabiliriz.

    /*
    SINGLETON PATTERN:TEKLI KULLANIM KALIBI.

    1-BIR classtan obje olusturmanin onune gecilmesi icin default constructor'i kullanimini engellemek icin
    private access modifire kullanarak bir constructor olustururuz.

     */

    private Driver(){

    }

    private static WebDriver driver;
        /*
              Driver'i her çağırdığında yeni bir pencere açılmasının önüne geçmek için
          if bloğu içinde Eğer driver'a değer atanmamışsa(driver doluysa) değer ata, Eğer değer atanmışsa Driver'i aynı
          sayfada RETURN et. Bunun sadece yapmamız gereken if(driver==null) kullanmak
           */



}
