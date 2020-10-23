package day20201020;

import java.util.Scanner;

public class Loop3_554
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int numCnt = 1, alphaCnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n + 1; j++) {
				if(n - i  <= j) {
					System.out.print((char)('A' + alphaCnt++) + " ");
				}
				else
					System.out.print(numCnt++ + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	
	}
}