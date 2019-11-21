package com.courseworkReadlibrary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class writeexcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		readlibrary.readlibrary2();
		
		FileOutputStream write = new FileOutputStream("C:\\Users\\pavan.sama\\git\\courseworkoffice_Qt\\courseworkframework\\Readwritefolder\\writefile.xls");
		readlibrary.wb.write(write);
	
	}

}
