package com.code.test;

import java.util.HashMap;

public class HashDemo
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("93-07", "����");
		hm.put("84-12", "����");
		hm.put("102-20", "����");
		hm.put("91-04", "֣��");
		hm.put("111-17", "����");
		System.out.println(hm.toString());
		System.out.println("ѧ��91-04��ѧ����"+hm.get("91-04"));
		System.out.println("ѧ��84-12��ѧ����"+hm.get("84-12"));
		hm.remove("93-07");
		System.out.println(hm.toString());
	}

}
