package com.corejavaprograms;

import java.util.*; 

public class Palindrome {

	public static void main(String[] args) {
		String Reverse="";
		String Name="";
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		
		Name = sc.nextLine();
		sc.close();
		
		for(int i=Name.length()-1;i>=0;i--)
		{
			Reverse = Reverse + Name.charAt(i);
		}
		
		if(!Name.equals(Reverse))
		{
			System.out.println("Given String is not Palindrome");
		}
		else
		{
			System.out.println("Given String is Palindrome");
		}
	}

}
