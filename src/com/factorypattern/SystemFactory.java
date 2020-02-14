package com.factorypattern;

public class SystemFactory 
{
	public OperatingSystem getObjectInstance(String comment)
	{
		if(comment.equalsIgnoreCase("System developed by Google"))
		{
			return new Android();
		}
		else if(comment.equalsIgnoreCase("System developed by Apple Inc"))
		{
			return new IOS();
		}
		else if(comment.equalsIgnoreCase("System developed by BlackBerry Limited"))
		{
			return new Blackberry();
		}
		else
		{
			return new ExceptionHandling();
		}
		
	}
}
