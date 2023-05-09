package Batch129.Tests.day25_ExcelUtils;

import Batch129.Utilis.utilies.ExcelUtils;
import org.testng.annotations.Test;


import java.io.FileNotFoundException;

public class C01_ExcelTest1 {

    @Test

    public void exceltest01() throws FileNotFoundException {
//        String path="src/test/java/resources/mysmoketestdata.xlsx";
//        String sayfa="customer_info";
//        ExcelUtils excelUtils=new ExcelUtils(path,sayfa);
//        System.out.println(excelUtils.getCellData(1, 0));

        //2/yol
        ExcelUtils excelUtilss = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        System.out.println(excelUtilss.getCellData(1, 0));
        String email = excelUtilss.getCellData(1,0);
        String password = excelUtilss.getCellData(1,1);
        System.out.println(email+" || "+password);
        System.out.println(excelUtilss.columnCount());//sutun sayisini verir

    }

}
