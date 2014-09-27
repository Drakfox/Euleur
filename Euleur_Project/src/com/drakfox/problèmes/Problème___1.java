package com.drakfox.problèmes;

public class Problème___1 {
	
	public static final int Size = 1000;
	public int Sum = 0;
	
	public Problème___1()
	{
		for(int i = 0; i < Size; i++)
		{
			float Nombre3 = ((float)i)/3f;
			float Nombre5 = ((float)i)/5f;
				
			if(Float.compare(Nombre3, (float)Math.floor((double)Nombre3)) == 0)
			{
				Sum += i;
			}
			else if(Float.compare(Nombre5, (float)Math.floor((double)Nombre5)) == 0)
			{
				Sum += i;
			}
			
		}
		
		System.out.print(Sum);
	}
}
