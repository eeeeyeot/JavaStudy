package day20201022;

import java.util.Scanner;

public class String1_185
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String c = sc.next();
		
		if(str.contains(c)) {
			System.out.println(str.indexOf(c));
		}
		else
			System.out.println("No");
		
		sc.close();
	}
}
