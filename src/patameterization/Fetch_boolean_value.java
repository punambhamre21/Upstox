package patameterization;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_boolean_value {
public static void main(String[] args) throws Throwable {
	
	//create object of fileinputstrem class
	FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\workbook\\book1.xlsx");
	
	//use create method to open excel sheet 
	boolean value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
	System.out.println(value);
}
}
