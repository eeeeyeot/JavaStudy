package day20201012;

import java.util.Scanner;

public class Function1_573
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		printSquare(sc.nextInt());
		
		sc.close();
	}
	
	static void printSquare(int n) {
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
			{
				System.out.print(++cnt + " ");
			}
			System.out.println();
		}
	}
}
