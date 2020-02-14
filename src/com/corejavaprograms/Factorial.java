package com.corejavaprograms;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		
		int Number = sc.nextInt();
		sc.close();
		int Factorial=1;
		if(Number==0 || Number==1)
		{
			System.out.println("Factorial : 1");
		}
		while(Number!=1)
		{
			Factorial=Factorial*Number;
			Number--;
		}
		System.out.println("Factorial : "+Factorial);
	}

}
