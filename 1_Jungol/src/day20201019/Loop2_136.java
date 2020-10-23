package day20201019;

import java.util.Scanner;

public class Loop2_136
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(n * (i + 1) + " ");
		}
		
		
		sc.close();
	}
}
