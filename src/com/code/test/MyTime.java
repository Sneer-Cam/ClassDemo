package com.code.test;

public class MyTime
{

	private int mHour,mMinute,mSecond;
	public MyTime()
	{
		mHour=0;
		mMinute=0;
		mSecond=0;
	}
	public MyTime(int hour)
	{
		mHour=hour;
		mMinute=0;
		mSecond=0;
	}
	public MyTime(int hour,int minute)
	{
		mHour=hour;
		mMinute=minute;
		mSecond=0;
	}
	public MyTime(int hour,int minute,int second)
	{
		mHour=hour;
		mMinute=minute;
		mSecond=second;
	}
	public void display()
	{
		System.out.println(mHour+":"+mMinute+":"+mSecond);
	}

}
