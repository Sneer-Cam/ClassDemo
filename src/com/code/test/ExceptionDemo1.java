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
			System.out.println("��û��ָ�������в���");
		}
		catch (NumberFormatException es)
		{
			System.out.println("������Ĳ�������");
		}
		catch (ArithmeticException ne)
		{
			System.out.println("��������Ϊ��");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("�������");
		}
	}

}
