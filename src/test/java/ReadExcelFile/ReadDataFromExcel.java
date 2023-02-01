package ReadExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./src/data/RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//XSSFSheet my_sheet = workbook.getSheet("smokeTest");
		XSSFSheet my_sheet = workbook.getSheet("Student");
		
		
		int RowCount = my_sheet.getLastRowNum();
		
		int ColumnCount = my_sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row count are: " + RowCount);
		System.out.println("Columns Count are: " + ColumnCount);

		
		for (int i = 1; i <= RowCount; i++) {
			
			
			XSSFRow currentRow = my_sheet.getRow(i);
			
			
//			for (int j = 0; j < ColumnCount; j++) {
//				
//				currentRow.getCell(j).toString();
//				
//			}
			
			
			String firstName = currentRow.getCell(0).toString();
			String address = currentRow.getCell(4).toString();
			
			
			System.out.println("FirstName: " + firstName);
			System.out.println("Address: " + address);
			System.out.println("===================="+i+"====================");
			
		}
		
		
	}

}
