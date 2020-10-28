package day20201028;

import java.util.Scanner;

public class Array2_161
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		int n;
		while(true) {
			if((n = sc.nextInt()) == 0)
				break;
			
			arr[n/10]++;
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] != 0)
				System.out.println((i * 10) + " : " + arr[i] + " person");
		}
		
		sc.close();
	}
}
