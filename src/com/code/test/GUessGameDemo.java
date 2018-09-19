package com.code.test;

public class GUessGameDemo 
{

	public static void main(String[] args)
	{
		AbstractGuessGame guessGame=new TextModeGame();
		guessGame.setNumber(66);
		guessGame.start();

	}

}
