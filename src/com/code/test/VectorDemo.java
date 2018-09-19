package com.code.test;

import java.util.Vector;

public class VectorDemo
{

	public static void main(String[] args)
	{
		Vector vec = new Vector();
		vec.addElement("Java");
		vec.addElement("C#");
		vec.addElement("Oracle");
		vec.addElement("C++");
		vec.addElement("HTML");
		System.out.println(vec.toString());
		
		vec.removeElement("C++");
		System.out.println(vec.toString());
	}

}
