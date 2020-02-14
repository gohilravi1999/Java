package com.abstractfactorypattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AbstractFactoryDemo 
{
	public static int getChoice()
	{	
		int choice=0;
			System.out.println("Enter 0 for Exit");
			System.out.println("Enter 1 for Android");
			System.out.println("Enter 2 for Iphone");
			Scanner scanner = new Scanner(System.in);
			try
			{
				choice = scanner.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Input is not valid :"+e);
				System.exit(0);
			}
			scanner.close();
			return choice;
	}
		
	public static void choice(int choice)
	{
		switch(choice)
		{
		case 0: System.out.println("Exit Successfully");
				System.exit(0);
				
		case 1: AndroidProductFactory androidfactory = new AndroidProductFactory();
				androidfactory.showInformation();
				break;
				
		case 2:	IphoneProductFactory iphonefactory = new IphoneProductFactory();
				iphonefactory.showInformation();
				break;
				
		default: System.out.println("Invalid Input");
					break;
		}
	}
	
	public static void main(String[] args) 
	{
		int choice = AbstractFactoryDemo.getChoice();
		AbstractFactoryDemo.choice(choice);		
	}
}
