package com.corejavaprograms;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
	
		System.out.println("Enter Number of Alphabets");
		Scanner sc = new Scanner(System.in);
		int Alphabets = sc.nextInt();
		sc.close();
		int Character = 65;
		for(int i=0;i<Alphabets;i++)
		{
			for(int j=0;j<=i;j++)
			{
				char a=(char)(Character+j);
				System.out.print(a);
			}
			System.out.println();
		}
		for(int i=Alphabets-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				char a=(char)(Character+j);
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
