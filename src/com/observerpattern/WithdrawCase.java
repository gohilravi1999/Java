package com.observerpattern;

public class WithdrawCase implements Observer
{
	public void update(int customerBankBalance, int amount)
	{
		if(customerBankBalance>amount)
		{
			customerBankBalance = customerBankBalance - amount;
			System.out.println("Current Balance after withdraw:"+customerBankBalance);
		}
		else
		{
			System.out.println("Balance is low");
		}
	}
}