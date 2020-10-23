package day20201022;

import java.util.Scanner;

public class String2_604
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[10];
		
		for(int i = 0; i < 10; i++) {
			str[i] = sc.next();
		}
		char c = sc.next().charAt(0);
		
		for(String s : str) {
			if(s.charAt(s.length() - 1) == c) {
				System.out.println(s);
			}
		}
		
		sc.close();
	}
}
