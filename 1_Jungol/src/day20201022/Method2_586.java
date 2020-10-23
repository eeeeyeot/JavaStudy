package day20201022;

import java.util.Scanner;

public class Method2_586
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("(" + num1 + " - " + num2 + ")" + " ^ 2 = "
				+ ((num1 - num2) * (num1 - num2)));
		System.out.println("(" + num1 + " + " + num2 + ")" + " ^ 3 = "
				+ ((num1 + num2) * (num1 + num2) * (num1 + num2)));
		
		sc.close();
	}
}
