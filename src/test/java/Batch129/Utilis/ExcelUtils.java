package Batch129.Utilis;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

import java.io.IOException;

public class ExcelUtils {
    Workbook workbook;
    Sheet sheet;
    String path;
    //constructor:Excel path'ine ve exceldeki sayfaya ulasmak icin 2 parametreli con.olusturduk
    public ExcelUtils(String path , String sheetName) throws IOException {
        this.path=path; //ben string yol belirleyecegim bu yol bu classtaki thisteki yol

        try {
            FileInputStream fis=new FileInputStream(path);
            workbook= WorkbookFactory.create(fis);
            sheet=workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (EncryptedDocumentException e) {
            throw new RuntimeException(e);
        }

}

//satir ve sutun sayilari girildiginde o hucredeki veriyi return eder.
public  String getCellData(int rowNum,int colNum){
    Cell cell=sheet.getRow(rowNum).getCell(colNum);
    return  cell.toString();
}
//exceldeki satir sayisini return eder.
    public  int rowCount(){
        return  sheet.getLastRowNum();
    }
    //exceldeki sutun sayisini return eder .
    //0 dan basladik cunku baslik oldugu icin
    public int columnCount(){
        return  sheet.getRow(0).getLastCellNum();
    }

}
