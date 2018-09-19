package com.code.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class12 {

	public static void main(String[] args) {
		File outputfile = new File("D:\\test.txt");
		
		writerFile02(outputfile);
	}

	private static void writerFile02(File outputfile) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outputfile);
			String str = "One Direction!!!";
			byte[] buff = str.getBytes();
			fos.write(buff);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
					fos = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
