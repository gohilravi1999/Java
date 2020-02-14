package com.factorypattern;


public class FactoryPatternMain {

	public static void main(String[] args) 
	{
		SystemFactory systemfactory = new SystemFactory();
		
		OperatingSystem operatingsystem = systemfactory.getObjectInstance("System developed by BlackBerry Limited");
		operatingsystem.aboutSystem();
	}

}
