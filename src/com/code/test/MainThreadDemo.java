package com.code.test;

public class MainThreadDemo
{

	public static void main(String[] args) 
	{
		
		Thread tamin = Thread.currentThread();
		System.out.println("��ǰ�߳�Ϊ:"+tamin);
		
		try {
			for (int i = 0; i < 0; i++) {
				System.out.println(i);
				Thread .sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�߳̽���");
	}

}
