package com.drakfox.probl�mes;

public class Probl�me___6 {
	
	public long sum = 0;
	public long square = 0;
	public long difference = 0;
	
	public Probl�me___6()
	{
		for(int i = 1; i <= 100; i++)
		{
			sum += (i*i);
			square += i;
		}
		
		square = (square*square);
		
		difference = square-sum;
		
		System.out.println(difference);
	}
}
