package com.code.test;

public class WordsDemo 
{

	public static void main(String[] args) 
	{
		Thread tamin = new Thread(new words());
		tamin.start();
	}

}
class words implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		char[] x=new char[26];
		
		try {
			for (int i = 0; i <x.length ; i++) {
				x[i] = (char) (65+i);
				System.out.println(x[i]);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ïß³Ì½áÊø");
	}
	
}
