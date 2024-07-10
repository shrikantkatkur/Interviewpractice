package Interview;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {
	
	public static String[][] readExcelFile(String fileName) throws IOException {
		String baseDir=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(baseDir+"/src/test/resources/"+fileName);
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workBook.getSheet("Sheet");
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		String[][]loginData=new String[rows][cols];
		for(int r=1;r<=rows;r++) {
			XSSFRow row= sheet.getRow(r);{
				for(int c=0;c<cols;c++) {
					XSSFCell cell= row.getCell(c);
					loginData[r-1][c]=cell+"";
					System.out.print(loginData[r-1][c]+"|");
				}
				System.out.println();
			}
			
		}
		workBook.close();
		return loginData;
	}
	
	public static void main(String[] args) throws IOException {
		ReadingExcelFile.readExcelFile("sample.xlsx");
	}

}
