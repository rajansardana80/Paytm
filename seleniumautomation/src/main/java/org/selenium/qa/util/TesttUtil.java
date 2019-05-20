package org.selenium.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.selenium.qa.base.TestBase;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TesttUtil extends TestBase{

	
public	static int implicit_timeout =20;

public static String TEST_SHEET_PATH="/home/rajansardana/AutomationPractice/seleniumautomation/src/main/java/org/selenium/qa/testdata/FreeCRMTestData.xlsx";

public static Workbook book;
public static Sheet sheet;






public static Object[][] getTestData()
{FileInputStream file = null;
try {
	file = new FileInputStream(TEST_SHEET_PATH);
} catch (FileNotFoundException e) {
	e.printStackTrace();
}

// Load workbook
XSSFWorkbook wb = null;
try {
	wb = new XSSFWorkbook(file);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

// Load sheet- Here we are loading first sheetonly
   XSSFSheet sh1= wb.getSheetAt(0);
   
   
	Object[][] data = new Object[sh1.getLastRowNum()][sh1.getRow(0).getLastCellNum()];
	// System.out.println(sheet.getLastRowNum() + "--------" +
	// sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sh1.getLastRowNum(); i++) {
		for (int k = 0; k < sh1.getRow(0).getLastCellNum(); k++) {
			data[i][k] = sh1.getRow(i + 1).getCell(k).toString();
			// System.out.println(data[i][k]);
		}


}
	return data;
}


public static void takeScreenShotAtEndOfTest() throws IOException{
	
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(srcFile, new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
}
}







