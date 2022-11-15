package patameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Numeric_data {
public static void main(String[] args) throws Throwable {
	
	//create object of fileinputstream class
	FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\workbook\\book1.xlsx");
	
	//use create method to open excel sheet
	double value= WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	
System.out.println(value);
}
}

