package com.dependencyinjectionpatter;

public class InjectorForCar implements InjectorInterface
{
	public ConsumerClass getConsumer()
	{
		return new ConsumerClass(new RideByCar());
	}
}
