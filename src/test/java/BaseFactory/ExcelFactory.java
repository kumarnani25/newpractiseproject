package BaseFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFactory

{
public File f;
public FileInputStream fs;
public XSSFWorkbook wb;
	
	public ExcelFactory() throws IOException
	{
		f=new File("E:\\workspace\\userdata.xlsx");
	   fs=new FileInputStream(f);
		wb=new XSSFWorkbook(fs);
	}
	
	
	
	public  String readStringData(String sheetName,int rowIndex,int columnIndex)
	{
		String data=wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		
		return data;
	}
	
	public  int  readNumericData(String sheetName,int rowIndex,int columnIndex)
	{
		int  data=(int)wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
		
		return data;
	}
	
	
	public  int getRows(String sheetName)
	{ 
	 int row=wb.getSheet(sheetName).getPhysicalNumberOfRows();
	 
	 return row;
	}
	
	public  int getcol(String sheetName,int row)
	{ 
	 int col=wb.getSheet(sheetName).getRow(row).getPhysicalNumberOfCells();
	 
	 return col;
	}
	
	
}
