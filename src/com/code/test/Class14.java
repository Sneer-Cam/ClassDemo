package com.code.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class14 {

	public static void main(String[] args)
	{
		File srcFile = new File("D:\\classtest\\aa.jpg");
		File desFile = new File("D:\\bb.jpg");
		
		copyPicture(srcFile,desFile);
	}

	private static void copyPicture(File srcFile, File desFile) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(srcFile);
			fos = new FileOutputStream(desFile);
			
			int c = -1;
			while ((c=fis.read()) !=-1) {
				fos.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
					fis.close();
					fis = null;
				}
				if (fos!=null) {
					fos.close();
					fos = null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
