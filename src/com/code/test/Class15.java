package com.code.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Class15 
{

	public static void main(String[] args) 
	{
		File file = new File("D:\\number.txt");
		
		readFile01(file);
	}
	private static void readFile01(File file) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			int num=-1;
			byte[] buff = new byte[1024];
			while((num=fis.read())!=-1){
				String str = new String(buff,0,num);
				System.out.println(str);
				System.out.println("本次读取的："+num+"个字节");
}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fis != null) {
					fis.close();
					fis=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
