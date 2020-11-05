package day20201105;

import java.io.*;

public class Thirty_10610
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		int[] arr = new int[10];
		
		for(int i = 0; i < str.length; i++) {
			arr[Integer.parseInt(str[i])]++;
		}
		
		if(arr[0] == 0 || getSum(arr) % 3 != 0)
			System.out.println(-1);
		else {
			for(int i = arr.length - 1; i >= 0; i--) {
				for(int j = 0; j < arr[i]; j++) {
					System.out.print(i);
				}
			}
		}
		
	}
	
	static int getSum(int[] arr) {
		int sum = 0;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i]; j++) {
				sum += i;
			}
		}
		return sum;
	}
}