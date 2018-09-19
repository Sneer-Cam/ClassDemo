package com.code.test;

import java.util.HashMap;

public class HashDemo
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("93-07", "张三");
		hm.put("84-12", "李四");
		hm.put("102-20", "王五");
		hm.put("91-04", "郑六");
		hm.put("111-17", "田七");
		System.out.println(hm.toString());
		System.out.println("学号91-04的学生是"+hm.get("91-04"));
		System.out.println("学号84-12的学生是"+hm.get("84-12"));
		hm.remove("93-07");
		System.out.println(hm.toString());
	}

}
