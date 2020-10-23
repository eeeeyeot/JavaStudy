package day20201023;

import java.util.Scanner;

public class String2_608
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(str.contains("c") ? "Yes" : "No");
		System.out.println(str.contains("ab") ? "Yes" : "No");
		
		sc.close();
	}
}
