package com.code.test;

import java.util.ArrayList;

public class ArrayListDemo1
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("ƻ��");al.add("����");al.add("�㽶");
		al.add("����");al.add("����");
		System.out.println("Ŀǰ����ĳ��ȣ�"+al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println((String)(al.get(i)));
		}
		String str = new String("����");
		int index = al.indexOf(str);
		if (index<0) {
			System.out.println(str+"�������в����ڡ�");
		}else {
			System.out.println(str+"����,����Ϊ:"+index);
		}
		al.remove(3);
		System.out.println("ɾ������Ϊ3��Ԫ�غ�������");
		for (int i = 0; i < al.size(); i++) {
			System.out.println((String)(al.get(i)));
		}
	}

}
