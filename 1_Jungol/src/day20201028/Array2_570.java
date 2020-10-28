package day20201028;

import java.util.Scanner;

public class Array2_570
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[0][i] = 1;
			System.out.print(arr[0][i] + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0) {
					arr[i][j] = arr[i - 1][j];
				}
				else {
					arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
				}
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
