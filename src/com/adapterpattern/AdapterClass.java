package com.adapterpattern;

import java.util.Scanner;

public class AdapterClass extends StudentDetail implements Student
{
	Scanner scanner = new Scanner(System.in);
	
	public void takeDetail()
	{
		System.out.println("Enter Name:");
		String name = scanner.next();
		System.out.println("Enter Marks:");
		int marks = scanner.nextInt();
		setName(name);
		setMarks(marks);
	}
	
	public void giveStudentDetail()
	{
		System.out.println("Name:"+getName());
		System.out.println("Marks:"+getMarks());
	}
}
