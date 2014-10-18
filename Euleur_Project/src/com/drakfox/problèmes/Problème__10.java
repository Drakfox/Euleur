package com.drakfox.problèmes;

import java.util.ArrayList;

public class Problème__10 {
	
	public static int Length = 2_000_000;
	public static int sqrLength = (int) Math.sqrt(Length);
	public static ArrayList<Integer> PrimeNumber = new ArrayList<Integer>();
	public static int[] nombre = new int[Length+1];
	
	public Problème__10()
	{
		nombre[0] = 1;
		nombre[1] = 1;
		
		int nextPrime = 2;
		
		while(nextPrime <= sqrLength)
		{	
			boolean haveToContinue = true;
			int iterator = 2;
			int multiple = 1;
			
			while(haveToContinue)
			{
				multiple = nextPrime*iterator;
				if(multiple <= Length)
				{
					nombre[multiple] = 1;
					iterator++;
				}
				else
				{
					haveToContinue = false;
				}
			}
			
			nextPrime = findNextPrime(nextPrime);
		}
		
		Long somme = 0L;
		
		for(int i = 0; i  <= Length; i++)
		{
			if(nombre[i] == 0)
			{
				if(i >= 1400 && i <= 2000)
				{
					System.out.println(i);
				}
				somme = somme + i;
			}
		}
		
		System.out.println(somme);
		
	}
	
	public static int findNextPrime(int nextPrime)
	{
		boolean found = false;
		int iterator = nextPrime+1;
		while(!found)
		{
			if(nombre[iterator] == 0)
			{
				found = true;
			}
			else
			{
				iterator++;
			}
		}
		
		return iterator;
	}
}
