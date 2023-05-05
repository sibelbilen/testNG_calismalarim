package Batch129.Tests.ExcelUtils;

import Batch129.Utilis.ExcelUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class C01_ExcelTest01 {
    @Test
    public void test01() throws IOException {
        String path="src/test/java/Resources/mysmoketestdata.xlsx";
        String sayfa="customer_info";
        ExcelUtils excelUtils=new ExcelUtils(path,sayfa);
        excelUtils.getCellData(1,0);//1.satir 0.hucreyi getir bu excel utilis classidan aliyoruz bu methodla yapiyoruz




    }
}
