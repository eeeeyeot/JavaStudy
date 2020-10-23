package day20201022;

import java.util.Scanner;

public class Method2_180
{
	static int[] arr = new int[7];
	
	public static void main(String[] args)
	{
		input();
		sortArr();
		print();
	}
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	static void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void sortArr() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1])
				{
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
