package com.corejavaprograms;
import java.util.*;

class NotExistsException extends Exception
{  
	 NotExistsException(String s)
	 {  
	  System.out.println(s); 
	 }  
}  


public class OccurrenceOfChar {

	public static void main(String[] args) throws NotExistsException{
		int count=0;
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String Name =sc.nextLine();
		
		System.out.println("Enter Character:");
		char Character = sc.next().charAt(0);
		sc.close();

		
		
		for(int i=0;i<Name.length();i++)
		{
			if((Name.charAt(i)-Character)==0)
			{
				count=count+1;
			}
		}
		if(count==0)
		{
			 throw new NotExistsException("Character not exists in string!!");  
		}
		else
		{
		System.out.println("Number of Occurrence :"+count);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}  
		
	}
}
