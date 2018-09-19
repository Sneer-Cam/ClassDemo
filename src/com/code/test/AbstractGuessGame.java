package com.code.test;

public abstract class AbstractGuessGame 
{
	private int number;
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void start(){
		showMessage("��ӭ");
		int guess=0;
		do {
			guess=getUserInput();
			if (guess>number)
			{
				showMessage("�������ֽϴ�");
			}else if (guess<number) 
			{
				showMessage("�������ֽ�С");
			}else{
				showMessage("�������ˣ�����");
				
			}
		} while (guess!=number);
	}
protected abstract void showMessage(String message);
protected abstract int getUserInput();
}
