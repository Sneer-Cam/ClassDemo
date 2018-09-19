package com.code.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Class17 {

	public static void main(String[] args) throws Exception{
		User us = new User("ÄÐ",1,"yelong",new Date(),new Clothing("Î÷·þ","ºìÉ«"));
		String path = "D:\\user.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(us);
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		User serialUser =(User) ois.readObject();
		System.out.println("id:"+serialUser.getId());
		System.out.println("name:"+serialUser.getName());
		System.out.println("sex:"+serialUser.getSex());
		System.out.println("brithday:"+serialUser.getBrithday());
		System.out.println("memo:"+serialUser.getMemo());
		Clothing serialClothing = serialUser.getClothing();
		System.out.println(serialUser.getName()+","+serialClothing.getClothing()+","+serialClothing.getColor());
	}

}
