package com.observerpattern;

public class CreditAmount implements Observer
{
	public void update(int customerBankBalance,int amount)
	{
		customerBankBalance = customerBankBalance + amount;
		System.out.println("Current Balance after credit:"+customerBankBalance);
	}
}
