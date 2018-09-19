package com.code.test;

public class MakeTea
{

	public static void main(String[] args) 
	{
		new BoilThread().start();
		new WashThread().start();
	}

}
