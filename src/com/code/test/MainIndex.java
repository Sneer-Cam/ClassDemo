package com.code.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainIndex 
{

	public static void main(String[] args) throws IOException 
	{
		File file = new File("D:\\number.txt");
		
		readFile01(file);
	}
	private static void readFile01(File file) throws IOException{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int c=-1;
			

			while ((c=fis.read())!=-1)
			{
				System.out.println(c+":");
				System.out.println((char)c+";");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null) {
					fis.close();
					fis=null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
