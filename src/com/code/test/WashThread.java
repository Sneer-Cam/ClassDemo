package com.code.test;

public class WashThread extends Thread
{
	public void run(){
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.print("开始洗第"+i+"个茶杯...");
				Thread.sleep(1500);
				System.out.println("第"+i+"个茶杯洗干净。");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
