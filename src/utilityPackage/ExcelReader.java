package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	XSSFWorkbook wb;
	XSSFSheet sheet;

public void readExcelData(String FilePath,String FileName) throws Exception
{
	File excelFile =new File(FilePath+"\\"+FileName);
	//F:\\Selenium Workspace\\GuruBanking\\src\\testDataPackage\\TestData.xlsx
	FileInputStream fis=new FileInputStream(excelFile);
	 wb=new XSSFWorkbook(fis);
	 
	//return "abc";
}
public String getExcelData(String sheetName,int row,int column) throws Exception
{
	sheet=wb.getSheet(sheetName);
	int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	System.out.println("rowCount:"+rowCount);
	int columnCount=0;
	for (int i = 0; i < rowCount; i++) 
	{
		columnCount=sheet.getRow(i).getLastCellNum();
		System.out.println();
		
	}
	System.out.println("columnCount:"+columnCount);
	String strCellValue=sheet.getRow(row).getCell(column).getStringCellValue();
	return strCellValue;
}

}
