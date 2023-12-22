package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelSheet {

	public static void main(String[] args) throws IOException {
		
		//1. Converting the physical representation of excel sheet into java representation
		FileInputStream fis = new FileInputStream("./Test data/ExcelData.xlsx");
		
		
		//2. reading the java representation of workbook or accessing the workbook
		Workbook workbook = WorkbookFactory.create(fis);
		
		//3. Accessing the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//4.Accessing the row
		com.lowagie.text.Row row = sheet.getRow(2);
		
		//5. Accessing the cell
		Object cell = row.getCell(0);
		//6. Converting cell type to string type
		String customer2 = cell.getStringCellValue();
		
		//6. Printing the data into the console
		System.out.println("The 2nd customer is :"+customer2);
		
		Object cell1 = row.getCell(1);
		long customer2PhoneNo = (long) cell1.getNumbericCellvalue();
		System.out.println(customer2PhoneNo);
		
		boolean statusOfCustomer2 = row.getCell(3).getBooleanCellValue();
		if(statusOfCustomer2)
		{
			System.out.println("Proceed");
		}
		else
			System.out.println("Don't Proceed");
		
		
		

	}

}
