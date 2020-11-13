package day20201113;

import java.io.*;

public class DivisorMultiple_1071
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] inp = br.readLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(inp[i]);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		int divisorSum = 0;
		int multipleSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(m % arr[i] == 0)
				divisorSum += arr[i];
			
			if(arr[i] % m == 0)
				multipleSum += arr[i];
		}
		
		System.out.println(divisorSum);
		System.out.println(multipleSum);
		
	}
}
