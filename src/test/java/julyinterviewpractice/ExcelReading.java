package julyinterviewpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\JAVA\\Interviewpractice\\src\\test\\resources\\sample.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(rows).getLastCellNum();
		String[][] data = new String[rows + 1][cols];
		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c);
				data[r - 1][c] = cell + "";
				System.out.print(data[r - 1][c] + "|");

			}
			System.out.println();
		}
		workbook.close();

	}
}
