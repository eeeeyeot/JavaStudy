package day20201022;

import java.util.Scanner;

public class String1_594
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		s += s;
		
		System.out.println(s);
		
		sc.close();
	}
}
