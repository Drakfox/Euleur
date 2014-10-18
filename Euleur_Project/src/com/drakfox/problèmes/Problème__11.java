package com.drakfox.problèmes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problème__11 {
	
	public static ArrayList<String> scannerList = new ArrayList<String>();
	public static String series = new String();
	
	public static int HEIGHT = 20;
	public static int WIDTH = 20;
	
	public static int BiggestProduct = 1;
	
	public static int[][] grid = new int[WIDTH][HEIGHT];

	public Problème__11()
	{
		FileInputStream fin;
		try {
			fin = new FileInputStream(new File("res/Problème__11/list.txt"));
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
		
		for(int i = 0; i < series.length()/2; i++)
		{
			grid[i - (int)(i/WIDTH)*WIDTH][(int)(i/WIDTH)] = Integer.parseInt(series.substring(i*2, (i*2)+2));
		}
		
		findProduct();
		
		System.out.println(BiggestProduct);
		
	}
	
	public static void compareBiggestProduct(int product)
	{
		if (product > BiggestProduct)
		{
			BiggestProduct = product;
		}
	}
	
	public static void findProduct()
	{
		for(int x = 0; x < WIDTH; x++)
		{
			for(int y = 0; y < HEIGHT; y++)
			{
				if( x > 4) 
				{
					compareBiggestProduct(grid[x][y] * grid[x-1][y] * grid[x-2][y] * grid[x-3][y]);
				}
				
				if( x < WIDTH-4)
				{
					compareBiggestProduct(grid[x][y] * grid[x+1][y] * grid[x+2][y] * grid[x+3][y]);
				}
				
				if( y > 4 )
				{
					if( x > 4) 
					{
						compareBiggestProduct(grid[x][y] * grid[x-1][y-1] * grid[x-2][y-2] * grid[x-3][y-3]);
					}
					
					if( x < WIDTH-4)
					{
						compareBiggestProduct(grid[x][y] * grid[x+1][y-1] * grid[x+2][y-2] * grid[x+3][y-3]);
					}
					
					compareBiggestProduct(grid[x][y] * grid[x][y-1] * grid[x][y-2] * grid[x][y-3]);
					
				}
				
				if( y < HEIGHT-4)
				{
					if( x > 4) 
					{
						compareBiggestProduct(grid[x][y] * grid[x-1][y+1] * grid[x-2][y+2] * grid[x-3][y+3]);
					}
					
					if( x < WIDTH-4)
					{
						compareBiggestProduct(grid[x][y] * grid[x+1][y+1] * grid[x+2][y+2] * grid[x+3][y+3]);
					}
					
					compareBiggestProduct(grid[x][y] * grid[x][y+1] * grid[x][y+2] * grid[x][y+3]);
				}
			}
		}
	}
}
