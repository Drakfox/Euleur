package com.drakfox.probl�mes;

import java.awt.List;
import java.util.ArrayList;

public class Probl�me__14 {
	
	public static int Length = 1_000_000;
	
	public static int BiggestLength = 0;
	public static ArrayList<Long> BiggestList = new ArrayList<Long>();
	
	public Probl�me__14()
	{

		ArrayList<Long> list = new ArrayList<Long>();
		
		for(int i = 13; i < Length; i++)
		{
			Long nombre = (long)i;
			int length = 0;
			list = new ArrayList<Long>();
			
			list.add((long) i);
			
			if(i%1_000 == 0)
			{
				System.out.println(i);
			}
			
			while(nombre != 1)
			{
				if(nombre%2 == 0)
				{
					nombre = nombre/2;
				}
				else
				{
					nombre = (3*nombre) + 1 ;
				}
				length++;
				
				
				list.add(nombre);
			}
			
			if(BiggestLength < length)
			{
				BiggestLength = length;
				BiggestList = list;
			}
		}
		
		for(int i = 0; i < BiggestList.size(); i++)
		{
			System.out.print(BiggestList.get(i) + " -> ");
		}
		
		System.out.println("");
		System.out.println(BiggestLength);
	}

}
