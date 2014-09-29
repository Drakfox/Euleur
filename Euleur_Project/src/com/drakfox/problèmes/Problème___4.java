package com.drakfox.problèmes;

public class Problème___4 {
	
	public int Number = 0;
	public int BiggestPalindrome = 0;
	
	public Problème___4()
	{
		for(int i = 100; i < 1000; i++)
		{
			for(int j = 100; j < 1000; j++)
			{
				
				boolean isPalindrome = true;
				Number = i*j;
				
				String sNumber = String.valueOf(Number);
				for(int k = 0; k <= (float)sNumber.length()/2 && isPalindrome; k++)
				{
					if(sNumber.charAt(k) != sNumber.charAt(sNumber.length()-k-1))
					{
						isPalindrome = false;
					}
				}
				
				if(isPalindrome && BiggestPalindrome < Number)
				{
					BiggestPalindrome = Number;
				}
			}
		}
		
		System.out.println(BiggestPalindrome);
	}
}
