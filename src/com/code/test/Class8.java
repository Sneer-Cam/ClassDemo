package com.code.test;

import java.util.Scanner;

public class Class8 
{

	public static void main(String[] args) 
	{
		String answer;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("���裡");
			System.out.println("����Ф���������");
			System.out.print("��������?(y/n):");
			answer = input.next();
		} while (!answer.equals("y"));
        System.out.println("�󹦸��!");
	}

}
