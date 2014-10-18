package com.drakfox.problèmes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problème__13 {
	
	
	public static ArrayList<String> scannerList = new ArrayList<String>();
	public static String series = new String();
	
	public static int listSize = 100;
	public static int lineSize = 50;
	public static int workoutLength = 10;
	public static int ErrorFactor = 7;
	
	public static Long Sumation = 0L;
	
	public static String[] list = new String[listSize];
	
	public Problème__13()
	{
		FileInputStream fin;
		try {
			fin = new FileInputStream(new File("res/Problème__13/list.txt"));
		    Scanner scanner = new Scanner(fin);
		    while(scanner.hasNext())
		    {
		    	scannerList.add(scanner.next());
		    }
		    scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < scannerList.size(); i++)
		{
			series = series.concat(scannerList.get(i));
		}
		
		for(int i = 0; i < listSize; i++)
		{
			int indexStart = lineSize*i;
			int indexEnd = (lineSize*i) + workoutLength + ErrorFactor;
			
			list[i] = series.substring(indexStart, indexEnd);
				
			Sumation = Sumation + Long.parseLong(list[i]);
		}
		
		String Sum = String.valueOf(Sumation);
		String FirstTen = Sum.substring(0, workoutLength);
		
		System.out.println(series.substring(0,50));
		System.out.println(series.substring(50,100));
		System.out.println(list[0]);
		System.out.println(list[1]);
		
		
		System.out.println(Sum);
		System.out.println(FirstTen);
	}
}