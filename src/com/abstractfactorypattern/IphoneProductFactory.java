package com.abstractfactorypattern;

public class IphoneProductFactory implements AbstractFactory
{
	public Phone createPhone()
	{
		return new Iphone();
	}
	public Phone setConfiguration()
	{
		return new Iphone(1);
	}
	public Phone showInformation()
	{
		return new Iphone(1,2);
	}
	
}
