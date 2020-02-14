package com.builderpattern;

public class PlayerDetail implements  CricketClub
{
	String name;
	int age;
	String specification;
	
	PlayerDetail(String name, int age, String specification)
	{
		this.name = name;
		this.age = age;
		this.specification = specification;
	}
	
	public void showData()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Specification:"+specification);
	}
}
