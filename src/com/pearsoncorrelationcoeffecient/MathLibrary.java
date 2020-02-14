
package com.pearsoncorrelationcoeffecient;
import java.lang.Math;

public class MathLibrary 
{
	public static double addition(double array[])
	{
		double SUM=0;
		for(double elementOfArray : array)
		{
			SUM=SUM+elementOfArray;
		}
		return SUM;
	}
	
	public static double meanOfArray(double array[])
	{
		return addition(array)/array.length;
	}
	
	public static double[] deviation(double array[])
	{
		int COUNT = 0;
		double deviatedArray[] = new double[array.length];
		for(double elementOfArray : array)
		{
			deviatedArray[COUNT] = elementOfArray - meanOfArray(array); 
			COUNT++;
		}
		return deviatedArray;
	}
	
	public static double[] multiplicationOfArray(double array1[], double array2[])
	{
		int COUNT = 0;
		double tempArray1[] = deviation(array1);
		double tempArray2[] = deviation(array2);
		double multipliedArray[] = new double[array1.length];
		for(double elementOfArray : tempArray1)
		{
			multipliedArray[COUNT] = elementOfArray*tempArray2[COUNT]; 
			COUNT++;
		}
		return multipliedArray;
	}
	
	public static double simpleMultiplication(double value1, double value2)
	{
		return value1*value2;
	}
	
	public static double simpleDivision(double numerator, double denominator)
	{
		return numerator/denominator;
	}
	
	public void getPearsonCorrelationCoefficient(double arrayX[],double arrayY[])
	{
		double numerator = addition(multiplicationOfArray(arrayX,arrayY));
		double denominator = simpleMultiplication(Math.sqrt(addition(multiplicationOfArray(arrayX,arrayX))),Math.sqrt(addition(multiplicationOfArray(arrayY,arrayY))));
	
		System.out.println(simpleDivision(numerator,denominator));
	}
}
