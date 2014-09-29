package com.drakfox.problèmes;

import java.util.ArrayList;

public class Problème___3 {
	
	public static double NombreFactor = 600_851_475_143d;
	public static int BiggestFactor = 0;
	
	public static ArrayList<Integer> PrimeNumber = new ArrayList<Integer>();
	public static final int PrimerSize = 1000;
	
	public boolean factor = true;
	
	public Problème___3()
	{
		PrimeNumber.add(2);
		
		for(int i = 3; PrimeNumber.size() <= PrimerSize; i++)
		{
			boolean isNombrePremier = true;
			
			for(int j = 0; j < PrimeNumber.size() && isNombrePremier; j++)
			{
				float Nombre = ((float)i)/((float)PrimeNumber.get(j));
				
				if(Float.compare(Nombre, (float)Math.floor((double)Nombre)) == 0)
				{
					isNombrePremier = false;
				}
			}
			if(isNombrePremier)
			{
				PrimeNumber.add(i);
			}
		}
		
		while(factor)
		{
			boolean Shearch = true;
			
			for(int i  = 0; i < PrimeNumber.size() && Shearch; i++)
			{
				double Nombre = ((double)NombreFactor)/((double)PrimeNumber.get(i));
				
				if(Nombre == 1)
				{
					factor = false;
				}
				
				if(Double.compare((double)Nombre, (double)Math.floor((double)Nombre)) == 0)
				{
					NombreFactor = (double)Nombre;
					
					if(BiggestFactor <= PrimeNumber.get(i))
					{
						BiggestFactor = PrimeNumber.get(i);
					}
					
					Shearch = false;
					
				}
			}
		}
		
		System.out.println(BiggestFactor);
	}
}
