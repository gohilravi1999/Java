package com.corejavaprograms;

public class IterateOverArray {

	public static void main(String[] args) {
		int array[] = {49,25,12,56,73,15};
		int Number;
		
		for(int i=0;i<array.length;i++)
		{
			Number=array[i];
			
			if((Number%3 == 0 && Number%5 == 0 )|| Number%7 == 0)
			{
				System.out.print(Number+" ");
			}
		}
	}
}
