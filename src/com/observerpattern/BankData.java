package com.observerpattern;

import java.util.ArrayList;

public class BankData implements Subject
{
	ArrayList<Observer> customerlist = new ArrayList<Observer>(); 
	
	public void addObserver(Observer o)
	{
		customerlist.add(o);
	}
	
	public void removeObserver(Observer o)
	{
		customerlist.remove(customerlist.indexOf(o));
	}
	
	public void notifyObserver() 
	{
		int balance = getBalance();
		int amount = getAmount();
		
		for(Observer observer : customerlist)
			{
			 	observer.update(balance, amount);
			}
	}
	
	private int getBalance()
	{
		return 50000;
	}
	private int getAmount()
	{
		return 5000;
	}
	
}
