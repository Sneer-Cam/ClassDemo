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
		System.out.println("数字中的元素：");
		for (int i = 0; i < al.size(); i++) {
			Integer temp = (Integer)(al.get(i));
			System.out.println(temp);
		}
		System.out.println("**********************************");
		al.clear();
		System.out.println("数组被清空后的情况：");
		System.out.println("数组的长度为："+al.size());
		if (al.isEmpty()) {
			System.out.println("数组现在为空。");
		}
		else {
			System.out.println("数组现在不为空。");
		}
	}

}
