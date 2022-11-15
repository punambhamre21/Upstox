package Upstocs_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class With_DDF {
public static void main(String[] args) throws Throwable {
	
	//navigate to sheet in excel
	FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\upstox.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
}
}
