package com.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Controller 
{
	List<CricketClub> players = new ArrayList<CricketClub>();
	
	public void addPlayer(CricketClub player)
	{
			players.add(player);
	}
	
	public void displayPlayerInfo()
	{
		for(CricketClub player : players)
		{
			System.out.println("---Player Information---");
			player.showData();
		}		
	}
}
