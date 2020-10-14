package kr.co.green;

import java.util.Scanner;

public class R2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int r1 = 0, s = 0;
		
		r1 = sc.nextInt();
		s = sc.nextInt();
		
		if((r1 <= 1000 && r1 >= -1000) && (s <= 1000 && s >= -1000)) 
		{
			System.out.println(s * 2 - r1);
		}
		
		sc.close();
	}
}