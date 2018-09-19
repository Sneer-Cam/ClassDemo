package com.code.test;

public class Test2 
{

	public static void main(String[] args)
	{
		MyTime t1 = new MyTime();
		t1.display();
		MyTime t2 = new MyTime(8);
		t2.display();
		MyTime t3 = new MyTime(8,30);
		t3.display();
		MyTime t4 = new MyTime(8,30,30);
		t4.display();
	}

}
