package Task13;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create a new Excel workbook
		
		// 2.Create a new sheet with name "Sheet1"
		
		try {
			
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sheet=wb.createSheet("Sheet1");
			
			Object personData[][]= { 
					{"Name","Age","Email"},
					{"John Doe", "28", "john@test.com"},
					{"Jane Doe","28","john@test.com"},
					{"Bob Smith","35","jacky@example.com"},
					{"Swapnil","37","swapnil@example.com"}
					};
			
			int rows=personData.length;
			int cols=personData[0].length;
			
			// 3.Write the data to the sheet
			for(int r=0;r<rows;r++)
			{
				XSSFRow row=sheet.createRow(r);
			 for(int c=0;c<cols;c++)
			 {
				 XSSFCell cell=row.createCell(c);
				 Object value=personData[r][c];
				 
				 if(value instanceof String) {
					 cell.setCellValue((String)value);
				 }
				 if(value instanceof Integer) {
					 cell.setCellValue((Integer)value);
				 }
			 }
			}
			
			//storing the values in the excel sheet into a file 
			String filepath=".\\datafiles\\persondata.xlsx";
			FileOutputStream fos=new FileOutputStream(filepath);
			wb.write(fos);
			wb.close();
			fos.close();
			System.out.println("Spreadsheet written");
		}	
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
