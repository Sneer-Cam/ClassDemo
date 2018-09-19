package com.code.test;

import java.util.ArrayList;

public class ArrayListDemo1
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("苹果");al.add("梨子");al.add("香蕉");
		al.add("西瓜");al.add("榴莲");
		System.out.println("目前数组的长度："+al.size());
		for (int i = 0; i < al.size(); i++) {
			System.out.println((String)(al.get(i)));
		}
		String str = new String("西瓜");
		int index = al.indexOf(str);
		if (index<0) {
			System.out.println(str+"在数组中不存在。");
		}else {
			System.out.println(str+"存在,索引为:"+index);
		}
		al.remove(3);
		System.out.println("删除索引为3的元素后的情况：");
		for (int i = 0; i < al.size(); i++) {
			System.out.println((String)(al.get(i)));
		}
	}

}
