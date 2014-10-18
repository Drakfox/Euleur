package com.drakfox.problèmes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problème___8 {
	
	public ArrayList<String> scannerList = new ArrayList<String>();
	
	public String series = "";
	public String[] seriesArray;
	
	public int CalcLength = 13;
	
	public Long BiggestProduct = 1L;
	
	public Problème___8()
	{
		
		FileInputStream fin;
		try {
			fin = new FileInputStream(new File("src/list.txt"));
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
		
		for(int i = 0; i <= series.length()-CalcLength; i++)
		{
			Long Product = 1L;
			
			for(int j = 0; j < CalcLength; j++)
			{
				Product = Product * Integer.parseInt(series.substring(i+j,i+j+1));
			}

			if(BiggestProduct <= Product)
			{
				BiggestProduct = Product;
			}
		}
		
		System.out.println(BiggestProduct);
		
	}
}
