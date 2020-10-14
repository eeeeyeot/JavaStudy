package day20201008;

import java.util.Scanner;

public class APlusB4_10950
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println(num1 + num2);
		}
		
		sc.close();
	}
}
