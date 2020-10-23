package day20201021;

import java.io.*;

public class Method3_234
{
	static int[] arr;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		System.out.println(func(n));
	}
	
	static int func(int n) {
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i - 1] * arr[i - 2]) % 100;
		}
		
		return arr[n-1];
	}
	
	//time limit exceed
	/*
	 * static int func(int n) {
	 * if(n <= 1) {
	 * return 1;
	 * }
	 * else if(n == 2) {
	 * return 2;
	 * }
	 * return func(n - 1) * func(n - 2) % 100;
	 * }
	 */
}
