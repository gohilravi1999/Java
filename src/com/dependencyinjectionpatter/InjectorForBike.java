package com.dependencyinjectionpatter;

public class InjectorForBike implements InjectorInterface
{
	public ConsumerClass getConsumer()
	{
		return new ConsumerClass(new RideByBike());
	}
}
