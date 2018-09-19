package com.code.test;

import java.util.Scanner;

public class Class5
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("输入令狐冲的Java成绩：");
		int score=input.nextInt();
		if(score>90)
		{
			System.out.println("师父说：不错，给你《独孤九剑》剑谱");
		}

	}

}
