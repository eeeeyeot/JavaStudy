package day20201028;

import java.util.Scanner;

public class Array2_164
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			System.out.print((i + 1) + "class? ");
			for(int j = 0; j < 3; j++) {
				sum += sc.nextInt();
			}
			arr[i] = sum;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "class : " + arr[i]);
		}
			
		sc.close();
	}
}
