package com.code.test;

import java.util.Scanner;

public class Class9 
{

	public static void main(String[] args)
	{
		String answer;
		System.out.println("表演得怎么样?(y/n):");
		Scanner input = new Scanner(System.in);
		answer=input.next();
		
		while (!answer.equals("y"))
		{
			System.out.println("早上5点开始练声！");
			System.out.println("上午练习钢琴！");
			System.out.println("下午到声乐老师家练习唱歌！");
			System.out.println("晚上练习舞蹈基本功！");
			System.out.print("表演得怎么样?(y/n):");
			answer=input.next();
		}
		System.out.println("圆满完成！");

	}

}
