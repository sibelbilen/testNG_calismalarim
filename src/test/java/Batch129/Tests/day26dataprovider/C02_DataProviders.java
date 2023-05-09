package Batch129.Tests.day26dataprovider;

import Batch129.Utilis.utilies.DataProviderUtils;
import org.testng.annotations.Test;

public class C02_DataProviders {
    @Test(dataProvider = "sehirVerileri",dataProviderClass = DataProviderUtils.class)
    public void test01(String ad,String bolge ,String plaka) {
        System.out.println(ad+"--"+bolge+"--"+plaka);
    }
@Test(dataProvider = "kullaniciBilgileri",dataProviderClass = DataProviderUtils.class)
    public void test2(String username,String password){
    System.out.println(username+"//////"+password);
}

}
