package com.code.test;

public class WashThread extends Thread
{
	public void run(){
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.print("��ʼϴ��"+i+"���豭...");
				Thread.sleep(1500);
				System.out.println("��"+i+"���豭ϴ�ɾ���");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
