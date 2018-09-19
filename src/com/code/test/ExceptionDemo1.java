package com.code.test;

public class ExceptionDemo1 
{

	public static void main(String[] args)
	{
		int a,b,c;
		try 
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("您没有指定命令行参数");
		}
		catch (NumberFormatException es)
		{
			System.out.println("您输入的不是数字");
		}
		catch (ArithmeticException ne)
		{
			System.out.println("除数不能为零");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("程序结束");
		}
	}

}
