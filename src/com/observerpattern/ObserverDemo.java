package com.observerpattern;

public class ObserverDemo {

	public static void main(String[] args)
	{
		WithdrawCase withdrawcase = new WithdrawCase();
		CreditAmount creditamount = new CreditAmount();
		BankData bankdata = new BankData();
		
		
		bankdata.addObserver(withdrawcase);
		bankdata.addObserver(creditamount);
		
		bankdata.notifyObserver();
		
		bankdata.removeObserver(creditamount);
		
		bankdata.notifyObserver();

	}

}
