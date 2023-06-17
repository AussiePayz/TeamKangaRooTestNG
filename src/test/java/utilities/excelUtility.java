package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {

	private static XSSFWorkbook book;
	private static XSSFSheet sheet;

	private static void openExcel(String filePath) {

		try {
			FileInputStream fileIs = new FileInputStream(filePath);
			book = new XSSFWorkbook(fileIs);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}
	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	private static int columnCount(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
				
	}
	private static String cellData(int rowIndex, int columnIndex) {
		return sheet.getRow(rowIndex).getCell(columnIndex).toString();
	}
	
	
	
	public static Object[][] excelIntoArray(String filePath, String sheetName){
		
		openExcel(filePath);
		loadSheet(sheetName);
		
		int rows = rowCount();
		int columns =  columnCount(0);
		
		Object[][]data = new Object[rows-1][columns];
		
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				
				data[i - 1][j] = cellData(i, j);
                System.out.println(cellData(i, j));
            }
        }

        return data;

				
			}
		}
	
	
	
	
	
	
	


