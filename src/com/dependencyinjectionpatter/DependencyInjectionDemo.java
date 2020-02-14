package com.dependencyinjectionpatter;

public class DependencyInjectionDemo {

	public static void main(String[] args) 
	{
		InjectorInterface bikeinjector = new InjectorForBike();
		ConsumerClass bikeconsumer = bikeinjector.getConsumer();
		bikeconsumer.getRide();
		
		InjectorInterface carinjector = new InjectorForCar();
		ConsumerClass carconsumer = carinjector.getConsumer();
		carconsumer.getRide();
	}

}
