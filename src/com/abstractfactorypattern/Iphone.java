package com.abstractfactorypattern;

public class Iphone extends Phone
{
	Iphone()
	{
		name="Iphone";
	}
	Iphone(int temporary)
	{
		ram=8;
		internalMemory=64;
		frontCamera=16;
	}
	
	Iphone(int temporary1, int temporary2)
	{
		AbstractFactory factory = new IphoneProductFactory();
		Phone createPhone = factory.createPhone();
		Phone setConfiguration = factory.setConfiguration();
		createPhone.creatPhone();
		System.out.println("---Configuration---");
		setConfiguration.setConfiguration();
	}
}
