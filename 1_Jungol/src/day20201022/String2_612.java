package day20201022;

import java.util.Scanner;

public class String2_612
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		for(int i = 0; i < 5; i++) {
			str += sc.next();
		}
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if((i + 1) % 3 == 0)
				System.out.println();
		}
		
		sc.close();
	}
}
