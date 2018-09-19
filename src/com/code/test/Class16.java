package com.code.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Class16 
{

	public static void main(String[] args) 
	{
		File file = new File("D:\\Workspaces\\MyEclipse 2016 CI\\Class\\src\\com\\code\\test\\class16.java");
		
		readFile(file);
	}

	private static void readFile(File file) {
		FileInputStream fis = null;
		BufferedInputStream bis= null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
				
			int c=0;
			System.out.println(bis.read());
			System.out.println(bis.read());
				
			bis.mark(100);
			for (int i = 0; i <= 10&&(c=bis.read())!=-1; i++) {
				System.out.print((char)c);
			}
			System.out.println();
			bis.reset();
			for (int 
					j = 0; j <= 10&&(c=bis.read())!=-1; j++) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}finally {
			try {
				if (bis != null) {
					bis.close();
					bis=null;
				}
				if (fis != null) {
					fis.close();
					fis=null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
}
		
		
			
		
		
	}


