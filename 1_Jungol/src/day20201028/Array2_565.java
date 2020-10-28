package day20201028;

import java.util.Scanner;

public class Array2_565
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int[] arr = new int[10];
		
		while (true) {
			if((n = sc.nextInt()) == 0)
				break;
			arr[n / 10]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0)
				System.out.println(i + " : " + arr[i]);
		}
		
		sc.close();
	}
}
