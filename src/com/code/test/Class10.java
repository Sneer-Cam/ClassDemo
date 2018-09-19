package com.code.test;

import java.util.Scanner;

public class Class10 
{

	public static void main(String[] args)
	{
		int score,num = 0;
		for (int i = 0; i < 5; i++) 
		{
			Scanner input=new Scanner(System.in);
			System.out.println("请输入第："+(i+1)+"位学生的成绩：");
			score=input.nextInt();
			if (score<80)
			{
				continue;
			}
			num++;
		}
		double rate=(double)num/5*100;
		System.out.println("80分以上的学生所占的比例为："+rate+"%");

	}

}
