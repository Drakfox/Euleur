package com.drakfox.probl�mes;

import java.util.ArrayList;

public class Probl�me__10 {
	
	public static int Length = 2_000_000;
	public static ArrayList<Integer> PrimeNumber = new ArrayList<Integer>();
	
	public Probl�me__10()
	{
		PrimeNumber.add(2);
		
		for(int i = 3; i < Length; i++)
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
		int somme = 0;
		
		for(int i = 0 ; i < PrimeNumber.size(); i++)
		{
			somme = PrimeNumber.get(i) + somme;
		}
		

		System.out.println(somme);
		
	}
	
	public static void main(String[] arg0)
	{
		new Probl�me__10();
	}

}
