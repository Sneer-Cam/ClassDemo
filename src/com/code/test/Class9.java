package com.code.test;

import java.util.Scanner;

public class Class9 
{

	public static void main(String[] args)
	{
		String answer;
		System.out.println("���ݵ���ô��?(y/n):");
		Scanner input = new Scanner(System.in);
		answer=input.next();
		
		while (!answer.equals("y"))
		{
			System.out.println("����5�㿪ʼ������");
			System.out.println("������ϰ���٣�");
			System.out.println("���絽������ʦ����ϰ���裡");
			System.out.println("������ϰ�赸��������");
			System.out.print("���ݵ���ô��?(y/n):");
			answer=input.next();
		}
		System.out.println("Բ����ɣ�");

	}

}
