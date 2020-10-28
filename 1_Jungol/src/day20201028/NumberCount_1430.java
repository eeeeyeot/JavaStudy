package day20201028;

import java.util.Scanner;

public class NumberCount_1430
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int value = sc.nextInt() * sc.nextInt() * sc.nextInt();
		
		while(value != 0) {
			arr[value % 10]++;
			value /= 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}
