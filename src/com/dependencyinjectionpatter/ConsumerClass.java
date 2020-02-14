package com.dependencyinjectionpatter;

public class ConsumerClass 
{
	Riding riding=null;
	
	public ConsumerClass(Riding riding)
	{
		this.riding = riding;
	}
	
	public void getRide()
	{
		riding.ridingService();
	}
}
