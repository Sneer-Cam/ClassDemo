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
			System.out.println("������5�Ź����е�"+(i+1)+"�ſεĳɼ���");
			score=input.nextInt();
			sum=sum+score;
		}
		avg=sum/5;
		System.out.println(name+"��ƽ�����ǣ�"+avg);
	}

}
