package com.abstractfactorypattern;

public abstract class Phone 
{
	String name;
	int ram, internalMemory, frontCamera;
	public void creatPhone()
	{
		System.out.println(name+" is being manufactured.");
	}
	
	public void setConfiguration()
	{
		System.out.println("RAM:"+ram+"GB");
		System.out.println("INTERNAL MEMORY:"+internalMemory+"GB");
		System.out.println("FRONT CAMERA:"+frontCamera+"MP");
	}
}
