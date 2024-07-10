package SeleniumMidLevelcodes;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompleteExcelSheetCode {
	public static String[][] getExcelData(String FileName) throws IOException {
		String baseDir=System.getProperty("user.dir");
		FileInputStream fis =new FileInputStream(baseDir+"/src/test/resources/"+FileName);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("Sheet");
		int rows=sheet.getLastRowNum();
		int columns =sheet.getRow(rows).getLastCellNum();
		String [][] loginData=new String [rows][columns];
		for(int r=1;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<columns;c++) {
				XSSFCell cell=row.getCell(c);
				loginData[r-1][c]=cell+"";
				System.out.print(loginData[r-1][c]);
				System.out.print("|");
			}
			System.out.println(" ");
		}
		
		workbook.close();
		return loginData;
	}

	public static void main(String[] args) throws IOException {
		getExcelData("sample.xlsx");

	}

}
