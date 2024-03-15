package Task13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			String filepath="C:\\Users\\vaish\\OneDrive\\Desktop\\Guvi\\testwrite.xlsx";
			File file=new File(filepath);
			
			FileInputStream fis=new FileInputStream(file);
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.createSheet("StudentData");
			Row row=sheet.createRow(0);
			Cell cell=row.createCell(0);
			cell.setCellValue("Student information");
			
			Row row1=sheet.createRow(1);
			Cell cell1=row1.createCell(0);
			cell1.setCellValue("Student grade");
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\vaish\\OneDrive\\Desktop\\Guvi\\testwrite.xlsx");
			wb.write(fos);
			System.out.println("Spreadsheet written");
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}

}
