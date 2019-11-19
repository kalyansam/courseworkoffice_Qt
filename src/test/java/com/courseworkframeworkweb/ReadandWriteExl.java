package com.courseworkframeworkweb;

import java.io.File;
import java.io.FileInputStream;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class ReadandWriteExl {
@Test
	public static void readexcel() throws Exception {
		// TODO Auto-generated method stub
		// give the file location, to do that create object
		File src = new File ("C:\\Users\\pavan.sama\\git\\courseworkoffice_Qt\\courseworkframework\\Readwritefolder\\Demo_Read.xls");
		FileInputStream fs= new FileInputStream(src);
		
		//Hssf work book for load xls
		
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		
		// for sheet 1=index0, for sheet2=index1.....
		HSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		System.out.println("rowcount is  "+rowcount);
		
		for (int i=0;i<=rowcount;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			String data1=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("data from row"+i+" is "+data0+data1);
		}
//		// read row and column -- use below method 
//		// getstringcell value gives string value so storing in string.
//		
//	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
//	System.out.println("data from excel is "+data0);
		

	}

	}

