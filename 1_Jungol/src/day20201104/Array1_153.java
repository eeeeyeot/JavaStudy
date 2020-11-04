package day20201104;

import java.io.*;

public class Array1_153
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[100];
		String[] input = br.readLine().split(" ");
		
		for(int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		int cnt = input.length - 1;
		
		for(int i = cnt - 3; i < cnt; i++) {
			if(i < 0) continue;
			System.out.print(arr[i] + " ");
		}
	}
}