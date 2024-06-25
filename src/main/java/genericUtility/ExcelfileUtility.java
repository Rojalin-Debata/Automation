package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileUtility {
	
	public String readDatafromExcel(String Sheetname, int rownum, int cellnum) throws Throwable {
		FileInputStream fise= new FileInputStream(IconstantUtility.excelpath);
		Workbook Wb = WorkbookFactory.create(fise);
		String value = Wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
	}

}
