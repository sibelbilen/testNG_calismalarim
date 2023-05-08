package Batch129.Tests.ExcelUtils;

import Batch129.Utilis.utilies.ExcelUtils;
import org.testng.annotations.Test;

public class C02_BLueRentalEXcelTest {
    @Test
    public void testexcel() {
       ExcelUtils excelUtils=new ExcelUtils("src/test/java/Resources/mysmoketestdata.xlsx","customer_info");
        String email=excelUtils.getCellData(1,0);
        String password=excelUtils.getCellData(1,1);
        System.out.println(email+" ////////"+password);







    }
}
