package com.drakfox.problèmes;

import java.util.ArrayList;

public class Problème___7 {
	
	public ArrayList<Integer> NombrePremier = new ArrayList<Integer>();
	public static final int Size = 10000;
	
	public Problème___7()
	{
		NombrePremier.add(2);
		
		for(int i = 3; NombrePremier.size() <= Size; i++)
		{
			boolean isNombrePremier = true;
			
			for(int j = 0; j < NombrePremier.size() && isNombrePremier; j++)
			{
				float Nombre = ((float)i)/((float)NombrePremier.get(j));
				
				if(Float.compare(Nombre, (float)Math.floor((double)Nombre)) == 0)
				{
					isNombrePremier = false;
				}
			}
			
			if(isNombrePremier)
			{
				NombrePremier.add(i);
			}
		}
		
		System.out.println(NombrePremier.get(Size));
	}
}
