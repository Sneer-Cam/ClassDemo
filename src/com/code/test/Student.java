package com.code.test;

class Student
{
	private String name;
	private int age;
	private float weight;
	
	public void dining(){
		System.out.println("�Ա���.....");
		weight++;
	}
	public void walk(){
		System.out.println("������......");
		weight--;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setAge(int a)
	{
		this.age=a;
	}
	public void setWeight(float weight)
	{
		this.weight=weight;
	}
	
	public void display()
	{
		System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"���أ�"+weight);
	}
}
