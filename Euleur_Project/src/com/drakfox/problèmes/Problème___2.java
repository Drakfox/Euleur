package com.drakfox.problèmes;

import java.util.ArrayList;

public class Problème___2 {
	public static final int SequenceMaxValue = 4000000;
	public int Sum = 0;
	public ArrayList<Integer> FibonacciSequence = new ArrayList<Integer>();
	
	
	public Problème___2()
	{
		FibonacciSequence.add(1);
		FibonacciSequence.add(2);
		
		for(int i = 0; FibonacciSequence.get(i) < SequenceMaxValue; i++)
		{
			if(FibonacciSequence.get(i) > SequenceMaxValue)
			{
				return;
			}
			
			FibonacciSequence.add(FibonacciSequence.get(i)+FibonacciSequence.get(i+1));
		}
		
		for(int i = 0; i < FibonacciSequence.size(); i++)
		{
			int Number = FibonacciSequence.get(i);
			
			float Nombre = ((float)FibonacciSequence.get(i))/2f;
			
			
			if(Float.compare(Nombre, (float)Math.floor((double)Nombre)) == 0)
			{
				Sum += Number;
			}
		}
		
		System.out.print(Sum);
	}
}
