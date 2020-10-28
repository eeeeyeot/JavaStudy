package day20201028;

import java.util.Scanner;

public class Array2_167
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][2];
		int totalSum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
				totalSum += arr[i][j];
			}
			System.out.print((sum / 2) + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 2; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += arr[j][i];
			}
			System.out.print((sum / 4) + " ");
		}
		System.out.println();
		System.out.println(totalSum/8);
		
		sc.close();
	}
}
