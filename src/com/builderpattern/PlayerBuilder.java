package com.builderpattern;

public class PlayerBuilder 
{
	public Controller objectForAddPlayer()
	{
		Controller controller = new Controller();
		controller.addPlayer(new PlayerDetail("Ravi", 21, "batsman"));
		return controller;
	}
	
	public Controller objectForShowPlayerData()
	{
		Controller controller = new Controller();
		controller.displayPlayerInfo();
		return controller;
	}
}
