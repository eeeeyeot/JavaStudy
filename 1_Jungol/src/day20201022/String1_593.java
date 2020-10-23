package day20201022;

import java.util.Scanner;

public class String1_593
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("ASCII code =? ");
			n = sc.nextInt();
			if(n > 127 || n < 33)
				break;
			
			System.out.println((char)n);
		}
		
		sc.close();
	}
}
