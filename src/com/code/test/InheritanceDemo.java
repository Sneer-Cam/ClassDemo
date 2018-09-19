package com.code.test;

public class InheritanceDemo
{

	public static void main(String[] args) 
	{
		Student1 std=new Student1();
		std.mName="ÕÅÈı";
		std.mAge=18;
		std.dining();
		std.examination();
		
		Teacher tea =new Teacher();
		tea.mName="Ì·ºÆÇ¿";
		tea.mAge=65;
		tea.dining();
		tea.prelection();

	}

}
