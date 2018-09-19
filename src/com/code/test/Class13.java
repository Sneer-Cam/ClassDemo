package com.code.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class13 {

	public static void main(String[] args)
	{
		File file = new File("D:\\class.txt");
		
		readFile01(file);
		
	}

	private static void readFile01(File file) {
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			int c=-1;
			while ((c=fr.read()) != -1) {
				
				System.out.print(c+":");
				System.out.print((char)c+";");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fr!=null) {
					fr.close();
					fr=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
