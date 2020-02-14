package com.pearsoncorrelationcoeffecient;

public class PearsonCorrelationCoefficient
{
	public static void main(String[] args)
	{
		double arrayX[] = {10, 20, 30, 40, 50};
		double arrayY[] = {50, 100, 150, 200, 250};
		MathLibrary obj = new MathLibrary();
		System.out.print("Value Of R : ");
		obj.getPearsonCorrelationCoefficient(arrayX,arrayY);
	}
}
