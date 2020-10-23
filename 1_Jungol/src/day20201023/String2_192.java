package day20201023;

import java.util.Scanner;

public class String2_192
{
	static int n;
	static String[] arr;
	
	public static void main(String[] args)
	{
		input();
		sortArray(arr);
		print(arr);
	}
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
	}
	
	static void sortArray(String[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	static void print(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
