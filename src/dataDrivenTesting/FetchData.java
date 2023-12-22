package dataDrivenTesting;

import java.io.FileInputStream;

public class FetchData {

	
		
		FileInputStream fis = new FileInputStream("./Test Data/GoogleTestCase.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}



