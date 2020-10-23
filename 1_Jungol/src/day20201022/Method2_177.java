package day20201022;

import java.util.Scanner;

public class Method2_177
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += Math.abs(arr[i]);
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
