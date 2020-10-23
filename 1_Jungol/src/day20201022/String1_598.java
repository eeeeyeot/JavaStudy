package day20201022;

import java.util.Scanner;

public class String1_598
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char c;
		
		while(true) {
			c = sc.next().charAt(0);
			
			if((c >= 48 && c <= 57)) {
				System.out.printf("%d\n", (int)c);
			}
			else if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				System.out.printf("%c\n", c);
			}
			else
				break;
		
		}
		sc.close();
	}
}
