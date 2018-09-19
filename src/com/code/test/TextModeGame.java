 package com.code.test;

import java.util.Scanner;

public class TextModeGame extends AbstractGuessGame{
	private Scanner scanner;
	public TextModeGame(){
		scanner=new Scanner(System.in);
	}
	protected void showMessage(String message){
		for (int i = 0; i < message.length()*2; i++) {
			System.out.print("*");
		}
		System.out.println("\n"+message);
		for (int i = 0; i < message.length()*2; i++) {
			System.out.print("*");
		}
	}
	protected int getUserInput(){
		System.out.println("\nÇëÊäÈëÊý×Ö:");
		return scanner.nextInt();
	}
}
