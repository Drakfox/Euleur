package com.drakfox.problèmes;


public class Problème__15 {
	
	public static int DIM = 20;
	
	public Problème__15()
	{
		int p = DIM;
		int n = p+p;
		
		Long[] t = new Long[n+1];
		t[0] = 1L;
		
		for(int i = 1; i <= n; i++)
		{
			t[i] = 1L;
			for(int j = i - 1; j >= 1; j--)
			{
				t[j] = t[j] + t[j - 1];
			}
		}
		
		System.out.println(t[p]);
	}
}
