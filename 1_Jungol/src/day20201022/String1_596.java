package day20201022;

import java.util.Scanner;

public class String1_596
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = sc.nextInt();
		if(str.length() < n) {
			n = str.length();
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.print(str.charAt(str.length() - i));
		}
		sc.close();
	}
}
