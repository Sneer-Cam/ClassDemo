package com.code.test;

public class ThreadPriority 
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread1());
		Thread tm = Thread.currentThread();
		
		t1.setName("t1");t2.setName("t2");tm.setName("tm");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t1.getName()+"�����ȼ���"+t1.getPriority());
		System.out.println(t2.getName()+"�����ȼ���"+t2.getPriority());
		System.out.println(tm.getName()+"�����ȼ���"+tm.getPriority());
		t1.start();t2.start();
		String strNmae = tm.getName();
		for (int i = 0; i < 50; i++) {
			System.out.println(strNmae+":"+i);
		}
	}

}
