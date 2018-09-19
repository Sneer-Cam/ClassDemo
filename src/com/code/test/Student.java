package com.code.test;

class Student
{
	private String name;
	private int age;
	private float weight;
	
	public void dining(){
		System.out.println("吃饱了.....");
		weight++;
	}
	public void walk(){
		System.out.println("走累了......");
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
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"体重："+weight);
	}
}
