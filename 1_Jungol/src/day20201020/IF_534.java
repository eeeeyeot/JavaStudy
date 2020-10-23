package day20201020;

import java.util.Scanner;

public class IF_534
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char n = sc.next().trim().charAt(0);
		
		switch(n)
		{
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Usually");
				break;
			case 'D':
				System.out.println("Effort");
				break;
			case 'F':
				System.out.println("Failure");
				break;
			default:
				System.out.println("error");
				break;
		}
		
		sc.close();
	}
}
