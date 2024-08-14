package SeleniumMidLevelcodes;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompleteExcelSheetCode {

	public static String[][] getExcelData(String FileName) throws IOException {
		String baseDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(baseDir + "/src/test/resources/" + FileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(rows).getLastCellNum();
		String[][] Data = new String[rows + 1][columns];
		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columns; c++) {
				XSSFCell cell = row.getCell(c);
				Data[r - 1][c] = cell + "";
				System.out.print(Data[r - 1][c]);
				System.out.print("|");
			}
			System.out.println(" ");
		}

		workbook.close();
		return Data;
	}

	public static void getRow(String FileName, int rowNumber) throws IOException {
		String baseDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(baseDir + "/src/test/resources/" + FileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(rows).getLastCellNum();
		String[][] Data = new String[rows + 1][columns];

		XSSFRow row = sheet.getRow(rowNumber);
		for (int c = 0; c < Data[rowNumber].length; c++) {
			XSSFCell cell = row.getCell(c);
			Data[rowNumber][c] = cell + "";
			System.out.print(Data[rowNumber][c] + "|");
		}
		System.out.println();

	}

	public static void getCol(String FileName, int colNumber) throws IOException {
		String baseDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(baseDir + "/src/test/resources/" + FileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(rows).getLastCellNum();
		String[][] Data = new String[rows + 1][columns];

		int c = colNumber;
		for (int r = 0; r <= rows; r++) {
			XSSFRow r1 = sheet.getRow(r);
			Data[r][colNumber] = r1.getCell(colNumber) + "";
			System.out.println(Data[r][colNumber]);
		}

	}

	public static void main(String[] args) throws IOException {
		// getExcelData("sample.xlsx");
		//getRow("sample.xlsx", 0);
		 getCol("sample.xlsx", 1);

	}

}
