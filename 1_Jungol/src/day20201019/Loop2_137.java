package day20201019;

import java.util.Scanner;

public class Loop2_137
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < m * i; j += i) {
				System.out.print(j + i + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
