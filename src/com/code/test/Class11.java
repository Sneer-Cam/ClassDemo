package com.code.test;

public class Class11
{

	public static void main(String[] args) 
	{
		AbsoluteValue obj = new AbsoluteValue();
		int a=-8,b;
		b=obj.absOfInt(a);
		System.out.println(a+"�ľ���ֵ��"+b);
		
		float c=-3.14f,d;
		d=obj.absOfFloat(c);
		System.out.println(c+"�ľ���ֵ��"+d);
	}

}
