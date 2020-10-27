package day20201027;

import java.util.Scanner;

public class StarTriangle3_1329
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		if((n < 1 || n > 100) || n % 2 == 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		int[] arr = new int[50];
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			while(true) {
				if(++cnt % 2 != 0) {
					arr[i] = cnt;
					break;
				}
			}
		}
		
		int value = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < value + arr[value]; j++) {
				if(j >= value)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
			if(i >= n / 2) value--;
			else value++;
		}
	}
}
