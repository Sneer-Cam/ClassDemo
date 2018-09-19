package com.code.test;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		int a = 10,b = 0,c;
	try 
	{
		c=a/b;
		System.out.println(c);
	} catch (ArithmeticException ae)
	{
		System.out.println("除数为零。");
	}
	finally
	{
		System.out.println("finally");
	}
		System.out.println("程序结束。");
	}

}
