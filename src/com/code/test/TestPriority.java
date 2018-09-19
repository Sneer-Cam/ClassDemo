package com.code.test;

public class TestPriority {
	public static void main(String[] args){
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		t1.start();
		t2.start();
	}
}
	
class T1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("T1£º"+i);
		}
	}
	
}

class T2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("-------T2:"+i);
		}
	}
	
}