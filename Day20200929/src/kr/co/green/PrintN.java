package kr.co.green;

import java.util.Scanner;

public class PrintN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n >= 0 && n <= 100000) {
			for(int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
