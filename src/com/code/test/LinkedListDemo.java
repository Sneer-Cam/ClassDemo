package com.code.test;

import java.util.LinkedList;

public class LinkedListDemo
{

	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		for (int i = 0; i <= 10; i++) {
			Double temp = new Double(Math.sqrt(i));
			ll.add(temp);
		}
		System.out.println("�����е�Ԫ�أ�");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("*****************************");
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ɾ����һ��Ԫ�غ����һ��Ԫ�غ������");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
	}

}
