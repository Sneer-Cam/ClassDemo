package com.code.test;

import java.util.Date;

public class MyThread extends Thread
{

		boolean flag = true;
		public void run(){
			while (flag) {
				System.out.println("----------"+new Date()+"-------------");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
}
