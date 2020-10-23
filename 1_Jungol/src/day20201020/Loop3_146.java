package day20201020;

import java.util.Scanner;

public class Loop3_146
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numCnt = 0;
		int alphaCnt = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(n - i <= j)
					System.out.print(numCnt++ + " ");
				else
					System.out.print((char)('A' + alphaCnt++) + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
