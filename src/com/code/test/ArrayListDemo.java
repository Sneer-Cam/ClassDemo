package com.code.test;

import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++) {
			Integer num = new Integer(i);
			al.add(num);
		}
		System.out.println("�����е�Ԫ�أ�");
		for (int i = 0; i < al.size(); i++) {
			Integer temp = (Integer)(al.get(i));
			System.out.println(temp);
		}
		System.out.println("**********************************");
		al.clear();
		System.out.println("���鱻��պ�������");
		System.out.println("����ĳ���Ϊ��"+al.size());
		if (al.isEmpty()) {
			System.out.println("��������Ϊ�ա�");
		}
		else {
			System.out.println("�������ڲ�Ϊ�ա�");
		}
	}

}
