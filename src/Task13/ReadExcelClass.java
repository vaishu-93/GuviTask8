package Task13;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ReadExcelClass read=new ReadExcelClass();
		String names=read.ReadExcel();
		System.out.println(names);
	}
	
	
	public String ReadExcel()  {
		
		String data="";
		try {
		
		String filepath="C:\\Users\\vaish\\OneDrive\\Desktop\\Guvi\\testread.xlsx";
		File file=new File(filepath);
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		data=row.getCell(0).getStringCellValue();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return data;
	}

}
