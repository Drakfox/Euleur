package com.drakfox.problèmes;

import java.util.ArrayList;

public class Problème__12 {
	
	public static int triangleNum = 0;
	public static int Size = 500;
	
	public Problème__12()
	{
		boolean notFound = true;
		int iterator = 0;
		
		while(notFound)
		{
			iterator ++;
			ArrayList<Integer> factors = new ArrayList<Integer>();
			
			triangleNum = triangleNum + iterator;
					
			for(int i = 1 ; i < Math.sqrt(triangleNum); i++)
			{
				if(triangleNum%i == 0)
				{
					factors.add(i);
					if(triangleNum/i != i)
					{
						factors.add(triangleNum/i);
					}
				}
			}
			
			if(factors.size() >= Size)
			{
				notFound = false;
				System.out.println(triangleNum);
			}
		}
	}

}
