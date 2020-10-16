package day20201016;

import java.util.Scanner;

public class Dial_5622
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char[][] dial = {
				{},
				{'A','B','C'},
				{'D','E','F'},
				{'G','H','I'},
				{'J','K','L'},
				{'M','N','O'},
				{'P','Q','R','S'},
				{'T','U','V'},
				{'W','X','Y','Z'}
		};
		
		String[] str = sc.next().trim().split("");
		int sum = 0;
		for(int i = 0; i < str.length; i++) 
		{
			for(int j = 0; j < dial.length; j++)
			{
				boolean isFound = false;
				for(int k = 0; k < dial[j].length; k++) 
				{
					if(str[i].charAt(0) == dial[j][k]){
						sum += j + 2;
						isFound = true;
						break;
					}
				}
				
				if(isFound)
					break;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
