package com.code.test;

public class Class11
{

	public static void main(String[] args) 
	{
		AbsoluteValue obj = new AbsoluteValue();
		int a=-8,b;
		b=obj.absOfInt(a);
		System.out.println(a+"的绝对值是"+b);
		
		float c=-3.14f,d;
		d=obj.absOfFloat(c);
		System.out.println(c+"的绝对值是"+d);
	}

}
