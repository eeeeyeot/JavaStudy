package kr.co.green;

import java.util.Scanner;

public class ReversePrintN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n >= 0 && n <= 100000) {
			for(int i = n; i > 0; i--) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
