package com.code.test;

public abstract class AbstractGuessGame 
{
	private int number;
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void start(){
		showMessage("欢迎");
		int guess=0;
		do {
			guess=getUserInput();
			if (guess>number)
			{
				showMessage("输入数字较大");
			}else if (guess<number) 
			{
				showMessage("输入数字较小");
			}else{
				showMessage("您猜中了！！！");
				
			}
		} while (guess!=number);
	}
protected abstract void showMessage(String message);
protected abstract int getUserInput();
}
