package com.drakfox.probl�mes;

public class Probl�me___5 {
	
	public Probl�me___5()
	{
		boolean search =  true;
		int iterator = 0;
		while(search)
		{
			iterator++;
			boolean valide = true;
			for(double j = 1; j <= 20 && valide; j++)
			{	
				if(Double.compare((iterator/j), Math.floor((iterator/j))) == 1)
				{
					valide = false;
				}
			}
			
			
			if(valide)
			{
				search = false;
				System.out.println(iterator);
			}
		}
	}
}

