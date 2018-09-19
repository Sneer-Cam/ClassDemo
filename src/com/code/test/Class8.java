package com.code.test;

import java.util.Scanner;

public class Class8 
{

	public static void main(String[] args) 
	{
		String answer;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("唱歌！");
			System.out.println("演奏肖邦钢琴曲！");
			System.out.print("可以了吗?(y/n):");
			answer = input.next();
		} while (!answer.equals("y"));
        System.out.println("大功告成!");
	}

}
