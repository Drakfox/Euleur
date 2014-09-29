package com.drakfox.problèmes;

public class Problème___9 {
	
	public int a = 1;
	public int b = 2;
	
	public boolean notFound = true;
	
	public Problème___9()
	{

		for(int i = a; i < 1000 && notFound; i++ )
		{
			for(int j = a+i; j < (1000-(a+1))/2 && notFound; j++)
			{
				double c = Math.sqrt((i*i)+(j*j));
				if(c%(Math.floor(c)) == 0)
				{
					if((i+j+(int)c) == 1000)
					{
						int product = i*j*(int)c;
						System.out.println(product + " : " + i + " : " + j + " : " + c);
						notFound = false;
					}
				}
			}
		}
		if(notFound)
		{
			System.out.println("Looser");
		}
	}
}
