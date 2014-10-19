package com.drakfox.problèmes;

import java.util.ArrayList;

public class Problème__16 {
	
	public static ArrayList<Integer> Digit = new ArrayList<Integer>();
	public static int Size = 1000;
	
	public Problème__16()
	{
		Digit.add(1);
		
		for(int i = 0; i < 1000; i++)
		{
			multiply(2);
		}
		
		print();
	}
	
	public void multiply(int by)
	{
		int nbIteration = Digit.size();
		int[] addition = new int[Digit.size()];
		
		for(int i = 0; i < nbIteration; i++)
		{
			int tempDigit = Digit.get(i) * by;
			
			while(tempDigit >= 10)
			{
				if(i == Digit.size() - 1)
				{
					Digit.add(1);					
				}
				else
				{
					addition[i+1] = addition[i+1] + 1;
				}
				
				tempDigit = tempDigit - 10;
			}
			
			Digit.set(i, tempDigit);
			
		}
		
		for(int i = 0; i < nbIteration; i++)
		{
			Digit.set(i, Digit.get(i) + addition[i]);
		}
	}
	
	public void print()
	{
		int sommation = 0;
		
		for(int i = Digit.size() - 1; i >= 0; i--)
		{
			sommation = sommation + Digit.get(i);
		}

		System.out.println(sommation);
	}

}
