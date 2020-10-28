package day20201028;

import java.util.Scanner;

public class Array2_169
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[3][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next().charAt(0);
				arr[i][j] += 'a' - 'A';
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
