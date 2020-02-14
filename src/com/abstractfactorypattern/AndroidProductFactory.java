package com.abstractfactorypattern;

public class AndroidProductFactory implements AbstractFactory
{
	public Phone createPhone()
	{
		return new Android();
	}
	public Phone setConfiguration()
	{
		return new Android(1);
	}
	public Phone showInformation()
	{
		return new Android(1,2);		
	}
}
