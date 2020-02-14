package com.corejavaprograms;
import java.util.*;

class DenominatorZeroException extends Exception
{
	DenominatorZeroException(String s)
	{
		System.out.println(s); 
	}
	
}

public class DivideByZero {

	public static void main(String[] args) throws DenominatorZeroException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 :");
		int Number1=sc.nextInt();
		System.out.println("Enter Number2 :");
		int Number2=sc.nextInt();
		try
		{
			if(Number2==0)
			{
				throw new DenominatorZeroException("Denominator must be NonZero");
			}
			else
			{
			int Division;
			Division=Number1/Number2;
			System.out.println(Division);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
	}

}
