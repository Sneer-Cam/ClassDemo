package com.code.test;

public class BoilThread extends Thread
{
	public void run(){
		
		try {
			System.out.println("��ʼ��ˮ...");
			Thread.sleep(10000);
			System.out.println("ˮ�տ��ˡ�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
