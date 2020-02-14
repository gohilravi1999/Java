package com.corejavaprograms;

public class SplitArray {

	public static void main(String[] args) {
		int array[] = {25,63,45,89,77,41,36};
		
		int Divide=((array.length)+1)/2;
		int array1[] = new int[(array.length/2)+1];
		System.out.println("Array1:");
		for(int i=0;i<Divide;i++)
		{
			array1[i]=array[i];
		}
		for(int i=0;i<Divide;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		int array2[] = new int[(array.length)];
		System.out.println("Array2:");
		for(int i=Divide;i<array.length;i++)
		{
			array2[i]=array[i];
		}
		for(int i=Divide;i<array.length;i++)
		{
			System.out.print(array2[i]+" ");
		}
	}
}
