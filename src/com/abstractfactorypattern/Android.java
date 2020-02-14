package com.abstractfactorypattern;

public class Android extends Phone 
{
	Android()
	{
		name="Android";
	}
	Android(int temporary)
	{
		ram=4;
		internalMemory=64;
		frontCamera=12;
	}
	
	Android(int temporary1, int temporary2)
	{
		AbstractFactory factory = new AndroidProductFactory();
		Phone createPhone = factory.createPhone();
		Phone setConfiguration = factory.setConfiguration();
		createPhone.creatPhone();
		System.out.println("---Configuration---");
		setConfiguration.setConfiguration();
	}
}
