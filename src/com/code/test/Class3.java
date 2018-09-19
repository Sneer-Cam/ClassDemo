package com.code.test;

import java.util.Scanner;

public class Class3 
{

	public static void main(String[] args) 
	{
		int score,sum=0,avg;
		String name="liam";
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("请输入5门功课中第"+(i+1)+"门课的成绩：");
			score=input.nextInt();
			sum=sum+score;
		}
		avg=sum/5;
		System.out.println(name+"的平均分是："+avg);
	}

}
