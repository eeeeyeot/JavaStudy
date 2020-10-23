package day20201019;

import java.util.Scanner;

public class Loop_125
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print(i + 1 + " ");
		}
		
		sc.close();
	}
}
