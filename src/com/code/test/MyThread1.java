package com.code.test;

class MyThread1 implements Runnable
{
	public void run(){
		String strName = Thread.currentThread().getName();
		for (int i = 0; i < 50; i++) {
			System.out.println(strName+":"+i);
		}
	}

}
