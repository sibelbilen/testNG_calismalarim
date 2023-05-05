package Batch129.Tests.ExcelUtils;

import Batch129.Utilis.ExcelUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class C01_ExcelTest01 {
    @Test
    public void test01() {
        ExcelUtils excelUtilss = new ExcelUtils("src/test/java/Resources/mysmoketestdata.xlsx","customer_info");
        System.out.println(excelUtilss.getCellData(1, 0));
        String email = excelUtilss.getCellData(1,0);
        String password = excelUtilss.getCellData(1,1);
        System.out.println(email+" || "+password);
        System.out.println(excelUtilss.columnCount());//sutun sayisini verir


    }
}
