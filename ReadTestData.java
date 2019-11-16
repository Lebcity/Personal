import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTestData  {

    @Test
    public void readTestData() throws IOException {

        File source = new File("C:\\workspace\\fis\\PractiseProject\\src\\test\\java\\test_data\\TestDataFinal.xlsx");
         FileInputStream fis = new FileInputStream(source);
         XSSFWorkbook wb = new  XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);
        String Name2 = sheet1.getRow(1).getCell(0).getStringCellValue();
        System.out.println(Name2);
    }
}
