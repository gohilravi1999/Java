package com.corejavaprograms;

import java.util.Arrays;

public class RemoveDuplicateNumber 
{
	public static void main(String[] args)
	{
		int array[] = {25,12,44,25,44,67,63,59,63};
		int Length = array.length;
		
		Arrays.sort(array);
		int temp[] = new int[Length+1];
		
		int i=0;
		int k=0;
		int j=i+1;
		int count=0;
		while(j!=Length)
		{
			if(array[i]==array[j])
			{
				i++;
				j++;
			}
			else
			{
				temp[k]=array[i];
				i++;j++;k++;count++;
			}
		}
		
		for(k=0;k<count;k++)
		{
			
			System.out.print(temp[k]+" ");
		}
		System.out.print(array[Length-1]);
		}

}
