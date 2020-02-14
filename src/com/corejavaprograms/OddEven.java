package com.corejavaprograms;
import java.util.*;

public class OddEven {

	public static void main(String[] args) 
	{
		System.out.println("Enter Number :");
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextInt())
		{
			int Number = sc.nextInt();
			if(Number%2==0)
			{
				System.out.println(Number+" is Even");
			}
			else
			{
				System.out.println(Number+" is Odd");
			}
		}
		else
		{
			System.out.println("Input is not valid!!");
		}
		sc.close();
	}

}
