package classTest;

import java.io.FileInputStream;

public class FetchData {

	public static void main(String[] args) {
		
		FileInputStream fis = new FileInputStream("./Test Data/GoogleTestCase.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}

}
