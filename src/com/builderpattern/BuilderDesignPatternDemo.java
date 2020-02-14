package com.builderpattern;

import java.util.Scanner;

public class BuilderDesignPatternDemo 
{
	
	public static void selectChoice()
	{
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 0 for Exit");
			System.out.println("Enter 1 for show details");
			System.out.println("Enter your choice:");
			
			int choice = scanner.nextInt();
			scanner.close();
			
			switch(choice)
			{
			case 0 : System.out.println("Exit Successfully");
					System.exit(0);
					
			case 1 : PlayerBuilder playerbuilder = new PlayerBuilder();
					Controller controller = playerbuilder.objectForAddPlayer();
					controller.displayPlayerInfo();
					break;
			}	
	}
	public static void main(String[] args) 
	{
		
		BuilderDesignPatternDemo.selectChoice();
	}

}
