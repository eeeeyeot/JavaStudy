package day20201019;

import java.util.Scanner;

public class IF_123
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
		int n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.println("dog");
				break;
			case 2:
				System.out.println("cat");
				break;
			case 3:
				System.out.println("chick");
				break;
			default:
				System.out.println("I don't know.");
				break;
		}
		
		sc.close();
	}
}
