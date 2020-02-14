package com.factorypattern;

class InvalidInput extends Exception
{
	InvalidInput(String s)
	{
		System.out.println(s);
	}
}
public class ExceptionHandling implements OperatingSystem
{
	public void aboutSystem() 
	{
		try
		{
			throw new InvalidInput("Input is not valid");
		}
		catch(Exception e) 
		{
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}
