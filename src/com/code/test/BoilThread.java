package com.code.test;

public class BoilThread extends Thread
{
	public void run(){
		
		try {
			System.out.println("开始烧水...");
			Thread.sleep(10000);
			System.out.println("水烧开了。");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
