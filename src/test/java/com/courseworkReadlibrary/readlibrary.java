package com.courseworkReadlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

 public class readlibrary {
	

	
	static HSSFWorkbook wb;
	static HSSFSheet sheet1;
	
@Test
	public static  void readlibrary2(){
		// give the file location, to do that create object
				try {
					String excel="C:\\Users\\pavan.sama\\git\\courseworkoffice_Qt\\courseworkframework\\Readwritefolder\\Demo_Read.xls";
					File src = new File (excel);
					FileInputStream fs= new FileInputStream(src);
					
					//Hssf work book for load xls
					
					 wb= new HSSFWorkbook(fs);
					
					 sheet1=wb.getSheetAt(0);
					
					int count=sheet1.getLastRowNum();
					
					System.out.println(" the data is "+ count);
					for (int i=0;i<=count;i++)
					{
						String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
						String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
						System.out.println("data from row"+i+" is "+data0+data1);
					}
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
	}}
					
				
					
					
					
					/* //wb = new HSSFWorkbook(fs);
					 
					// for sheet 1=index0, for sheet2=index1.....
					 
				} 
				catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
	}
	
	public String getdata(int sheetnumber,int row,int column)
	{
		sheet1=wb.getSheetAt(sheetnumber);
		
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;	
	}
	
	public int count()
	{
		int rowcount=sheet1.getLastRowNum();
		return rowcount;
	}

}
*/