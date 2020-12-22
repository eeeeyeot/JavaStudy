package day20201221;

import java.io.*;

public class SelectSort_1146 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		initialize(arr, br.readLine());
		
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			boolean hasMin = false;
			
			for(int j = i ; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
					hasMin = true;
				}
			}
			
			if(hasMin)
			{
				int tmp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = tmp;
			}
			
			print(arr);
		}
	}
	
	static void initialize(int[] arr, String str) {
		String[] input = str.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
	}
	
	static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}