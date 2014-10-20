package com.drakfox.problèmes;

import java.util.HashMap;

public class Problème__17 {
	
	public static HashMap<Integer, String> mots = new HashMap<>();
	public static String word = "";
	
	public Problème__17()
	{
		intialialize();
		
		for(int i = 1; i <= 1000; i++)
		{
			word = word + concatWordNumber(i);
		}
		
		
		word = word.trim();
		
		System.out.println(word);
		System.out.println(word.length());
		
	}
	
	
	public static String concatWordNumber(int nombre)
	{
		
		String mot = "";
		
		if(nombre >= 10000)
		{
			System.out.println("Cannot calculcate number bigger to 10000");
			System.exit(0);
		}
		if(nombre <= 10000 && nombre > 0)
		{
			String motMillier = "";
			String motCentaine = "";
			String motDizaine = "";
			String motUnité = "";
			
			int millier = (int) ((Math.floor(nombre/1000)));
			int centaine = (int) ((Math.floor((nombre-(millier*1000))/100)));
			int dizaine = (int) ((Math.floor((nombre-(millier*1000)-(centaine*100))/10))*10);
			int unité = nombre - millier*1000 - centaine*100 - dizaine;
			
			if(millier > 0)
			{
				motMillier = mots.get(millier) + mots.get(1000);
			}
			if(centaine > 0)
			{
				motCentaine = mots.get(centaine) + mots.get(100);
				if(dizaine != 0 || unité != 0)
				{
					motDizaine = "and";
				}
			}
			if(dizaine >= 20)
			{
				motDizaine = motDizaine + mots.get(dizaine);
			}
			else if(dizaine > 0)
			{
				unité = dizaine + unité;
			}
			if(unité > 0){

				motUnité = mots.get(unité);
			}
			
			mot = motMillier +""+ motCentaine +""+ motDizaine +""+ motUnité;
		}
		
		return mot;
	}
	
	public static void intialialize()
	{
		mots.put(1, "one");
		mots.put(2, "two");
		mots.put(3, "three");
		mots.put(4, "four");
		mots.put(5, "five");
		mots.put(6, "six");
		mots.put(7, "seven");
		mots.put(8, "eight");
		mots.put(9, "nine");
		mots.put(10, "ten");
		mots.put(11, "eleven");
		mots.put(12, "twelve");
		mots.put(13, "thirteen");
		mots.put(14, "fourteen");
		mots.put(15, "fifteen");
		mots.put(16, "sixteen");
		mots.put(17, "seventeen");
		mots.put(18, "eighteen");
		mots.put(19, "nineteen");
		mots.put(20, "twenty");
		mots.put(30, "thirty");
		mots.put(40, "forty");
		mots.put(50, "fifty");
		mots.put(60, "sixty");
		mots.put(70, "seventy");
		mots.put(80, "eighty");
		mots.put(90, "ninety");
		mots.put(100, "hundred");
		mots.put(1000, "thousand");
	}

}
