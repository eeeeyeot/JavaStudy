package day20201028;

import java.util.Scanner;

public class Array2_160
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		
		for(int i = 0; i < 10; i++) {
			arr[sc.nextInt() - 1]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + " : " + arr[i]);
		}
		
		sc.close();
	}
}
